package edu.booking.hotel_booking.controller

import edu.booking.hotel_booking.dto.Room
import edu.booking.hotel_booking.service.RoomService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rooms")
class RoomController (
    private val roomService: RoomService,
) {

    @PostMapping
    fun addRoom(@RequestBody request: Room): ResponseEntity<Room> {
        throw UnsupportedOperationException("Not implemented yet")
    }

    @PutMapping("/{id}")
    fun updateRoom(
        @PathVariable id: Long,
        @RequestBody request: Room,
    ): ResponseEntity<Room> {
        throw UnsupportedOperationException("Not implemented yet")
    }

    @DeleteMapping("/{id}")
    fun deleteRoom(@PathVariable id: Long): ResponseEntity<Room> {
        throw UnsupportedOperationException("Not implemented yet")
    }
}