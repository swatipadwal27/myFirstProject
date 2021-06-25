package com.BusBookingSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BusBookingSystem.Repository.busBookingRepo;
import com.BusBookingSystem.Service.busBookingService;
import com.BusBookingSystem.model.busBooking;

@Service
@Transactional
public class busBookingImpl implements busBookingService
{

	@Autowired
	busBookingRepo busbookingrepo;
	@Override
	public List<busBooking> getBusBookings() 
	{
		return busbookingrepo.findAll();
	}
	@Override
	public void bookingentry(busBooking busbooking) 
	{
		busbookingrepo.save(busbooking);
	}
	@Override
	public List<busBooking> findAll()
	{
		return busbookingrepo.findAll();
	}
	@Override
	public void bookbus(busBooking busBook) 
	{
		busbookingrepo.save(busBook);
		
	}

}
