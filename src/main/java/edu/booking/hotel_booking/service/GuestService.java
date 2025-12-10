package edu.booking.hotel_booking.service;

import edu.booking.hotel_booking.dao.GuestDao;
import edu.booking.hotel_booking.dto.Guest;
import org.springframework.stereotype.Service;

@Service
public class GuestService {

    private final GuestDao guestDao;

    public GuestService(
            GuestDao guestDao
    ) {
        this.guestDao = guestDao;
    }

    public void addGuest(Guest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void updateGuest(Long id, Guest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
