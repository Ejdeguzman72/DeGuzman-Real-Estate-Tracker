package com.deguzman.Real.Estate.Tracker.API.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.deguzman.Real.Estate.Tracker.API.property_models.Rentals;

public interface RentalsDao {

	public List<Rentals> getAllRentalInformation();
	
	public ResponseEntity<Rentals> getRentalById(long rentalId);
	
	public int addRentalInformation(Rentals rentals);
	
	public int updateRentalInformation(long rentalId, Rentals rentalsInfo);
	
	public int deleteRentalInformation(long rentalId);
}
