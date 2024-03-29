package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class UserController {

	@Autowired 
	UserDao userDao;
	
	// create a method that is responsible to open signup jsp file
	// in controller class method name we can take as per feature
	// like for login -> login() , for signup -> signup()
	// in controller your method must return String
	// in controller your method must mark as public

	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("user", new UserBean());// blank
		System.out.println("Signup()");
		return "Signup"; // in the return we need pass jsp name that we want to open
	}

	@GetMapping("/login")
	public String login() {
		System.out.println("login()");
		return "Login";
	}

	// @Valid will check validation inside bean
	// if error found it return error and error flag to BindingResult
	// using BindingResult we can get idea we have validation error or not ?

	@PostMapping("/saveuser")
	public String saveUser(@jakarta.validation.Valid @ModelAttribute("user") UserBean user, BindingResult result, Model model) {
		System.out.println(result.hasErrors());
		model.addAttribute("user", user);// set the name and value to send data to jsp

		if (result.hasErrors()) {
			return "Signup";// error found re open Signup.jsp
		} else {
			userDao.addUser(user);
			System.out.println(user.getFirstName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
//    	model.addAttribute("firstName",user.getFirstName());
			return "Home";
		}
	}
	
	private UserDataRepository userDataRepository;
	@GetMapping("/listuser")
	public String listUser() {
		@Autowired

	    @GetMapping("/users")
	    public String getAllUsers(Model model) {
	        List<UserData> users = userDataRepository.findAll();
	        model.addAttribute("users", users);
	        return "user-list"; 
	}

}
}