package database


import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import android.util.Log
import database.dao.OrderHistoryDao
import database.dao.StoreDao
import database.entity.OrderHistoryEntity
import database.entity.StoreEntity

@Database(entities = [StoreEntity::class, OrderHistoryEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract val storeDao: StoreDao
    abstract val orderHistoryDao: OrderHistoryDao

    companion object {
        internal val TAG = "room-db"
        private val DATABASE_NAME = "foodhub-db"
        private var dbInstance: AppDatabase? = null
        private val LOCK = Any()
        var TEST_MODE = false

        fun getDatabase(context: Context?): AppDatabase {
            if (dbInstance == null) {
                synchronized(LOCK) {
                    Log.d(TAG, "getsInstance: Creating new database instance")
                    dbInstance = if (TEST_MODE) {
                        Room.inMemoryDatabaseBuilder(context!!.applicationContext, AppDatabase::class.java)
                            .allowMainThreadQueries()
                            .build()
                    } else {
                        Room.databaseBuilder(context!!.applicationContext, AppDatabase::class.java,
                                DATABASE_NAME)
                            .build()
                    }
                }
            }
            Log.d(TAG, "getsInstance: getting the database instance")
            return dbInstance!!
        }
    }

}
