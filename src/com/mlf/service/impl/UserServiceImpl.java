package com.mlf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.mlf.domain.Identity;
import com.mlf.domain.User;
import com.mlf.service.itf.IUserService;

//这里配置@Transactional的作用：让spring的事务管理器接管该service的事务
@Transactional
public class UserServiceImpl implements IUserService {

	//当我们给某个属性增加了@Resource后，spring会启用byName的方式，注入属性值sessionFactory
	//此处的sessionFactory与applicationontext中的
	@Resource
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);// getCurrentSession与事务直接绑定

	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User checkUser(User user) {
		// TODO Auto-generated method stub
		String hql = "from User where userId = ? and pwd = ?";
		List<User> userList = sessionFactory.getCurrentSession().createQuery(hql).setString(0, user.getUserId())
				.setString(1, user.getPwd()).list();
		
		//显示初始化懒加载
//		Hibernate.initialize(Identity.class);//select预先查询
		
		if(userList.size() == 1){
			return userList.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<User> showUserList(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPageCount(int pageSize) {
		// TODO Auto-generated method stub
		return 0;
	}

}
