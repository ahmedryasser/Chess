package com.csclub.chess

import kotlin.math.abs

class Pawn(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Pawn could move from 'from' to 'to' on an empty board
        // A pawn can move forward one square always, one square forward and one to the side to capture,
        // or two squares if it is the pawn's first move
        // Hint: Remember that the direction of "forward" depends on which player's pawn it is
        val forward = if (player == Player.WHITE) 1 else -1
        val rankDiff = to.rank - from.rank
        val fileDiff = to.file - from.file
        return when {
            rankDiff == forward && fileDiff == 0 -> true
            rankDiff == 2 * forward && !hasMoved && fileDiff == 0 -> true
            rankDiff == forward && board[to.rank][to.file]?.player != player && board[to.rank][to.file]?.player != null && abs(fileDiff) == 1 -> true
            else -> false
        }
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
        val rankDiff = to.rank - from.rank
        val fileDiff = to.file - from.file
        return when {
            abs(rankDiff) == 2 && board[from.rank + rankDiff / 2][from.file] != null -> true
            abs(rankDiff) == 1 && fileDiff == 0 && board[to.rank][to.file] != null -> true
            else -> board[to.rank][to.file]?.player == player
        }
    }
}