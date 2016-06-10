package org.viralpatel.contact.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.viralpatel.contact.service.ContactService;
import org.viralpatel.contact.service.UserService;
import org.viralpatel.contact.businessdelegate.BusinessDelegate;
import org.viralpatel.contact.businessdelegate.LocalizadorServicios;
import org.viralpatel.contact.form.Contact;
import org.viralpatel.contact.form.Users;

 
@Controller
public class MyController {
	boolean flagIn = false;
	
	@Autowired
	private ContactService contactService;
	
	//private BusinessDelegate businessLogic = (BusinessDelegate) LocalizadorServicios.getInstance().obtenerBean("businessLogic");

	@Autowired
	private UserService userService;
	
   public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
   public String homePage(Model model) {
       return "homePage";
   }
 
    
   @RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
   public String contactusPage(Model model) {
       model.addAttribute("address", "Vietnam");
       model.addAttribute("phone", "...");
       model.addAttribute("email", "...");
       return "contactusPage";
   }
   @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
   public String login(Map<String, Object> map) {
       map.put("user", new Users());
       return "login";
   }
   
   @RequestMapping("/room")
	public String listContacts(Map<String, Object> map) {

		map.put("contact", new Contact());
		map.put("contactList", contactService.listContact());

		return "contact";
	}
   
   @RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
	Contact contact, BindingResult result) {

		contactService.addContact(contact);

		return "redirect:/room";
	}
   
   @RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId")
	Long contactId) {

		contactService.removeContact(contactId);

		return "redirect:/room";
	}
   /****User*****/
   
   @RequestMapping("/user")
  	public String listUser(Map<String, Object> map) {

  		map.put("user", new Users());
  		map.put("userList", userService.listUser());

  		return "userList";
  	}
   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user")
	Users user, BindingResult result) {

	   userService.addUser(user);

		return "redirect:/user";
	}
  
  @RequestMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable("userId")
	Long userId) {

	  userService.removeUser(userId);

		return "redirect:/user";
	}
  
  /****Login****/
  
  @RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("user")
	Users user, BindingResult result) {
	  String entrada;
	  boolean isValidUser = userService.isValidUser(user.getUser(), user.getPassword());
	  if(isValidUser){
		  request.setAttribute("login", user.getUser());
		  
	  }else{
		  request.setAttribute("message", "Invalid Credentials");
	  }
	  return "homePage";
	}
  
  
}