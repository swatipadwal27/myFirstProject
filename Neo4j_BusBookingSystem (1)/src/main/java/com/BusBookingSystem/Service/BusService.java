package com.BusBookingSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.BusBookingSystem.Repository.BusRepository;
import com.BusBookingSystem.model.Bus;
import com.BusBookingSystem.model.busBooking;


public interface BusService {
	

	
	
	
	void addBus(Bus busModel);

	void deleteBus(long id);

	List<Bus> findBypickup(String pickup);
	List<Bus> findBydropoff(String dropoff);

	List<Bus> findByname(String name);

	List<Bus> findByBusType(String busType);

	//void delete(Long valueOf);

	void deleteBusByID(String id);

	
	

	@Query("MATCH (b:bus) RETURN b ")
	List<Bus> getAllBus();
	
	@Query("MATCH (b:Bus) WHERE B.busName=~('(?i).*'$str+'.*) RETURN B")
	List<Bus>findBybusName(String str);

}
