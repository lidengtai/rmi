package com.taylor.rmi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taylor.rmi.common.IUserService;
import com.taylor.rmi.common.bean.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value="/v1")
@Slf4j
public class TestController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/getUser")
	public User getUser(){
		return userService.getUserByName("admin");
	}
	
}
