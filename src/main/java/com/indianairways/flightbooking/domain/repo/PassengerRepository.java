package com.indianairways.flightbooking.domain.repo;

import java.util.Optional;

import com.indianairways.flightbooking.domain.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PassengerRepository extends JpaRepository<Passenger, String> {
	
	Optional<Passenger> findByEmail(String email);
	
}
