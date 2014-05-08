package com.tofdragon.jsf.ums;

import java.io.Serializable;
import java.util.List;

import com.tofdragon.application.ums.UserService;
import com.tofdragon.core.ums.model.User;

//@Component
//@Scope("session")
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@Autowired
	private UserService userService;
	
	public UserBean(){
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String printMsgFromSpring() {
		List<User> users = userService.getAllUsers();
		System.out.println(users);
		return "Hello JSF2 + Spring + Hibernate";
	}
}
