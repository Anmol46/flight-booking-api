package com.indianairways.flightbooking.airport;

import java.util.List;

import com.indianairways.flightbooking.domain.entity.Airport;

public interface AirportServiceInterface {
	Airport getAirportById(String airportId);
	List<Airport> getAllAirports();
}
