package com.csclub.chess

const val BOARD_SIZE = 8
typealias ChessBoard = List<List<ChessPiece?>>
typealias MutableChessBoard = MutableList<MutableList<ChessPiece?>>

fun makeEmptyBoard(): MutableChessBoard = MutableList(BOARD_SIZE) { MutableList(BOARD_SIZE) { null } }
fun ChessBoard.makeCopy(): MutableChessBoard = MutableList(BOARD_SIZE) { this[it].slice(this[it].indices).toMutableList() }

inline fun <reified T : ChessPiece> ChessBoard.indicesOf(player: Player): List<ChessSquare> {
    val indices = mutableListOf<ChessSquare>()
    for ((i, file) in this.withIndex()) {
        for ((j, piece) in file.withIndex()) {
            if (piece is T && piece.player == player) {
                indices.add(ChessSquare(i, j))
            }
        }
    }
    return indices
}

fun ChessBoard.wouldPutKingInCheck(from: ChessSquare, to: ChessSquare, player: Player): Boolean {
    val boardCopy = this.makeCopy()
    val temp = boardCopy[from.file][from.rank]
    return temp?.let {
        boardCopy[from.file][from.rank] = null
        boardCopy[to.file][to.rank] = it
        val tempHasMoved = it.hasMoved
        it.hasMoved = true
        val isInCheck = boardCopy.isKingInCheck(player)
        it.hasMoved = tempHasMoved
        isInCheck
    } ?: throw IllegalStateException("No piece found at square $from")
}

fun ChessBoard.isKingInCheck(player: Player): Boolean {
    // Returns true if the king of the player given is in check; that is, if any of the enemy's pieces threaten the square the king is on
    val playerKingSquare = this.indicesOf<King>(player)
    val enemyPlayersPieces = this.indicesOf<ChessPiece>(if (player == Player.WHITE) Player.BLACK else Player.WHITE)
    return false
}