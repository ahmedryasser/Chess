package com.csclub.chess

class ChessGameModel {
    val board = MutableList(BOARD_SIZE) { MutableList<ChessPiece?>(BOARD_SIZE) { null } }
    val capturedWhitePieces = mutableListOf<ChessPiece>()
    val capturedBlackPieces = mutableListOf<ChessPiece>()
}