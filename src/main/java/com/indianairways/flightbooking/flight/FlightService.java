package com.indianairways.flightbooking.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indianairways.flightbooking.domain.entity.Flight;
import com.indianairways.flightbooking.domain.repo.FlightRepository;

@Service
@Transactional(readOnly = true)
public class FlightService implements FlightServiceInterface {

	@Autowired
	private FlightRepository flightRepo;

	@Override
	public Flight getFlightById(String flightId) {
		return flightRepo.findById(flightId).orElseThrow(() -> new FlightNotFoundException(flightId));
	}

	@Override
	public List<Flight> getAllFlights() {
		return flightRepo.findAll();
	}

}
