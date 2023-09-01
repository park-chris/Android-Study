package com.crystal.pickimage.mvi.repository

import com.crystal.pickimage.mvi.model.Image

interface ImageRepository {

    suspend fun getRandomImage(): Image

}