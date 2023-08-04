package com.crystal.mediasearch.repository

import com.crystal.mediasearch.model.ListItem
import io.reactivex.rxjava3.core.Observable


interface SearchRepository {

    fun search(query: String): Observable<List<ListItem>>
}