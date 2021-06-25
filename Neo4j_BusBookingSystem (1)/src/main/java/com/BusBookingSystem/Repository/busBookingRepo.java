package com.BusBookingSystem.Repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.BusBookingSystem.model.busBooking;

@Repository
public interface busBookingRepo extends Neo4jRepository<busBooking, Long>
{
//	void deleteByBusID(String id);
}
