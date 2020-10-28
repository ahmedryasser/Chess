package com.csclub.chess

const val BOARD_SIZE = 8
typealias ChessBoard = List<List<ChessPiece?>>
typealias MutableChessBoard = MutableList<MutableList<ChessPiece?>>

fun makeEmptyBoard(): MutableChessBoard = MutableList(BOARD_SIZE) { MutableList(BOARD_SIZE) { null } }

inline fun <reified T : ChessPiece> ChessBoard.indicesOf(player: Player): List<ChessSquare> {
    val indices = mutableListOf<ChessSquare>()
    for ((i, file) in this.withIndex()) {
        for ((j, piece) in file.withIndex()) {
            if (piece is T && piece.player == player) {
                indices.add(ChessSquare(i, j))
            }
        }
    }
    return indices
}

fun ChessBoard.isEmptyOrCapturable(square: ChessSquare, player: Player): Boolean {
    // TODO

    return true
}

fun ChessBoard.wouldPutKingInCheck(from: ChessSquare, to: ChessSquare, player: Player): Boolean {
    // TODO
    // Returns true if, after moving the piece from 'from' to 'to', the opposite player could capture player's king
    return false
}