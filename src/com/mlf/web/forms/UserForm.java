package com.mlf.web.forms;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
	private String userId;
	private String pwd;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
