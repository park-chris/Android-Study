package com.crystal.pickimage.mvi

sealed class MviIntent {
    object LoadImage : MviIntent()
}
