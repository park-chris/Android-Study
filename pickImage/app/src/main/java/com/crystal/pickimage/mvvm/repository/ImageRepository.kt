package com.crystal.pickimage.mvvm.repository

import com.crystal.pickimage.mvvm.model.Image
import io.reactivex.Single

interface ImageRepository {

    fun getRandomImage() : Single<Image>



}