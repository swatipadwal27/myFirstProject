package com.BusBookingSystem.Service;

import java.util.List;

import com.BusBookingSystem.model.busBooking;


public interface busBookingService
{

	List<busBooking>getBusBookings();
	void bookingentry(busBooking busbooking);
	List<busBooking> findAll();
	void bookbus(busBooking busBook);
	

	

}
