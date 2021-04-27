package com.indianairways.flightbooking.passenger;

import java.util.List;

import com.indianairways.flightbooking.domain.entity.Passenger;

public interface PassengerServiceInterface {
	
	Passenger getPassengerById(String passengerId);

	List<Passenger> getAllPassengers();
}
