package org.viralpatel.contact.businessdelegate;

import org.viralpatel.contact.service.UserService;

public class BusinessDelegate {
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
public boolean isValidUser (String user, String  password){
	return userService.isValidUser(user, password);
}
	
}
