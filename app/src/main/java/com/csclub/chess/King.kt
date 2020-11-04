package com.csclub.chess

import kotlin.math.abs

class King(override val player: Player) : ChessPiece() {
    override fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if the King could move from 'from' to 'to' on an empty board
        // A king can move to any adjacent square
        return abs(from.rank - to.rank) < 2 && abs(from.file - to.file) < 2 && abs(to.rank - from.rank) + abs(to.file - from.file) != 0
    }

    override fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean {
        // Returns true if there are pieces between 'from' (exclusive) and 'to' (inclusive)
        // that would prevent the piece from moving there, or false otherwise
        return board[to.rank][to.file]?.player == player
    }
}