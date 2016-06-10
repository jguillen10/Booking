package org.viralpatel.contact.dao;

import java.util.List;

import org.viralpatel.contact.form.Users;

public interface UserDAO {
	
	public void addUser(Users user);
	public List<Users> listUsers();
	public void removeUser(Long id);
	
	public boolean isValidUser(String user, String password);
}
