package com.koreait.apart;

import org.apache.ibatis.type.Alias;

@Alias("LocationCdVO")
public class LocationCdVO {
	private int cd;
	private String local_nm;
	private String external_cd;
	
	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
	}
	public String getLocal_nm() {
		return local_nm;
	}
	public void setLocal_nm(String local_nm) {
		this.local_nm = local_nm;
	}
	public String getExternal_cd() {
		return external_cd;
	}
	public void setExternal_cd(String external_cd) {
		this.external_cd = external_cd;
	}
	
}
