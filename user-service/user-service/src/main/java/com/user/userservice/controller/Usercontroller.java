package com.user.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.userservice.entity.User;
import com.user.userservice.service.Userservice;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	@Autowired
	private Userservice userService;
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = this.userService.getUser(userId);
		List contacts =this.restTemplate.getForObject("http://localhost:9002/contact/user/" + user.getUserId(), List.class);
		user.setContacts(contacts);
		return user;
	}
}
