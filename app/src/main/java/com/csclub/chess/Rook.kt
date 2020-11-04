package com.csclub.chess

import kotlin.math.abs
import kotlin.math.max

class Rook(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Rook could move from 'from' to 'to' on an empty board
        // A rook can move to any square on the same rank or file
        return from.rank == to.rank || from.file == to.file
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        val numTiles = max(abs(from.rank - to.rank), abs(from.file - to.file))
        val rankDiff = to.rank - from.rank
        val fileDiff = to.file - from.file
        val rankSign = if (rankDiff == 0) 0 else rankDiff / abs(rankDiff)
        val fileSign = if (fileDiff == 0) 0 else fileDiff / abs(fileDiff)
        for (i in 1 until numTiles) {
            if (board[from.rank + i * rankSign][from.file + i * fileSign] != null ) {
                return true
            }
        }
        return board[to.rank][to.file]?.player == player
        // that would prevent the piece from moving there, or false otherwise
    }
}