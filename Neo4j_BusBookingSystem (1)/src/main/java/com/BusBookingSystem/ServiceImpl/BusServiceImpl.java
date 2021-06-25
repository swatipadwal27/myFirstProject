package com.BusBookingSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BusBookingSystem.Repository.BusRepository;
import com.BusBookingSystem.Service.BusService;
import com.BusBookingSystem.model.Bus;

@Service
@Transactional
public class BusServiceImpl implements BusService
{

	@Autowired
	BusRepository busRepository;
	
	@Autowired
	BusService busservice;
	
	@Override
	public List<Bus> getAllBus() 
	{
		return busRepository.findAll();
	}

	

	@Override
	public void deleteBus(long id) {
		
		busRepository.deleteById(id);
	}



	@Override
	public void addBus(Bus busModel) 
	{
		busRepository.save(busModel);
		
		
		
		
	}

	@Override
	public List<Bus> findByname(String str) 
	{
      return busservice.findBybusName(str);
	}



	@Override
	public List<Bus> findByBusType(String busType) {
		
		return null;
	}

	@Override
	public List<Bus> findBypickup(String busRoute) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteBusByID(String id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Bus> findBydropoff(String dropoff) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Bus> findBybusName(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	

	




	

}
