package com.eimc.booking;

import com.eimc.car.Brand;
import com.eimc.car.Car;
import com.eimc.car.FuelType;
import com.eimc.user.User;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BookingTest {

    private final User TEST_USER = new User(
            UUID.randomUUID(),
            "Charles",
            "Eimer");

    private final Car TEST_CAR = new Car(
            "ABC 123",
            new BigDecimal("79"),
            Brand.BMW,
            FuelType.GASOLINE);

    private static final UUID TEST_BOOKING_ID = UUID.randomUUID();
    private static final LocalDateTime TEST_BOOKING_TIME = LocalDateTime.now();

    @Test
    public void constructorSetsAllBookingFields() {

        Booking booking = new Booking(
                TEST_BOOKING_ID,
                TEST_USER,
                TEST_CAR,
                TEST_BOOKING_TIME
        );

        assertEquals(TEST_BOOKING_ID, booking.getUserBookingID(),  "The booking ID must match the booking ID passed to the constructor.");
        assertEquals(TEST_USER, booking.getUser(), "The User object must match the User object passed to the constructor.");
        assertEquals(TEST_CAR, booking.getCar(), "The Car object object must match the Car object passed to the constructor.");
        assertEquals(TEST_BOOKING_TIME, booking.getBookingTime(), "The booking time must match the booking time passed to the constructor.");
        assertFalse(booking.isBookingCancelled(), "A new booking must be initialized with isBookingCancelled set to false.");

    }
}
