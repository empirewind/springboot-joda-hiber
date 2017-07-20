package com.nerv.jodahiber.vo;

public class UserAndProvVo {

	private Long pId;
	
	private String pName;
	
	private String country;
	
	private Long uId;
	
	private String name;
	
	private Integer age;

	
	
	public UserAndProvVo(Long pId, Long uId, String name) {
		super();
		this.pId = pId;
		this.uId = uId;
		this.name = name;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
