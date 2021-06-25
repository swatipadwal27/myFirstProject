package com.BusBookingSystem.Service;

import java.util.List;


import com.BusBookingSystem.model.Users;

public interface userService 
{
	void userEntry(Users user);
	List<Users> getAllUser();
	void signUp(Users user);
	
	List<Users> findAll();
	
	
	

	
}
