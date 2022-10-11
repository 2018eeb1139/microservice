
package com.contact.contactservice.service;

import java.util.List;

import com.contact.contactservice.entity.Contacts;

public interface ContactService {

	public List<Contacts> getContactsOfUser(Long UserId);
}
