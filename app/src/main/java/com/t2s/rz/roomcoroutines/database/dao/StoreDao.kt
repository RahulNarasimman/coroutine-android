package database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import database.entity.StoreEntity
import io.reactivex.Completable

@Dao
public interface StoreDao {
    @Query("SELECT * FROM storeInfo WHERE id = :storeID  LIMIT 1")
    fun getStoreInfo(storeID: String): LiveData<StoreEntity>

    @Query("SELECT id FROM storeInfo WHERE id = :storeID  LIMIT 1")
    fun getStoreInfoId(storeID: String?) : String?

    @Query("SELECT COUNT(id) FROM storeInfo WHERE id = :storeID")
    fun countOfStoreId(storeID: String?) : Int?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addStoreInfo(storeInfo: StoreEntity)

    @Delete
    fun deleteStoreInfo(storeInfo: StoreEntity)

    @Update
    fun updateStoreInfo(storeInfo: StoreEntity)

    @Query("DELETE FROM storeInfo")
    fun deleteAllStoreInfo()

    @Query("SELECT * FROM storeInfo")
    fun getAllStores() : LiveData<List<StoreEntity>>
}