package org.viralpatel.contact.dao;

import java.util.List;

import org.viralpatel.contact.form.Contact;

public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Long id);
}
