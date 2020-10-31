package com.csclub.chess

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class QueenTests {
    @Test
    fun queenTest() {
        val board = makeEmptyBoard()
        val whiteQueen = Queen(Player.WHITE)
        val blackQueen = Queen(Player.BLACK)
        board[1][4] = whiteQueen
        board[6][4] = blackQueen
        assert(whiteQueen.isLegalMove(board, ChessSquare(2, 5)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(3, 6)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(2, 3)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(3, 2)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(0, 3)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(0, 5)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(2, 4)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(3, 4)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(6, 4)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(0, 4)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(1, 5)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(1, 7)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(1, 3)))
        assert(whiteQueen.isLegalMove(board, ChessSquare(1, 1)))
        assert(!whiteQueen.isLegalMove(board, ChessSquare(2, 6)))
        assert(!whiteQueen.isLegalMove(board, ChessSquare(0, 2)))
        assert(!whiteQueen.isLegalMove(board, ChessSquare(5, 7)))
        assert(!whiteQueen.isLegalMove(board, ChessSquare(0, 6)))

        assert(blackQueen.isLegalMove(board, ChessSquare(5, 5)))
        assert(blackQueen.isLegalMove(board, ChessSquare(4, 6)))
        assert(blackQueen.isLegalMove(board, ChessSquare(5, 3)))
        assert(blackQueen.isLegalMove(board, ChessSquare(4, 2)))
        assert(blackQueen.isLegalMove(board, ChessSquare(7, 3)))
        assert(blackQueen.isLegalMove(board, ChessSquare(7, 5)))
        assert(blackQueen.isLegalMove(board, ChessSquare(5, 4)))
        assert(blackQueen.isLegalMove(board, ChessSquare(4, 4)))
        assert(blackQueen.isLegalMove(board, ChessSquare(1, 4)))
        assert(blackQueen.isLegalMove(board, ChessSquare(7, 4)))
        assert(blackQueen.isLegalMove(board, ChessSquare(6, 5)))
        assert(blackQueen.isLegalMove(board, ChessSquare(6, 7)))
        assert(blackQueen.isLegalMove(board, ChessSquare(6, 3)))
        assert(blackQueen.isLegalMove(board, ChessSquare(6, 1)))
        assert(!blackQueen.isLegalMove(board, ChessSquare(5, 6)))
        assert(!blackQueen.isLegalMove(board, ChessSquare(7, 2)))
        assert(!blackQueen.isLegalMove(board, ChessSquare(2, 7)))
        assert(!blackQueen.isLegalMove(board, ChessSquare(7, 6)))

        board[3][6] = Pawn(Player.BLACK)
        assert(whiteQueen.isLegalMove(board, ChessSquare(3, 6)))
        assert(!whiteQueen.isLegalMove(board, ChessSquare(4, 7)))

        board[3][6] = Pawn(Player.WHITE)
        assert(!whiteQueen.isLegalMove(board, ChessSquare(3, 6)))
        assert(!whiteQueen.isLegalMove(board, ChessSquare(4, 7)))
    }
}