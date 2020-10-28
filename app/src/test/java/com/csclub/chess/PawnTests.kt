package com.csclub.chess

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PawnTests {
    @Test
    fun pawnTest() {
        val board = makeEmptyBoard()
        val whitePawn = Pawn(Player.WHITE)
        val blackPawn = Pawn(Player.BLACK)
        board[1][4] = whitePawn
        board[6][4] = blackPawn
        assert(whitePawn.isLegalMove(board, ChessSquare(2, 4)))
        assert(whitePawn.isLegalMove(board, ChessSquare(3, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(1, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 3)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 5)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(0, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(4, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(1, 3)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(1, 5)))
        whitePawn.hasMoved = true
        assert(whitePawn.isLegalMove(board, ChessSquare(2, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(3, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 3)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 5)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(0, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(4, 4)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(1, 3)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(1, 5)))

        assert(blackPawn.isLegalMove(board, ChessSquare(5, 4)))
        assert(blackPawn.isLegalMove(board, ChessSquare(4, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(6, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 3)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 5)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(7, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(3, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(6, 3)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(6, 5)))
        blackPawn.hasMoved = true
        assert(blackPawn.isLegalMove(board, ChessSquare(5, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(4, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(6, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 3)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 5)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(7, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(3, 4)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(6, 3)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(6, 5)))

        board[2][4] = Pawn(Player.WHITE)
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 4)))
        board[2][4] = Pawn(Player.BLACK)
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 4)))

        board[5][4] = Pawn(Player.BLACK)
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 4)))
        board[5][4] = Pawn(Player.WHITE)
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 4)))

        board[2][3] = Pawn(Player.WHITE)
        board[2][5] = Pawn(Player.WHITE)
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 3)))
        assert(!whitePawn.isLegalMove(board, ChessSquare(2, 5)))
        board[2][3] = Pawn(Player.BLACK)
        board[2][5] = Pawn(Player.BLACK)
        assert(whitePawn.isLegalMove(board, ChessSquare(2, 3)))
        assert(whitePawn.isLegalMove(board, ChessSquare(2, 5)))

        board[5][3] = Pawn(Player.BLACK)
        board[5][5] = Pawn(Player.BLACK)
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 3)))
        assert(!blackPawn.isLegalMove(board, ChessSquare(5, 5)))
        board[5][3] = Pawn(Player.WHITE)
        board[5][5] = Pawn(Player.WHITE)
        assert(blackPawn.isLegalMove(board, ChessSquare(5, 3)))
        assert(blackPawn.isLegalMove(board, ChessSquare(5, 5)))
    }
}