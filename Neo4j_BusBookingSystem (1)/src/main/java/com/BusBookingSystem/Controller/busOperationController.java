package com.BusBookingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BusBookingSystem.Service.BusService;

@RestController
public class busOperationController 
{
	@Autowired
	BusService busservice;

//	 @DeleteMapping("/delete{id}")
//	    public String delete(@PathVariable String id){
//		 busservice.delete(Long.valueOf(id));
//	        return "busList.html";
//	 }

	@GetMapping("/find{str}")
	public List findByBusName(@PathVariable	String str)
	{
		
		return busservice.findBybusName(str);
		
	}
	
}
