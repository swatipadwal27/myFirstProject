package com.BusBookingSystem.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Size;

import org.jetbrains.annotations.NotNull;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;

@NodeEntity
public class Bus 
{


   @Id
    private String id;
   @NotNull
	
    private String busName;
   @NotNull
	
    private String pickup;
   @NotNull
	
    private String dropoff;
   @NotNull
	
    private float busTime;
   @NotNull
	
    private String busType;
    
    @Relationship(type="HAS_BUS",direction = Relationship.INCOMING)
    private List<busBooking> busbooking;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDropoff() {
		return dropoff;
	}

	public void setDropoff(String dropoff) {
		this.dropoff = dropoff;
	}

	public float getBusTime() {
		return busTime;
	}

	public void setBusTime(float busTime) {
		this.busTime = busTime;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public List<busBooking> getBusbooking() {
		return busbooking;
	}

	public void setBusbooking(List<busBooking> busbooking) {
		this.busbooking = busbooking;
	}

	
   

}
