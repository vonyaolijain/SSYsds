package com.xxgc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xxgc.service.UserService;


public class UserController {
@Autowired
 public UserService userService;
 public void controller(){
	 System.out.println("this is controller");
	 userService.service();
 }
 UserController(){
	 System.out.println("this is gouz");
 }
}
