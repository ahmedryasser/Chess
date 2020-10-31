package com.csclub.chess

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KingTests {
    @Test
    fun pawnTest() {
        val board = makeEmptyBoard()
        val whiteKing = King(Player.WHITE)
        val blackKing = King(Player.BLACK)
        board[1][4] = whiteKing
        board[6][4] = blackKing
        assert(whiteKing.isLegalMove(board, ChessSquare(2, 4)))
        assert(whiteKing.isLegalMove(board, ChessSquare(2, 5)))
        assert(whiteKing.isLegalMove(board, ChessSquare(1, 5)))
        assert(whiteKing.isLegalMove(board, ChessSquare(0, 5)))
        assert(whiteKing.isLegalMove(board, ChessSquare(0, 4)))
        assert(whiteKing.isLegalMove(board, ChessSquare(0, 3)))
        assert(whiteKing.isLegalMove(board, ChessSquare(1, 3)))
        assert(whiteKing.isLegalMove(board, ChessSquare(2, 3)))
        assert(!whiteKing.isLegalMove(board, ChessSquare(4, 3)))
        assert(!whiteKing.isLegalMove(board, ChessSquare(1, 6)))
        assert(!whiteKing.isLegalMove(board, ChessSquare(2, 2)))
        assert(!whiteKing.isLegalMove(board, ChessSquare(1, 0)))

        assert(blackKing.isLegalMove(board, ChessSquare(5, 4)))
        assert(blackKing.isLegalMove(board, ChessSquare(5, 5)))
        assert(blackKing.isLegalMove(board, ChessSquare(6, 5)))
        assert(blackKing.isLegalMove(board, ChessSquare(7, 5)))
        assert(blackKing.isLegalMove(board, ChessSquare(7, 4)))
        assert(blackKing.isLegalMove(board, ChessSquare(7, 3)))
        assert(blackKing.isLegalMove(board, ChessSquare(6, 3)))
        assert(blackKing.isLegalMove(board, ChessSquare(5, 3)))
        assert(!blackKing.isLegalMove(board, ChessSquare(3, 3)))
        assert(!blackKing.isLegalMove(board, ChessSquare(6, 6)))
        assert(!blackKing.isLegalMove(board, ChessSquare(5, 2)))
        assert(!blackKing.isLegalMove(board, ChessSquare(6, 0)))

        board[1][5] = Pawn(Player.BLACK)
        assert(whiteKing.isLegalMove(board, ChessSquare(1, 5)))
        assert(!whiteKing.isLegalMove(board, ChessSquare(1, 6)))

        board[1][5] = Pawn(Player.WHITE)
        assert(!whiteKing.isLegalMove(board, ChessSquare(1, 5)))
        assert(!whiteKing.isLegalMove(board, ChessSquare(1, 6)))
    }
}