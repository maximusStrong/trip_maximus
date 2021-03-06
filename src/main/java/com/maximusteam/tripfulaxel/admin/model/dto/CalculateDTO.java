package com.maximusteam.tripfulaxel.admin.model.dto;

import java.util.Date;

public class CalculateDTO {

	private int calculateNo; // 정산코드
	private String userId;
	private java.sql.Date calculateDate; // 정산 날짜 
	
	private int payment; // 가격
	
	public CalculateDTO() {	}

	public CalculateDTO(int calculateNo, String userId, java.sql.Date calculateDate, int payment) {
		super();
		this.calculateNo = calculateNo;
		this.userId = userId;
		this.calculateDate = calculateDate;
		this.payment = payment;
	}

	public int getCalculateNo() {
		return calculateNo;
	}

	public void setCalculateNo(int calculateNo) {
		this.calculateNo = calculateNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public java.sql.Date getCalculateDate() {
		return calculateDate;
	}

	public void setCalculateDate(java.sql.Date calculateDate) {
		this.calculateDate = calculateDate;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "CalculateDTO [calculateNo=" + calculateNo + ", userId=" + userId + ", calculateDate=" + calculateDate
				+ ", payment=" + payment + "]";
	}

	
	
	 
}
