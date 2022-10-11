package com.contact.contactservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contactservice.entity.Contacts;
@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contacts> list=List.of(
				new Contacts(1L,"amanapc@gmail.com","Aman",1034L),
				new Contacts(2L,"apcaman@gmail.com","Aman1",1034L),
				new Contacts(3L,"amanpratapchandra@gmail.com","Aman Chandra",1034L),
				new Contacts(4L,"hsempire@gmail.com","Harshit",1547L),
				new Contacts(5L,"harshit@gmail.com","Harshit S",1547L),
				new Contacts(6L,"vivekvkp@gmail.com","Vivek",1089L),
				new Contacts(7L,"vkp@gmail.com","Vivek P",1089L),
				new Contacts(8L,"vidharbh@gmail.com","Vidharbh",1999L)
			);
	
	@Override
	public List<Contacts> getContactsOfUser(Long UserId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(UserId)).collect(Collectors.toList());
	}
  
}
