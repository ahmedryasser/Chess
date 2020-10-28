package com.csclub.chess

data class ChessSquare(val rank: Int, val file: Int) {
    fun isOnBoard(): Boolean = rank in 0 until BOARD_SIZE && file in 0 until BOARD_SIZE
}