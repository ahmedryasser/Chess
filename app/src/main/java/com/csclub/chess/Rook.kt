package com.csclub.chess

class Rook(override val player: Player) : ChessPiece(player) {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Rook could move from 'from' to 'to' on an empty board
        // A rook can move to any square on the same rank or file
        return true
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
        return false
    }
}