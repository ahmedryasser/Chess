package com.csclub.chess

class ChessGameModel {
    val board = MutableList(BOARD_SIZE) { MutableList<ChessPiece?>(BOARD_SIZE) { null } }
    var turn = Player.WHITE
    var playerHasWon: Player? = null
    var playerHasDrawn = false
    val capturedWhitePieces = mutableListOf<ChessPiece>()
    val capturedBlackPieces = mutableListOf<ChessPiece>()

    init {

    }

    fun move(from: ChessSquare, to: ChessSquare) {
        // Moves the piece at 'from' to 'to'; it can be assumed that this is a legal move
        // If there was a piece at 'to', save it to either capturedWhitePieces or capturedBlackPieces before the move
        // Update the hasMoved of the chess piece to 'true'
        // Update the player's turn
        // Update the winner: The game is over if the current player has no legal move. If his king is in check, the other player wins,
        // otherwise, the game is a draw (stalemate)
    }

    fun playerHasLegalMove(): Boolean {
        // Returns true if any of the players pieces can legally move to another square on the board
        val playersPieces = board.indicesOf<ChessPiece>(turn)
        return true
    }
}