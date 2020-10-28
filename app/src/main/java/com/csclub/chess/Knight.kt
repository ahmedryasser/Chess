package com.csclub.chess

class Knight(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Knight could move from 'from' to 'to' on an empty board
        // A knight can move in a "knight's-move" pattern; two squares along either the rank or file, and then one perpendicular to those two
        return true
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
        return false
    }
}