package edu.booking.hotel_booking.dao

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class RoomDao (
    private val jdbcTemplate: NamedParameterJdbcTemplate
) {
}