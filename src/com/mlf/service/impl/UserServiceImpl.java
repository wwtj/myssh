package com.mlf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.mlf.domain.Identity;
import com.mlf.domain.User;
import com.mlf.service.itf.IUserService;

//��������@Transactional�����ã���spring������������ӹܸ�service������
@Transactional
public class UserServiceImpl implements IUserService {

	//�����Ǹ�ĳ������������@Resource��spring������byName�ķ�ʽ��ע������ֵsessionFactory
	//�˴���sessionFactory��applicationontext�е�
	@Resource
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);// getCurrentSession������ֱ�Ӱ�

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
		
		//��ʾ��ʼ��������
//		Hibernate.initialize(Identity.class);//selectԤ�Ȳ�ѯ
		
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
