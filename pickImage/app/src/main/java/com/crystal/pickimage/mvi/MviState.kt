package com.crystal.pickimage.mvi

import com.crystal.pickimage.mvi.model.Image

sealed class MviState {
    // sealed class에서 인자가 있으면 생성자 값 data class로 생선 받고 없으면 object로 생성
    object Idle: MviState()
    object Loading: MviState()
    data class LoadedImage(val image: Image, val count: Int): MviState()

}
