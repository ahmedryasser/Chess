package com.csclub.chess

class ChessPresenter(private val chessView: ChessView) {
    private val game = ChessGameModel()
    private var selectedPieceSquare: ChessSquare? = null

    init {
        chessView.updateUI(
            game.board,
            selectedPieceSquare,
            listOf(),
            game.capturedWhitePieces,
            game.capturedBlackPieces
        )
    }

    fun onSquareTap(squareTapped: ChessSquare) {

    }
}

interface ChessView {
    fun updateUI(board: ChessBoard,
                 selectedPieceSquare: ChessSquare?,
                 eligibleMovementSquares: List<ChessSquare>,
                 capturedBlackPieces: List<ChessPiece>,
                 capturedWhitePieces: List<ChessPiece>)
}