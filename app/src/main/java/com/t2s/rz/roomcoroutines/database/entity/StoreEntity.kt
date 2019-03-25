package database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "storeInfo")
public class StoreEntity() {
    @PrimaryKey
    @NotNull
    @ColumnInfo(name = "id")
    var id : String? = null


    @ColumnInfo(name = "takeaway_name")
    var name : String? = null

    @ColumnInfo(name = "host_name")
    var hostName : String? = null

    @ColumnInfo(name = "address")
    var address : String? = null

    @ColumnInfo(name = "postcode")
    var postcode : String? = null

    @ColumnInfo(name ="logo_url")
    var logoUrl: String? = null

    @ColumnInfo(name ="phone")
    var phone: String? = null

    @ColumnInfo(name ="description")
    var description: String? = null
    @ColumnInfo(name = "updatedAt")
    var updatedAt : String? = null



}