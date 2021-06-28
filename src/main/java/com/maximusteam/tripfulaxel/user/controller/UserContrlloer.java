package com.maximusteam.tripfulaxel.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maximusteam.tripfulaxel.user.model.dto.UserDTO;
import com.maximusteam.tripfulaxel.user.model.service.UserService;

/**
 * @author JJY
 *
 */
@Controller
@RequestMapping("/user/*")
public class UserContrlloer {

	 private final UserService userservice; 
	 
	 @Autowired
	public UserContrlloer(UserService userservice) {
		this.userservice = userservice;
	}



	/**
	 * 회원가입을 위한 메소드
	 * 
	 * @param user
	 * @param request
	 */
	/*
	 * public UserContrlloer(@ModelAttribute UserDTO user, HttpServletRequest
	 * request) {
	 * 
	 * System.out.println(user);
	 * 
	 * return 0;
	 * 
	 * }
	 */
	 

}
