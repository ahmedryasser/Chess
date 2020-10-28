package com.csclub.chess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChessActivity : AppCompatActivity(), ChessView {
    private lateinit var presenter: ChessPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chess)
        presenter = ChessPresenter(this)
    }

    override fun updateUI(board: ChessBoard,
                          selectedPieceSquare: ChessSquare?,
                          eligibleMovementSquares: List<ChessSquare>,
                          capturedBlackPieces: List<ChessPiece>,
                          capturedWhitePieces: List<ChessPiece>) {
        // TODO("Not yet implemented")
    }
}