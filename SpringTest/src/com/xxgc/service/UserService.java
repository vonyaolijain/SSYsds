package com.xxgc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxgc.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	public UserRepository userRepository;
	
  public void service(){
	 System.out.println("this is service");
	 userRepository.repository();
 }

}
