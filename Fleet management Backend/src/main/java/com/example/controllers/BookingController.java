package com.example.controllers;

import com.example.entities.Airport;
import com.example.entities.Booking;
import com.example.entities.Hubs;
import com.example.services.AirportService;
import com.example.services.BookingService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class BookingController {

	@Autowired
    private BookingService bookingService; 
	
	
	
	// add record into booking table 
	@CrossOrigin
	@PostMapping("/api/addbooking")
	public void save(@RequestBody  Booking booking) {


		
		bookingService.save(booking);  
	}
	
	
	// get record from booking table BY PHONE NUMBER // will give latest record of a user 
	@CrossOrigin
	@GetMapping("/api/booking/by-phone/{phoneNumber}")
	public Booking getBookingByPhoneNumber(@PathVariable String phoneNumber) { 
		var abc = bookingService.getBookingByPhoneNumber(phoneNumber); 
		return abc; 
	} 
	
	
	// get record from booking table BY EMAIL ID // will give latest record of a user 
	@CrossOrigin
	@GetMapping("/api/booking/by-email/{emailId}")
	public Booking getBookingByEmailId(@PathVariable String emailId) { 
		return bookingService.getBookingByEmailId(emailId); 
	}
	
	@CrossOrigin
	@DeleteMapping("/api/booking/{bookingId}")
	public void deleteBooking(@PathVariable int bookingId) {
	    bookingService.deleteBooking(bookingId);
	}
	
}
