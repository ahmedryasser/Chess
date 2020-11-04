package com.csclub.chess

class Rook(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the Rook could move from 'from' to 'to' on an empty board
        if (isLegalMove()||(from.rank == to.rank || from.file == to.file)) {
            return true
        }
        // A rook can move to any square on the same rank or file

    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        for ((i, file) in from.rank +1 .. to.rank ) {
            for ((rank, j) in from.file+1..to.file ) {
                if (board[i][j] == ChessPiece.ChessSquare(rank, file) ) {
                    return true
                }
            }
        }
        // that would prevent the piece from moving there, or false otherwise
        return false
    }
}