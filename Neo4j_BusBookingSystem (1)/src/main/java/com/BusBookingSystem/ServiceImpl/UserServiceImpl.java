package com.BusBookingSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BusBookingSystem.Repository.UserRepository;
import com.BusBookingSystem.Service.userService;
import com.BusBookingSystem.model.Users;

@Service
@Transactional
public class UserServiceImpl implements userService

{

	@Autowired
	UserRepository userRepository;
	@Override
	public void userEntry(Users user)
	{
	  user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
	  userRepository.save(user);
	  
		
	}
	@Override
	public List<Users> getAllUser() 
	{
		return userRepository.findAll();	
	}
	@Override
	public void signUp(Users user)
	{
		userRepository.save(user);
		
	}
	@Override
	public List<Users> findAll() 
	{
		return userRepository.findAll();
	}
	
	

}
