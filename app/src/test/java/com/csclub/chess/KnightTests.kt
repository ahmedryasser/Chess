package com.csclub.chess

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KnightTests {
    @Test
    fun knightTest() {
        val board = makeEmptyBoard()
        val whiteKnight = Knight(Player.WHITE)
        val blackKnight = Knight(Player.BLACK)
        board[2][4] = whiteKnight
        board[5][4] = blackKnight
        assert(whiteKnight.isLegalMove(board, ChessSquare(4, 5)))
        assert(whiteKnight.isLegalMove(board, ChessSquare(3, 6)))
        assert(whiteKnight.isLegalMove(board, ChessSquare(1, 6)))
        assert(whiteKnight.isLegalMove(board, ChessSquare(0, 5)))
        assert(whiteKnight.isLegalMove(board, ChessSquare(0, 3)))
        assert(whiteKnight.isLegalMove(board, ChessSquare(1, 2)))
        assert(whiteKnight.isLegalMove(board, ChessSquare(3, 2)))
        assert(whiteKnight.isLegalMove(board, ChessSquare(4, 3)))
        assert(!whiteKnight.isLegalMove(board, ChessSquare(2, 7)))
        assert(!whiteKnight.isLegalMove(board, ChessSquare(5, 4)))
        assert(!whiteKnight.isLegalMove(board, ChessSquare(4, 4)))
        assert(!whiteKnight.isLegalMove(board, ChessSquare(5, 7)))

        assert(blackKnight.isLegalMove(board, ChessSquare(3, 5)))
        assert(blackKnight.isLegalMove(board, ChessSquare(4, 6)))
        assert(blackKnight.isLegalMove(board, ChessSquare(6, 6)))
        assert(blackKnight.isLegalMove(board, ChessSquare(7, 5)))
        assert(blackKnight.isLegalMove(board, ChessSquare(7, 3)))
        assert(blackKnight.isLegalMove(board, ChessSquare(6, 2)))
        assert(blackKnight.isLegalMove(board, ChessSquare(4, 2)))
        assert(blackKnight.isLegalMove(board, ChessSquare(3, 3)))
        assert(!blackKnight.isLegalMove(board, ChessSquare(5, 7)))
        assert(!blackKnight.isLegalMove(board, ChessSquare(2, 4)))
        assert(!blackKnight.isLegalMove(board, ChessSquare(3, 4)))
        assert(!blackKnight.isLegalMove(board, ChessSquare(2, 7)))

        board[4][5] = Pawn(Player.BLACK)
        assert(whiteKnight.isLegalMove(board, ChessSquare(4, 5)))
        board[4][5] = Pawn(Player.WHITE)
        assert(!whiteKnight.isLegalMove(board, ChessSquare(4, 5)))
    }
}