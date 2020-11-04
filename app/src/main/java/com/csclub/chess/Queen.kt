package com.csclub.chess

import kotlin.math.abs

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
        val rankDiff = to.rank - from.rank
        val fileDiff = to.file - from.file
        for ()
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
    }
}
