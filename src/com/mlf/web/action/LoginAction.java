package com.mlf.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mlf.domain.User;
import com.mlf.service.itf.IUserService;
import com.mlf.web.forms.UserForm;

public class LoginAction extends DispatchAction {

	@Resource
	private IUserService userServiceImpl;
	
	public void setUserService(IUserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	/**
	 * 登录
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 取出表单,构造出用户实例
		UserForm userForm = (UserForm) form;
		User user = new User();
		user.setUserId(userForm.getUserId());
		user.setPwd(userForm.getPwd());
		//检查用户是否存在
		user = userServiceImpl.checkUser(user);
		
		if (user != null) {
			//吧user放入session中，以备后用
			request.getSession().setAttribute("loginUser", user);
			return mapping.findForward("success");
		} else {
			return mapping.findForward("fail");
		}
	}

	/**
	 * 退出
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward logout(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return super.execute(mapping, form, request, response);
	}
}
