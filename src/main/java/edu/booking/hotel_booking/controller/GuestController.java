package edu.booking.hotel_booking.controller;

import edu.booking.hotel_booking.dto.Guest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
public class GuestController {

    // Добавить гостя
    @PostMapping
    public ResponseEntity<?> addGuest(@RequestBody Guest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Редактировать гостя
    @PutMapping("/{id}")
    public ResponseEntity<?> updateGuest(
            @PathVariable Long id,
            @RequestBody Guest request
    ) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}