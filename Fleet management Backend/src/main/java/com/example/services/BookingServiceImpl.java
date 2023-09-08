package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entities.Booking;
import com.example.entities.Hubs;
import com.example.repositories.BookingRepository;
import com.example.repositories.HubsRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository bookingrepository;

	
	@Override
	public void save(Booking booking) {
		bookingrepository.save(booking);
	}

	
	@Override
	public Booking getBookingByPhoneNumber(String phoneNumber) {
		return bookingrepository.getBookingByPhoneNumber(phoneNumber); 
	}
	
	@Override 
	public Booking getBookingByEmailId(String emailId) {
		return bookingrepository.getBookingByEmailId(emailId); 
	}

	 @Override
	    public void deleteBooking(int bookingId) {
		 bookingrepository.deleteById(bookingId);
	    }
	
	
	
	
}
