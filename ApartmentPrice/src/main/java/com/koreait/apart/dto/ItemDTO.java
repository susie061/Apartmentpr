package com.koreait.apart.dto;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@Alias("ItemDTO")
@JacksonXmlRootElement(localName="item")
public class ItemDTO {
	@JacksonXmlProperty(localName="거래금액")
	private String dealAmount;
	
	@JacksonXmlProperty(localName="건축년도")
	private int buildYear;
	
	@JacksonXmlProperty(localName="년")
	private int dealYear;
	
	@JacksonXmlProperty(localName="법정동")
	private String dong;
	
	@JacksonXmlProperty(localName="아파트")
	private String apartmentName;
	
	@JacksonXmlProperty(localName="월")
	private int dealMonth;
	
	@JacksonXmlProperty(localName="일")
	private int dealDay;
	
	@JacksonXmlProperty(localName="전용면적")
	private double areaForExclusiveUse;
	
	@JacksonXmlProperty(localName="지번")
	private String jibun;
	
	@JacksonXmlProperty(localName="층")
	private int flr;
	
	@JacksonXmlProperty(localName="지역코드")
	private String regionCode;
	
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionalCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}
	public int getBuildYear() {
		return buildYear;
	}
	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}
	public int getDealYear() {
		return dealYear;
	}
	public void setDealYear(int dealYear) {
		this.dealYear = dealYear;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public int getDealMonth() {
		return dealMonth;
	}
	public void setDealMonth(int dealMonth) {
		this.dealMonth = dealMonth;
	}
	public int getDealDay() {
		return dealDay;
	}
	public void setDealDay(int dealDay) {
		this.dealDay = dealDay;
	}
	public double getAreaForExclusiveUse() {
		return areaForExclusiveUse;
	}
	public void setAreaForExclusiveUse(double areaForExclusiveUse) {
		this.areaForExclusiveUse = areaForExclusiveUse;
	}
	public String getJibun() {
		return jibun;
	}
	public void setJibun(String jibun) {
		this.jibun = jibun;
	}
	public int getFlr() {
		return flr;
	}
	public void setFlr(int flr) {
		this.flr = flr;
	}
}
