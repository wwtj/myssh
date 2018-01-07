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
	 * ��¼
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
		// ȡ����,������û�ʵ��
		UserForm userForm = (UserForm) form;
		User user = new User();
		user.setUserId(userForm.getUserId());
		user.setPwd(userForm.getPwd());
		//����û��Ƿ����
		user = userServiceImpl.checkUser(user);
		
		if (user != null) {
			//��user����session�У��Ա�����
			request.getSession().setAttribute("loginUser", user);
			return mapping.findForward("success");
		} else {
			return mapping.findForward("fail");
		}
	}

	/**
	 * �˳�
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
