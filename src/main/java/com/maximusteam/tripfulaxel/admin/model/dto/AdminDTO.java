package com.maximusteam.tripfulaxel.admin.model.dto;

import java.util.Date;

public class AdminDTO {
	
	private int adminNo;
	private String adminPosition;
	private String adminName;
	private String adminEmail;
	private java.sql.Date hireDate;
	private int adminPwd;
	
	public AdminDTO() {}

	public AdminDTO(int adminNo, String adminPosition, String adminName, String adminEmail, java.sql.Date hireDate,
			int adminPwd) {
		super();
		this.adminNo = adminNo;
		this.adminPosition = adminPosition;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.hireDate = hireDate;
		this.adminPwd = adminPwd;
	}

	public int getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}

	public String getAdminPosition() {
		return adminPosition;
	}

	public void setAdminPosition(String adminPosition) {
		this.adminPosition = adminPosition;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public java.sql.Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(java.sql.Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(int adminPwd) {
		this.adminPwd = adminPwd;
	}

	@Override
	public String toString() {
		return "AdminDTO [adminNo=" + adminNo + ", adminPosition=" + adminPosition + ", adminName=" + adminName
				+ ", adminEmail=" + adminEmail + ", hireDate=" + hireDate + ", adminPwd=" + adminPwd + "]";
	}

	
	
	

}
