package com.csclub.chess

class Bishop(override val player: Player) : ChessPiece(player) {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Bishop could move from 'from' to 'to' on an empty board
        // A bishop can move along one of the diagonals
        return true
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
        return false
    }
}