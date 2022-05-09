package com.mockitotutorial.happyhotel.booking;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BookingDAO {

    private final Map<String, BookingRequest> bookings = new HashMap<>();

    public String save(final BookingRequest bookingRequest) {
        final String id = UUID.randomUUID().toString();
        bookings.put(id, bookingRequest);
        return id;
    }

    public BookingRequest get(final String id) {
        return bookings.get(id);
    }

    public void delete(final String bookingId) {
        bookings.remove(bookingId);
    }

}
