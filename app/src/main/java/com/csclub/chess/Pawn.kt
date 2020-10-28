package com.csclub.chess

class Pawn(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Pawn could move from 'from' to 'to' on an empty board
        // A pawn can move forward one square always, one square forward and one to the side to capture,
        // or two squares if it is the pawn's first move
        // Hint: Remember that the direction of "forward" depends on which player's pawn it is
        return true
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
        return false
    }
}