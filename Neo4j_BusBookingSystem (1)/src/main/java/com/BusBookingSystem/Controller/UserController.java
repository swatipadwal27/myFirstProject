package com.BusBookingSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController 
{

	@RequestMapping("UserBusList")
	public String userBusList()
	{
		return "UserBusList.html";
	}
	
	@RequestMapping("busBooking")
	public String busBooking()
	{
		return "busBooking.html";
	}
	
	
}
