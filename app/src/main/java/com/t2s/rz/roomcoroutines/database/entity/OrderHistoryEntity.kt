package database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "orderHistory")
class OrderHistoryEntity {
    @PrimaryKey
    @NotNull
    @ColumnInfo(name = "id")
    var id: String? = null

    @ColumnInfo(name = "orderNumber")
    var orderNumber: String? = null

    @ColumnInfo(name = "status")
    var status: String? = null

    @ColumnInfo(name = "total")
    var total: String? = null
    @ColumnInfo(name = "total_paid_by_card")
    var total_paid_by_card: String? = null

    @ColumnInfo(name = "orderPlacedOn")
    var orderPlacedOn: String? = null

    @ColumnInfo(name = "deliveryCost")
    var deliveryCost: String? = null
    @ColumnInfo(name = "payment")
    var payment: String? = null
    @ColumnInfo(name = "sending")
    var sending: String? = null
    @ColumnInfo(name = "host")
    var host: String? = null
    @ColumnInfo(name = "delivery_time")
    var delivery_time: String? = null

    @ColumnInfo(name = "month")
    var month: String? = null
    @ColumnInfo(name = "year")
    var year: String? = null
    @ColumnInfo(name = "time")
    var time: String? = null
    @ColumnInfo(name = "wait")
    var wait: String? = null
    @ColumnInfo(name = "updatedAt")
    var updatedAt : Long? = null

    @ColumnInfo(name = "cancel_reason_message")
    var cancel_reason_message: String? = null

}