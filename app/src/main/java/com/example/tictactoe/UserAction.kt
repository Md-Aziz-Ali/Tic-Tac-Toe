package com.example.tictactoe

sealed class UserAction {
    object PlayAgainButtonClicked: UserAction()
    data class BoardTypped(val cellNo: Int): UserAction()
}