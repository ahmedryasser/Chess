package com.csclub.chess

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class BishopTests {
    @Test
    fun bishopTest() {
        val board = makeEmptyBoard()
        val whiteBishop = Bishop(Player.WHITE)
        val blackBishop = Bishop(Player.BLACK)
        board[1][4] = whiteBishop
        board[6][4] = blackBishop
        assert(whiteBishop.isLegalMove(board, ChessSquare(2, 5)))
        assert(whiteBishop.isLegalMove(board, ChessSquare(3, 6)))
        assert(whiteBishop.isLegalMove(board, ChessSquare(2, 3)))
        assert(whiteBishop.isLegalMove(board, ChessSquare(3, 2)))
        assert(whiteBishop.isLegalMove(board, ChessSquare(0, 3)))
        assert(whiteBishop.isLegalMove(board, ChessSquare(0, 5)))
        assert(!whiteBishop.isLegalMove(board, ChessSquare(2, 4)))
        assert(!whiteBishop.isLegalMove(board, ChessSquare(6, 4)))
        assert(!whiteBishop.isLegalMove(board, ChessSquare(5, 1)))

        assert(blackBishop.isLegalMove(board, ChessSquare(5, 5)))
        assert(blackBishop.isLegalMove(board, ChessSquare(4, 6)))
        assert(blackBishop.isLegalMove(board, ChessSquare(5, 3)))
        assert(blackBishop.isLegalMove(board, ChessSquare(4, 2)))
        assert(blackBishop.isLegalMove(board, ChessSquare(7, 3)))
        assert(blackBishop.isLegalMove(board, ChessSquare(7, 5)))
        assert(!blackBishop.isLegalMove(board, ChessSquare(5, 4)))
        assert(!blackBishop.isLegalMove(board, ChessSquare(1, 4)))
        assert(!blackBishop.isLegalMove(board, ChessSquare(2, 1)))

        board[3][6] = Pawn(Player.BLACK)
        assert(whiteBishop.isLegalMove(board, ChessSquare(3, 6)))
        assert(!whiteBishop.isLegalMove(board, ChessSquare(4, 7)))

        board[3][6] = Pawn(Player.WHITE)
        assert(!whiteBishop.isLegalMove(board, ChessSquare(3, 6)))
        assert(!whiteBishop.isLegalMove(board, ChessSquare(4, 7)))
    }
}