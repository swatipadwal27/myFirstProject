package com.BusBookingSystem.Repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.BusBookingSystem.model.Bus;


@Repository
public interface BusRepository extends Neo4jRepository<Bus, Long> 
{

	
	
	
	
	@Query("MATCH (b:bus) RETURN b ")
	List<Bus> getAllBus();
	
	@Query("MATCH (b:Bus) WHERE b.busName=~('(?i).*'+{busName}+'.*') RETURN B")
	List<Bus>findBybusName(@Param("busName")String busName);
	
}
 	