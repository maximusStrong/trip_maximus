package com.maximusteam.tripfulaxel.user.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.maximusteam.tripfulaxel.user.model.dao.UserMapper;
import com.maximusteam.tripfulaxel.user.model.dto.UserDTO;

/**
 * @author JJY
 *
 */
@Repository
public class UserServiceImpl implements UserService {

	private final UserMapper mapper;
	
	
	@Autowired
	public UserServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
		
	}



	/**
	 * 회원가입용 메소드
	 */
	@Override
	public boolean registUser(UserDTO user) {
		
		return mapper.registUser(user) > 0? true:false;
	}

	/**
	 * 이메일 중복체크용
	 */
	@Override
	public int duplicationCheck(UserDTO user) {
		
		return mapper.duplicationCheck(user);
	}
	
	/**
	 * 로그인용 메소드
	 */
	@Override
	public UserDTO loginUser(UserDTO user) {
		
		return mapper.loginUser(user);
	}



	/**
	 * 이메일 찾기 메소드
	 */
	@Override
	public UserDTO findEmail(UserDTO user) {
		
		return mapper.findEmail(user);
	}



	/**
	 * 비밀번호 찾기 메소드 
	 */
	@Override
	public UserDTO searchPwd(UserDTO user) {
	
		return mapper.searchPwd(user);
	}



	/**
	 * 비밀번호 업데이트 메소드
	 */
	@Override
	public boolean updateUser(UserDTO user) {
		
		int result = mapper.updateUser(user);
		
		return result > 0? true : false;
	}









}
