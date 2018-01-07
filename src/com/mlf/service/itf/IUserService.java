package com.mlf.service.itf;

import java.util.List;

import com.mlf.domain.User;

public interface IUserService {
	
	/**
	 * 新增用户
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * 根据用户id删除用户
	 * @param id
	 */
	public void deleteUser(String id);
	
	
	/**
	 * 更新用户信息
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * 如果该雇员存在，则返回该雇员的完整信息，否则返回null
	 * @param e
	 * @return
	 */
	public User checkUser(User user);
	
	/**
	 * 显示用户
	 * @param pageSize
	 * @param pageNow
	 * @return
	 */
	public List<User> showUserList(int pageSize,int pageNow);
	
	public int getPageCount(int pageSize);
}
