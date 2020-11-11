package com.csclub.chess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ChessActivity : AppCompatActivity(), ChessView {
    private lateinit var presenter: ChessPresenter
    private lateinit var grid: Array<Array<ImageView>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chess)
        initializeGrid()
        presenter = ChessPresenter(this)
    }

    override fun updateUI(board: ChessBoard,
                          selectedPieceSquare: ChessSquare?,
                          eligibleMovementSquares: List<ChessSquare>,
                          capturedBlackPieces: List<ChessPiece>,
                          capturedWhitePieces: List<ChessPiece>) {
        // Sets each ImageView in the grid to have a source that reflects the piece on that square (null for no piece)
        // and a background that is either selected, eligible movement, or neither
        // Sets the TextViews to show each player's score, determined by the valueOfPieces of the captured pieces
    }

    private fun initializeGrid() {
        grid = arrayOf(
            arrayOf(
                findViewById(R.id.chessboard_rank_0_file_0),
                findViewById(R.id.chessboard_rank_0_file_1),
                findViewById(R.id.chessboard_rank_0_file_2),
                findViewById(R.id.chessboard_rank_0_file_3),
                findViewById(R.id.chessboard_rank_0_file_4),
                findViewById(R.id.chessboard_rank_0_file_5),
                findViewById(R.id.chessboard_rank_0_file_6),
                findViewById(R.id.chessboard_rank_0_file_7)
            ),
            arrayOf(
                findViewById(R.id.chessboard_rank_1_file_0),
                findViewById(R.id.chessboard_rank_1_file_1),
                findViewById(R.id.chessboard_rank_1_file_2),
                findViewById(R.id.chessboard_rank_1_file_3),
                findViewById(R.id.chessboard_rank_1_file_4),
                findViewById(R.id.chessboard_rank_1_file_5),
                findViewById(R.id.chessboard_rank_1_file_6),
                findViewById(R.id.chessboard_rank_1_file_7)
            ),
            arrayOf(
                findViewById(R.id.chessboard_rank_2_file_0),
                findViewById(R.id.chessboard_rank_2_file_1),
                findViewById(R.id.chessboard_rank_2_file_2),
                findViewById(R.id.chessboard_rank_2_file_3),
                findViewById(R.id.chessboard_rank_2_file_4),
                findViewById(R.id.chessboard_rank_2_file_5),
                findViewById(R.id.chessboard_rank_2_file_6),
                findViewById(R.id.chessboard_rank_2_file_7)
            ),
            arrayOf(
                findViewById(R.id.chessboard_rank_3_file_0),
                findViewById(R.id.chessboard_rank_3_file_1),
                findViewById(R.id.chessboard_rank_3_file_2),
                findViewById(R.id.chessboard_rank_3_file_3),
                findViewById(R.id.chessboard_rank_3_file_4),
                findViewById(R.id.chessboard_rank_3_file_5),
                findViewById(R.id.chessboard_rank_3_file_6),
                findViewById(R.id.chessboard_rank_3_file_7)
            ),
            arrayOf(
                findViewById(R.id.chessboard_rank_4_file_0),
                findViewById(R.id.chessboard_rank_4_file_1),
                findViewById(R.id.chessboard_rank_4_file_2),
                findViewById(R.id.chessboard_rank_4_file_3),
                findViewById(R.id.chessboard_rank_4_file_4),
                findViewById(R.id.chessboard_rank_4_file_5),
                findViewById(R.id.chessboard_rank_4_file_6),
                findViewById(R.id.chessboard_rank_4_file_7)
            ),
            arrayOf(
                findViewById(R.id.chessboard_rank_5_file_0),
                findViewById(R.id.chessboard_rank_5_file_1),
                findViewById(R.id.chessboard_rank_5_file_2),
                findViewById(R.id.chessboard_rank_5_file_3),
                findViewById(R.id.chessboard_rank_5_file_4),
                findViewById(R.id.chessboard_rank_5_file_5),
                findViewById(R.id.chessboard_rank_5_file_6),
                findViewById(R.id.chessboard_rank_5_file_7)
            ),
            arrayOf(
                findViewById(R.id.chessboard_rank_6_file_0),
                findViewById(R.id.chessboard_rank_6_file_1),
                findViewById(R.id.chessboard_rank_6_file_2),
                findViewById(R.id.chessboard_rank_6_file_3),
                findViewById(R.id.chessboard_rank_6_file_4),
                findViewById(R.id.chessboard_rank_6_file_5),
                findViewById(R.id.chessboard_rank_6_file_6),
                findViewById(R.id.chessboard_rank_6_file_7)
            ),
            arrayOf(
                findViewById(R.id.chessboard_rank_7_file_0),
                findViewById(R.id.chessboard_rank_7_file_1),
                findViewById(R.id.chessboard_rank_7_file_2),
                findViewById(R.id.chessboard_rank_7_file_3),
                findViewById(R.id.chessboard_rank_7_file_4),
                findViewById(R.id.chessboard_rank_7_file_5),
                findViewById(R.id.chessboard_rank_7_file_6),
                findViewById(R.id.chessboard_rank_7_file_7)
            )
        )
    }
}