package com.csclub.chess

import kotlin.math.abs

class Knight(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Knight could move from 'from' to 'to' on an empty board
        // A knight can move in a "knight's-move" pattern; two squares along either the rank or file, and then one perpendicular to those two
        val rankDiff = abs(from.rank - to.rank)
        val fileDiff = abs(from.file - to.file)
        return (rankDiff == 2 && fileDiff == 1) || (rankDiff == 1 && fileDiff == 2)
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
        return board[to.rank][to.file]?.player == player
    }
}