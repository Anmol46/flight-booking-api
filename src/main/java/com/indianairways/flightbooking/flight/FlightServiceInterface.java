package com.indianairways.flightbooking.flight;

import java.util.List;

import com.indianairways.flightbooking.domain.entity.Flight;

public interface FlightServiceInterface {
	
	Flight getFlightById(String flightId);

	List<Flight> getAllFlights();
}
