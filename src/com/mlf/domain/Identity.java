package com.mlf.domain;

import java.util.Set;

public class Identity {
	
	public Identity(String identityId, String identityName) {
		this.identityId = identityId;
		this.identityName = identityName;
	}

	public Identity() {
		
	}
	
	

	private String identityId;

	private String identityName;

	private Set<User> userSet;

	public Set<User> getUserSet() {
		return userSet;
	}

	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getIdentityName() {
		return identityName;
	}

	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}
}
