package org.viralpatel.contact.service;

import java.util.List;

import org.viralpatel.contact.form.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Long id);
}
