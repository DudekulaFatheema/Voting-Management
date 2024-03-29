package com.voter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name = "voter")
public class Voter {
	
	@Id
	@GeneratedValue
	private int voterId;
	   private String name;
	private String gender;
	private int age;
	private long phoneNumber;
	private String userName;
	private String passWord;
	
	
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Voter(int voterId, String gender, int age, long phoneNumber, String userName, String passWord) {
		super();
		this.voterId = voterId;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.passWord = passWord;
	}


	public int getVoterId() {
		return voterId;
	}


	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}

	


	
