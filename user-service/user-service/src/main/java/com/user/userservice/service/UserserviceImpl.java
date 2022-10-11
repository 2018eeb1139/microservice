package com.user.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.userservice.entity.User;

@Service
public class UserserviceImpl implements Userservice{

	List<User> list = List.of(
			new User(1034L,"Aman Chandra","9876543210"),
			new User(1089L,"Vivek Kumar","7658902341"),
			new User(1547L,"Harshit Shukla","1094688756"),
			new User(1999L,"Vidharbh katiyar","8765431209")
			);
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	 

}
