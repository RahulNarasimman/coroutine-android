package com.t2s.rz.roomcoroutines.provider

import com.t2s.rz.roomcoroutines.repository.MainRepository
import database.AppDatabase
import database.entity.StoreEntity
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainProvider {
    val repo = MainRepository()
    fun addStoreData(): Deferred<Unit> {
        return GlobalScope.async {
            repo.addStoreData(StoreEntity())
            val a = async {
                repo.addStoreData(StoreEntity())
            }

            val asd = launch {
                repo.addStoreData(StoreEntity())
            }
           a.await()
        }
    }
}