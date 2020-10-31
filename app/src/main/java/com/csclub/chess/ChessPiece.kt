package com.csclub.chess

abstract class ChessPiece {
    abstract val player: Player
    var hasMoved = false

    fun isLegalMove(board: ChessBoard, to: ChessSquare): Boolean {
        val rank = board.indexOfFirst { it.contains(this) }
        val file = board[rank].indexOf(this)
        val from = ChessSquare(rank, file)
        return from.isOnBoard()
               && to.isOnBoard()
               && from != to
               && obeysMovementRules(board, from, to)
               && !arePiecesInWay(board, from, to)
               && !board.wouldPutKingInCheck(from, to, player)
    }

    protected abstract fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean

    protected abstract fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean
}