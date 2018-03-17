package com.xxgc.bean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxgc.controller.UserController;

public class Main {
public static void main(String[] args) {
	ApplicationContext act=new ClassPathXmlApplicationContext("spring.xml");
/*	UserController userController=(UserController) act.getBean("userController");
	userController.controller();*/
		UserController userController1=(UserController) act.getBean("userController");
		UserController userController2=(UserController) act.getBean("userController");
		System.out.println(userController1==userController2);
}


}
