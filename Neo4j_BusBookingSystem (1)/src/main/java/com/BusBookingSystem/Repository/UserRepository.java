package com.BusBookingSystem.Repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.BusBookingSystem.model.Users;


@Repository
public interface UserRepository extends Neo4jRepository<Users, Long> {
	
	Users findByUsername(String username);
}
