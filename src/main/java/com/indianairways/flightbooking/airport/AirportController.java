package com.indianairways.flightbooking.airport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.indianairways.flightbooking.domain.entity.Airport;

@RestController
@RequestMapping("airports")
public class AirportController {
	
	@Autowired
	private AirportServiceInterface airportServiceInterface;
	
//	private static final Logger logger = LoggerFactory.getLogger(AirportController.class);
	
	@GetMapping
	public @ResponseBody List<Airport> getAllAirports() {
		return airportServiceInterface.getAllAirports();
	}

	@GetMapping("/{iata-code}")
	public @ResponseBody Airport getAirportById(@PathVariable("iata-code") String iataCode) {
		return airportServiceInterface.getAirportById(iataCode);
	}
}
