package com.csclub.chess

class ChessPresenter(private val chessView: ChessView) {
    private val game = ChessGameModel()
    private var selectedPieceSquare: ChessSquare? = null

    companion object {
        fun valueOfPieces(listOfPieces: List<ChessPiece>) =
            10 * listOfPieces.filterIsInstance<Queen>().size +
            5 * listOfPieces.filterIsInstance<Rook>().size +
            3 * listOfPieces.filterIsInstance<Knight>().size +
            3 * listOfPieces.filterIsInstance<Bishop>().size +
            listOfPieces.filterIsInstance<Pawn>().size
    }

    init {
        chessView.updateUI(
            game.board,
            null,
            listOf(),
            listOf(),
            listOf()
        )
    }

    fun onSquareTap(squareTapped: ChessSquare) {
        // If there is no piece selected, selects the piece of the square tapped, if there is one of the current player's color
        // Then calculates the eligible movement squares and calls updateUI

        // If there is a piece selected, but a legal move is not selected, deselects the piece and calls updateUI

        // If there is a piece selected and a legal move is selected, moves the piece and calls updateUI
    }

    fun getEligibleMovementSquares(from: ChessSquare, board: ChessBoard): List<ChessSquare> {
        // Returns a list of all the squares the piece on 'from' can move to
        // It can be assumed that 'from' has a piece on it
        return listOf()
    }
}

interface ChessView {
    fun updateUI(board: ChessBoard,
                 selectedPieceSquare: ChessSquare?,
                 eligibleMovementSquares: List<ChessSquare>,
                 capturedBlackPieces: List<ChessPiece>,
                 capturedWhitePieces: List<ChessPiece>)
}