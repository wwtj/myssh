package com.mlf.service.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.mlf.domain.Identity;
import com.mlf.service.itf.IIdentityService;

//这里配置@Transactional的作用：让spring的事务管理器接管该service的事务
@Transactional
public class IdentityServiceImpl implements IIdentityService {

	// 当我们给某个属性增加了@Resource后，spring会启用byName的方式，注入属性值sessionFactory
	// 此处的sessionFactory与applicationontext中的
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public void addIdentity(Identity identity) {
		sessionFactory.getCurrentSession().save(identity);// getCurrentSession与事务直接绑定

	}

}
