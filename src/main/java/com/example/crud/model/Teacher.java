package com.example.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {
	@Id
	@Column
	private int teacherid;
	@Column
	private String teachername;
	@Column
	private String address;

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}