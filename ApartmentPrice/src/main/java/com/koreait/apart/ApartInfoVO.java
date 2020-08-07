package com.koreait.apart;

import org.apache.ibatis.type.Alias;

@Alias("ApartInfoVO")
public class ApartInfoVO {
	private int i_ai;
	private int deal_amount;
	private String build_year;
	private String deal_year;
	private String deal_month;
	private String deal_day;
	private String dong;
	private String apartment_name;
	private double area_for_exclusive_use;
	private String jibun;
	private int flr;
	private int location_cd;
	private String local_nm;
	
	
	
	public int getI_ai() {
		return i_ai;
	}
	public void setI_ai(int i_ai) {
		this.i_ai = i_ai;
	}
	public int getDeal_amount() {
		return deal_amount;
	}
	public void setDeal_amount(int deal_amount) {
		this.deal_amount = deal_amount;
	}
	public String getBuild_year() {
		return build_year;
	}
	public void setBuild_year(String build_year) {
		this.build_year = build_year;
	}
	public String getDeal_year() {
		return deal_year;
	}
	public void setDeal_year(String deal_year) {
		this.deal_year = deal_year;
	}
	public String getDeal_month() {
		return deal_month;
	}
	public void setDeal_month(String deal_month) {
		this.deal_month = deal_month;
	}
	public String getDeal_day() {
		return deal_day;
	}
	public void setDeal_day(String deal_day) {
		this.deal_day = deal_day;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getApartment_name() {
		return apartment_name;
	}
	public void setApartment_name(String apartment_name) {
		this.apartment_name = apartment_name;
	}
	public double getArea_for_exclusive_use() {
		return area_for_exclusive_use;
	}
	public void setArea_for_exclusive_use(double area_for_exclusive_use) {
		this.area_for_exclusive_use = area_for_exclusive_use;
	}
	public String getJibun() {
		return jibun;
	}
	public void setJiban(String jibun) {
		this.jibun = jibun;
	}
	public int getFlr() {
		return flr;
	}
	public void setFlr(int flr) {
		this.flr = flr;
	}
	public int getLocation_cd() {
		return location_cd;
	}
	public void setLocation_cd(int location_cd) {
		this.location_cd = location_cd;
	}
	public String getLocal_nm() {
		return local_nm;
	}
	public void setLocal_nm(String local_nm) {
		this.local_nm = local_nm;
	}
	
	
	
}
