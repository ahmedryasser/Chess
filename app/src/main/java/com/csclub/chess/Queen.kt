package com.csclub.chess

import kotlin.math.abs
import kotlin.math.max

class Queen(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        val rankDiff = to.rank - from.rank
        val fileDiff = to.file - from.file
        return when {
            rankDiff == -fileDiff -> true
            rankDiff == fileDiff -> true
            rankDiff == 0 && fileDiff != 0 -> true
            rankDiff != 0 && fileDiff == 0 -> true
            else -> false
        }
        // Returns true if the Queen could move from 'from' to 'to' on an empty board
        // A queen can move to any square on the same rank or file, or along one of the diagonals
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        val numTiles = max(abs(from.rank - to.rank), abs(from.file - to.file))
        val rankDiff = to.rank - from.rank
        val fileDiff = to.file - from.file
        val rankSign = if (rankDiff == 0) 0 else rankDiff / abs(rankDiff)
        val fileSign = if (fileDiff == 0) 0 else fileDiff / abs(fileDiff)
        for (i in 1 until numTiles) {
            if (board[from.rank + i * rankSign][from.file + i * fileSign] != null) {
                return true
            }
        }
        // Treat to square
        return board[to.rank][to.file]?.player == player
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
    }
}
