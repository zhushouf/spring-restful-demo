package com.huaweisoft.training.entity;

import java.util.Date;

/**
 * 员工
 */
public class Employee {

	private Integer id; // 员工ID
	private String name; // 员工姓名
	private Integer gender; // 性别：1-男、2-女
	private String phone; // 联系电话
	private Date birthday; // 出生日期 （格式：2018-04-17）

	public Employee(Integer id, String name, Integer gender, String phone, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
