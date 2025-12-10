package edu.booking.hotel_booking.service

import edu.booking.hotel_booking.dao.RoomDao
import edu.booking.hotel_booking.dto.Room
import org.springframework.stereotype.Service

@Service
class RoomService (
    private val roomDao: RoomDao,
) {
    fun addRoom(request: Room) {
        throw UnsupportedOperationException("Not implemented yet")
    }

    fun updateRoom(id: Long, request: Room) {
        throw UnsupportedOperationException("Not implemented yet")
    }

    fun deleteRoom(id: Long) {
        throw UnsupportedOperationException("Not implemented yet")
    }
}