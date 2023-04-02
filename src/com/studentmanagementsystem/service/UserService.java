package com.studentmanagementsystem.service;

import java.util.HashMap;
import java.util.Map;

import com.studentmanagementsystem.modal.UserModal;

public class UserService {
	
	Map<String, UserModal> usersMap = new HashMap<>();
	
	private static UserService userService = new UserService();
	
	private UserService() {
		UserModal modal = new UserModal();
		modal.setUserName("s");
		modal.setPassword("s");
		usersMap.put("s", modal);
	}
	
	public static UserService getInstance() {
		
		return userService;
	}
	
	
	public UserModal getUserByUserName(String userName) {
		
		return usersMap.get(userName);
	}

	
	public UserModal saveUser(UserModal user) {
		return usersMap.put(user.getUserName(), user);
	}
}
