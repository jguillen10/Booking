package org.viralpatel.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.viralpatel.contact.dao.UserDAO;
import org.viralpatel.contact.form.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Transactional
	public void addUser(Users users) {
		userDAO.addUser(users);
	}

	@Transactional
	public List<Users> listUser() {

		return userDAO.listUsers();
	}

	@Transactional
	public void removeUser(Long id) {
		userDAO.removeUser(id);
	}
	public boolean isValidUser(String user, String password){
		
		return userDAO.isValidUser(user, password);
	}
}
