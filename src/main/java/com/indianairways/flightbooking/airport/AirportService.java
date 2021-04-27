package com.indianairways.flightbooking.airport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indianairways.flightbooking.domain.entity.Airport;
import com.indianairways.flightbooking.domain.repo.AirportRepository;

@Service
@Transactional(readOnly = true)
public class AirportService implements AirportServiceInterface {

	@Autowired
	private AirportRepository airportRepo;

	@Override
	public Airport getAirportById(String airportId) {
		return airportRepo.findById(airportId).orElseThrow(() -> new AirportNotFoundException(airportId));
	}

	@Override
	public List<Airport> getAllAirports() {
		return airportRepo.findAll();
	}

}
