package com.indianairways.flightbooking.domain.repo;

import com.indianairways.flightbooking.domain.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AirportRepository extends JpaRepository<Airport, String> {
	
}
