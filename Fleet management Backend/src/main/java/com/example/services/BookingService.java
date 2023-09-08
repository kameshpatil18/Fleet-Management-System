package com.example.services;

import java.util.Optional;

import com.example.entities.Booking;
import com.example.entities.Hubs;

public interface BookingService {

	
	void save(Booking booking);
	
	public Booking getBookingByPhoneNumber(String phoneNumber); 
	
	public Booking getBookingByEmailId(String emailId); 
	
	void deleteBooking(int bookingId);

	
//	public Optional<Hubs> getById(int id); 
}
