package com.csclub.chess

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RookTests {
    @Test
    fun rookTest() {
        val board = makeEmptyBoard()
        val whiteRook = Rook(Player.WHITE)
        val blackRook = Rook(Player.BLACK)
        board[1][4] = whiteRook
        board[6][4] = blackRook
        assert(whiteRook.isLegalMove(board, ChessSquare(2, 4)))
        assert(whiteRook.isLegalMove(board, ChessSquare(3, 4)))
        assert(whiteRook.isLegalMove(board, ChessSquare(6, 4)))
        assert(whiteRook.isLegalMove(board, ChessSquare(0, 4)))
        assert(whiteRook.isLegalMove(board, ChessSquare(1, 5)))
        assert(whiteRook.isLegalMove(board, ChessSquare(1, 7)))
        assert(whiteRook.isLegalMove(board, ChessSquare(1, 3)))
        assert(whiteRook.isLegalMove(board, ChessSquare(1, 1)))
        assert(!whiteRook.isLegalMove(board, ChessSquare(2, 5)))
        assert(!whiteRook.isLegalMove(board, ChessSquare(7, 4)))
        assert(!whiteRook.isLegalMove(board, ChessSquare(3, 3)))

        assert(blackRook.isLegalMove(board, ChessSquare(5, 4)))
        assert(blackRook.isLegalMove(board, ChessSquare(4, 4)))
        assert(blackRook.isLegalMove(board, ChessSquare(1, 4)))
        assert(blackRook.isLegalMove(board, ChessSquare(7, 4)))
        assert(blackRook.isLegalMove(board, ChessSquare(6, 5)))
        assert(blackRook.isLegalMove(board, ChessSquare(6, 7)))
        assert(blackRook.isLegalMove(board, ChessSquare(6, 3)))
        assert(blackRook.isLegalMove(board, ChessSquare(6, 1)))
        assert(!blackRook.isLegalMove(board, ChessSquare(5, 5)))
        assert(!blackRook.isLegalMove(board, ChessSquare(0, 4)))
        assert(!blackRook.isLegalMove(board, ChessSquare(4, 3)))
    }
}