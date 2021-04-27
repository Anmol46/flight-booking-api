package com.indianairways.flightbooking.passenger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indianairways.flightbooking.domain.entity.Passenger;
import com.indianairways.flightbooking.domain.repo.PassengerRepository;

@Service
@Transactional(readOnly = true)
public class PassengerService implements PassengerServiceInterface {

	@Autowired
	private PassengerRepository passengerRepo;

	@Override
	public Passenger getPassengerById(String passengerId) {
		return passengerRepo.findById(passengerId).orElseThrow(() -> new PassengerNotFoundException(passengerId));
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepo.findAll();
	}

}
