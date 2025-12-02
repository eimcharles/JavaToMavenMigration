package com.eimc.car;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    private static final String TEST_REGISTRATION_NUMBER = "123_1";
    private static final BigDecimal TEST_RENTAL_PRICE_PER_DAY = new BigDecimal("79");
    private static final Brand TEST_MANUFACTURER = Brand.BMW;
    private static final FuelType TEST_FUEL_TYPE = FuelType.ELECTRIC;

    @Test
    public void constructorSetsAllCarFields() {

        Car car = new Car(TEST_REGISTRATION_NUMBER, TEST_RENTAL_PRICE_PER_DAY, TEST_MANUFACTURER, TEST_FUEL_TYPE);

        assertEquals(TEST_REGISTRATION_NUMBER, car.getRegistrationNumber(), "Registration number must match the registration number passed to the constructor.");
        assertEquals(TEST_RENTAL_PRICE_PER_DAY, car.getRentalPricePerDay(), "Rental price per day must match the rental price per day passed to the constructor.");
        assertEquals(TEST_MANUFACTURER, car.getManufacturer(), "Manufacturer must match the manufacturer passed to the constructor.");
        assertEquals(TEST_FUEL_TYPE, car.getFuelType(), "Fuel type must match the fuel type passed to the constructor.");

    }
}
