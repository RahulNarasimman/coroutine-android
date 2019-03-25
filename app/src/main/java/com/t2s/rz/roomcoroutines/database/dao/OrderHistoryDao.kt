package database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import database.entity.OrderHistoryEntity
import io.reactivex.Completable

@Dao
interface OrderHistoryDao {
    @Query("SELECT * FROM orderHistory WHERE id = :orderId  LIMIT 1")
    fun getOrder(orderId: String): LiveData<OrderHistoryEntity>

    @Query("SELECT * FROM orderHistory")
    fun getAllOrders() : LiveData<List<OrderHistoryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addOrder(order: OrderHistoryEntity)

    @Delete
    fun deleteOrder(order: OrderHistoryEntity)

    @Query("DELETE FROM orderHistory WHERE updatedAt < :t")
    fun deleteOldOrder(t : Long)

    @Update
    fun updateOrder(order: OrderHistoryEntity)

    @Query("DELETE FROM orderHistory")
    fun deleteAllOrderHistory()
}
