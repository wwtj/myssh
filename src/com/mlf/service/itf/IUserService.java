package com.mlf.service.itf;

import java.util.List;

import com.mlf.domain.User;

public interface IUserService {
	
	/**
	 * �����û�
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * �����û�idɾ���û�
	 * @param id
	 */
	public void deleteUser(String id);
	
	
	/**
	 * �����û���Ϣ
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * ����ù�Ա���ڣ��򷵻ظù�Ա��������Ϣ�����򷵻�null
	 * @param e
	 * @return
	 */
	public User checkUser(User user);
	
	/**
	 * ��ʾ�û�
	 * @param pageSize
	 * @param pageNow
	 * @return
	 */
	public List<User> showUserList(int pageSize,int pageNow);
	
	public int getPageCount(int pageSize);
}
