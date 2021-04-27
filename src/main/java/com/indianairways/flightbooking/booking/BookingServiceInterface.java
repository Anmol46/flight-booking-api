package com.indianairways.flightbooking.booking;

import java.util.List;

import com.indianairways.flightbooking.domain.entity.FlightBooking;

public interface BookingServiceInterface {
	
	FlightBooking getBooking(String bookingId);
	
	List<FlightBooking> getAllBookingsByPassenger(String passengerId);

	List<FlightBooking> getAllMultiFlightBookingsByPassenger(String passengerId);

	List<FlightBooking> getAllMultiFlightBookings();
	
	void createSampleBookings();

}
