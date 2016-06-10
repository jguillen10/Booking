package org.viralpatel.contact.service;

import java.util.List;

import org.viralpatel.contact.form.Users;;

public interface UserService {
	
	public void addUser(Users users);
	public List<Users> listUser();
	public void removeUser(Long id);
	
	public boolean isValidUser(String user, String password);
}
