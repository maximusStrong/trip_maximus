package com.maximusteam.tripfulaxel.user.model.service;

import org.springframework.stereotype.Service;

import com.maximusteam.tripfulaxel.user.model.dto.UserDTO;

/**
 * @author JJY
 *
 */
@Service
public interface UserService {

	boolean registUser(UserDTO user);
	
	int duplicationCheck(UserDTO user);

	UserDTO loginUser(UserDTO user);

	UserDTO findEmail(UserDTO user);

	UserDTO searchPwd(UserDTO user);

	boolean updateUser(UserDTO user);
	



}
