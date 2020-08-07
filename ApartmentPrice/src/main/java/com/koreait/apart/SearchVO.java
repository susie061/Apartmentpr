package com.koreait.apart;

import org.apache.ibatis.type.Alias;

@Alias("SearchVO")
public class SearchVO {
	private int year;
	private int mon;
	private String locationCd;
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMon() {
		return mon;
	}
	public void setMon(int mon) {
		this.mon = mon;
	}
	public String getLocationCd() {
		return locationCd;
	}
	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}
	
	
}
