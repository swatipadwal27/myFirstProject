package com.BusBookingSystem.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.BusBookingSystem.Service.BusService;
import com.BusBookingSystem.Service.userService;
import com.BusBookingSystem.model.Bus;
import com.BusBookingSystem.model.Users;

@Controller
public class HomeController 
{
	
	@Autowired
	private userService userservice;
	
	@Autowired
	private BusService busservice;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@RequestMapping("/bushere")
	public String bushere(Model model) 
	{
		
		return "busList.html";
	}
	
	@RequestMapping("/addproduct")
	public String addproduct() 
	{
		
		return "addproduct.html";
	}
	
	
	@RequestMapping("/getusers")
	public String getusers(Model model) 
	{
		
		return "getusers.html";
	}

	@RequestMapping("/")
	public String home() 
	{
		
		return "mainHome.html";
	}
	

	@RequestMapping("/login")
	public String login() 
	{
		
		return "login.html";
	}
	
	@RequestMapping("/login1")
	public String login1() 
	{
		
		return "login.html";
	}
	
	
	@RequestMapping("/userHome")
	public String userHome()
	{
		
		return "userHome.html";
	}
	
	

	@RequestMapping("/adminHome")
	public String adminHome()
	{
		
		return "adminHome.html";
	}
	
	
	
	@RequestMapping(value="/signUpPage")
	public String signUp() {
		return "signUp.html";
	}
	
	@RequestMapping(value="/signUp",method = RequestMethod.POST)
	public String signUp(@RequestParam String username,@RequestParam String password,@RequestParam String role) {
		
		
		
		Users user=new Users();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		user.setRole(role);
		userservice.signUp(user);
			
		return "login.html";
	}
	
	@RequestMapping(value="/index")
	public String index() {
		return "index.html";
	}
	
	
	
	
	
	
	@RequestMapping("/mainHome")
	public String mainhome() 
	{
		
		return "mainHome.html";
	}
	
	@RequestMapping("AddBus")
	public String addbus() 
	{
		
		return "AddBus.html";
	}
	
	@RequestMapping("contact")
	public String contact() 
	{
		
		return "contact.html";
	}
	
	@RequestMapping("first")
	public String first() 
	{
		
		return "first.html";
	}
	

	@RequestMapping("busseat")
	public String seatplan() 
	{
		
		return "busseat.html";
	}
	
	@RequestMapping("/ticket")
	public String ticket() 
	{
		
		return "ticket.html";
	}
}
