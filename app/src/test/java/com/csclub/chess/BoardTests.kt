package com.csclub.chess

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class BoardTests {
    @Test
    fun chessBoardIndicesOfTest() {
        val board: ChessBoard = listOf()
        assertNull(board.indicesOf<ChessPiece>(Player.BLACK).firstOrNull())
        val board2: MutableChessBoard =
            MutableList(BOARD_SIZE) { MutableList<ChessPiece?>(BOARD_SIZE) { null } }
        board2[0][3] = Queen(Player.WHITE)
        board2[0][4] = King(Player.WHITE)
        board2[7][3] = Queen(Player.BLACK)
        board2[7][4] = King(Player.BLACK)
        val whiteQueens = board2.indicesOf<Queen>(Player.WHITE)
        assert(whiteQueens.size == 1)
        assert(whiteQueens[0] == ChessSquare(0, 3))
        val blackPieces = board2.indicesOf<ChessPiece>(Player.BLACK)
        assert(blackPieces.size == 2)
        assert(blackPieces.contains(ChessSquare(7, 3)))
        assert(blackPieces.contains(ChessSquare(7, 4)))
    }
}