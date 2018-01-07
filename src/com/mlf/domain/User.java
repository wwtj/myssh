package com.mlf.domain;

public class User {
	public User(){
		
	}
	
	public User(String userId, String userName, String pwd, String tel, String identityId, double balance) {
		this.userId = userId;
		this.userName = userName;
		this.pwd = pwd;
		this.tel = tel;
		this.identityId = identityId;
		this.balance = balance;
	}

	private String userId;
	private String userName;
	private String pwd;
	private String tel;
	private String identityId;
	private double balance;
	
	//配一个对象 User-->Identity
	private Identity identity;

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
