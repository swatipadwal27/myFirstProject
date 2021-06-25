package com.BusBookingSystem.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.BusBookingSystem.Repository.BusRepository;
import com.BusBookingSystem.Service.BusService;
import com.BusBookingSystem.Service.busBookingService;
import com.BusBookingSystem.Service.userService;
import com.BusBookingSystem.model.Bus;
import com.BusBookingSystem.model.Users;
import com.BusBookingSystem.model.busBooking;

@RestController
public class BusController 
{
	@Autowired
	BusService busService;
	
	@Autowired
	userService userservice;
	
	@Autowired 
	busBookingService busbookingService;
	
	@Autowired
	busBookingService busbookingservice;
	@GetMapping("/showAllBus")
	public List<Bus>getAllBus()
	{
		return busService.getAllBus();
	}
	
	@GetMapping("/showAllBooking")
	public List<busBooking>getAllbooking()
	{
		return busbookingservice.getBusBookings();
	}
	
	

    @GetMapping("/getusersmap")
    public List<Users> getAllUser()
    {
        return userservice.getAllUser();
    }
    
   
    
	
	@PostMapping("/addBus")
	public String addBus(@RequestBody Bus busModel)
	{
		busService.addBus(busModel);
		return "Bus Added";
	}
	
	@PostMapping("/bookthat")
	public String bookbus(@RequestBody busBooking booking)
	{
		busbookingservice.bookbus(booking);
		return "booked";
	}
	
	/*
	 * @PostMapping("/bookBus") public String bookBus(@RequestBody busBooking
	 * busBook) { busbookingservice.bookBus(busBook); return "seat booked"; }
	 */
	
	@DeleteMapping("/deleteBus/{id}")
	public void deleteBus(@PathVariable long id)
	{
		busService.deleteBus(id);
	}
	@RequestMapping("/userEntry")
	public String userEntry(@RequestBody Users user) 
	{
		
		userservice.userEntry(user);
		return "User Added";
    }
	
	
//	public String find(String busRoute,String name,String BusType,Model m)
//	{
//		List<Bus> list = new ArrayList<Bus>();
//		if(!busRoute.isEmpty())
//		{
//			list = busService.findBypickup(busRoute);
//		}
//		else if(!name.isEmpty())
//		{
//			list = (List<Bus>) busService.findByname(name);
//		}
//		else if(!BusType.isEmpty())
//		{
//			list = busService.findByBusType(BusType);
//		}
//		if(!list.isEmpty())
//		{
//			m.addAttribute("data", list);
//		}
//		else {
//			m.addAttribute("msg", "Sorry record not found!");
//		}
//		return "mainHome";
//	}
//	
//	@RequestMapping("/userEntry")
//	@ResponseBody
//	public String userEntry() {
//		return " Inserted data";
//	}
	

}
