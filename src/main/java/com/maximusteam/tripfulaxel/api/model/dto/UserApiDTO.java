package com.maximusteam.tripfulaxel.api.model.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserApiDTO {

	private int userCode;
	private String userName;
	private String userPhone;
	@JsonIgnore
	private String userPwd;
	private String userBday;
	private String userGender;
	private String userEmail;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date userRegisterDay;
	private int userReportCount;
	private String userGuideYN;
	
	public UserApiDTO() {
		super();
	
	}

	public UserApiDTO(int userCode, String userName, String userPhone, String userPwd, String userBday, String userGender,
			String userEmail, Date userRegisterDay, int userReportCount, String userGuideYN) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userPwd = userPwd;
		this.userBday = userBday;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userRegisterDay = userRegisterDay;
		this.userReportCount = userReportCount;
		this.userGuideYN = userGuideYN;
	}

	public int getUserCode() {
		return userCode;
	}


	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public String getUserBday() {
		return userBday;
	}


	public void setUserBday(String userBday) {
		this.userBday = userBday;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public Date getUserRegisterDay() {
		return userRegisterDay;
	}


	public void setUserRegisterDay(Date userRegisterDay) {
		this.userRegisterDay = userRegisterDay;
	}


	public int getUserReportCount() {
		return userReportCount;
	}


	public void setUserReportCount(int userReportCount) {
		this.userReportCount = userReportCount;
	}


	public String getUserGuideYN() {
		return userGuideYN;
	}


	public void setUserGuideYN(String userGuideYN) {
		this.userGuideYN = userGuideYN;
	}

	@Override
	public String toString() {
		return "UserDTO [userCode=" + userCode + ", userName=" + userName + ", userPhone=" + userPhone + ", userPwd="
				+ userPwd + ", userBday=" + userBday + ", userGender=" + userGender + ", userEmail=" + userEmail
				+ ", userRegisterDay=" + userRegisterDay + ", userReportCount=" + userReportCount + ", userGuideYN="
				+ userGuideYN + "]";
	}
}
