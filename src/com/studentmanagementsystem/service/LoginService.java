package com.studentmanagementsystem.service;

import com.studentmanagementsystem.modal.UserModal;

public class LoginService {
	
	
	public static String currentLoggedInUsser= null;
	
	
	private static LoginService loginService = new LoginService();
	
	public static LoginService getInstance() {
		return loginService;
	}

	
	public boolean isValidUser(String userName, String password) {
		System.out.println(userName + ", " + password);
		UserModal user = UserService.getInstance().getUserByUserName(userName);
		return user != null ? user.getPassword().equals(password) : false;
	}

}
