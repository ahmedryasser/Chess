package com.csclub.chess

abstract class ChessPiece(open val player: Player) {
    var hasMoved = false

    fun isLegalMove(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean =
        from.isOnBoard()
        && to.isOnBoard()
        && from != to
        && obeysMovementRules(board, from, to)
        && !arePiecesInWay(board, from, to)
        && !board.wouldPutKingInCheck(from, to, player)

    protected abstract fun obeysMovementRules(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean

    protected abstract fun arePiecesInWay(board: ChessBoard, from: ChessSquare, to: ChessSquare): Boolean
}