package com.maximusteam.tripfulaxel.guide.model.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TripDTO {

	private int tripCode;
	private String tripTitle;
	private String tripIntro;
	@JsonFormat(pattern = "yyyyMMdd")
	private Date tripStartDate;
	private String meetLocation;
	private String include;
	private String exclude;
	@JsonFormat(pattern = "yyyyMMdd")
	private Date tripEndDate;
	
	public TripDTO() {
		super();
	}
	public TripDTO(int tripCode, String tripTitle, String tripIntro, Date tripStartDate, String meetLocation,
			String include, String exclude, Date tripEndDate) {
		super();
		this.tripCode = tripCode;
		this.tripTitle = tripTitle;
		this.tripIntro = tripIntro;
		this.tripStartDate = tripStartDate;
		this.meetLocation = meetLocation;
		this.include = include;
		this.exclude = exclude;
		this.tripEndDate = tripEndDate;
	}
	public int getTripCode() {
		return tripCode;
	}
	public void setTripCode(int tripCode) {
		this.tripCode = tripCode;
	}
	public String getTripTitle() {
		return tripTitle;
	}
	public void setTripTitle(String tripTitle) {
		this.tripTitle = tripTitle;
	}
	public String getTripIntro() {
		return tripIntro;
	}
	public void setTripIntro(String tripIntro) {
		this.tripIntro = tripIntro;
	}
	public Date getTripStartDate() {
		return tripStartDate;
	}
	public void setTripStartDate(Date tripStartDate) {
		this.tripStartDate = tripStartDate;
	}
	public String getMeetLocation() {
		return meetLocation;
	}
	public void setMeetLocation(String meetLocation) {
		this.meetLocation = meetLocation;
	}
	public String getInclude() {
		return include;
	}
	public void setInclude(String include) {
		this.include = include;
	}
	public String getExclude() {
		return exclude;
	}
	public void setExclude(String exclude) {
		this.exclude = exclude;
	}
	public Date getTripEndDate() {
		return tripEndDate;
	}
	public void setTripEndDate(Date tripEndDate) {
		this.tripEndDate = tripEndDate;
	}
	@Override
	public String toString() {
		return "TripDTO [tripCode=" + tripCode + ", tripTitle=" + tripTitle + ", tripIntro=" + tripIntro
				+ ", tripStartDate=" + tripStartDate + ", meetLocation=" + meetLocation + ", include=" + include
				+ ", exclude=" + exclude + ", tripEndDate=" + tripEndDate + "]";
	}
}
