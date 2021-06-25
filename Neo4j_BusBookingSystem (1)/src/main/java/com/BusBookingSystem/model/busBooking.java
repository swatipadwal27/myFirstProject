package com.BusBookingSystem.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Size;

import org.jetbrains.annotations.NotNull;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;


@NodeEntity
public class busBooking 
{

	@Id
	@GeneratedValue	
	private Long id;
	
	@NotNull
	@Size(min=2, max=30)
	
	private String name;
	@NotNull
	@Size(min=10, max=10)
	private String mobileNo;
	@NotNull
	private String email;
	@NotNull
	@Size(min=2, max=30)
	private String pickup;
	@NotNull
	@Size(min=2, max=30)
	private String dropoff;
	@NotNull
	@Size(min=2, max=30)
	private String busName;
	private Long price;
	
	private String busType;
	private String busTime;
	private List<String> seatid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusTime() {
		return busTime;
	}
	public void setBusTime(String busTime) {
		this.busTime = busTime;
	}
	public List<String> getSeatid() {
		return seatid;
	}
	public void setSeatid(List<String> seatid) {
		this.seatid = seatid;
	}
	public busBooking(Long id, String name, String mobileNo, String email, String pickup, String dropoff,
			String busName, Long price, String busType, String busTime, List<String> seatid) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.pickup = pickup;
		this.dropoff = dropoff;
		this.busName = busName;
		this.price = price;
		this.busType = busType;
		this.busTime = busTime;
		this.seatid = seatid;
	}
	public busBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "busBooking [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + ", pickup="
				+ pickup + ", dropoff=" + dropoff + ", busName=" + busName + ", price=" + price + ", busType=" + busType
				+ ", busTime=" + busTime + ", seatid=" + seatid + "]";
	}
	
	
	
	

	
}
