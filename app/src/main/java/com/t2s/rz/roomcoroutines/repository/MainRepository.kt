package com.t2s.rz.roomcoroutines.repository

import database.AppDatabase
import database.entity.StoreEntity

class MainRepository {
    val storeDao = AppDatabase.getDatabase(null).storeDao
     suspend fun addStoreData(storeEntity: StoreEntity) {
        storeDao.addStoreInfo(storeEntity)
    }
}
