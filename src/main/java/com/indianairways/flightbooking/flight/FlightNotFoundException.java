package com.indianairways.flightbooking.flight;

import com.indianairways.flightbooking.system.ResourceNotFoundException;

public class FlightNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = 6293499259584600291L;

	public FlightNotFoundException(String flightId) {
		super("Flight", "flight-id", flightId);
	}

}
