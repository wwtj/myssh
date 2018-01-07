package com.mlf.service.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.mlf.domain.Identity;
import com.mlf.service.itf.IIdentityService;

//��������@Transactional�����ã���spring������������ӹܸ�service������
@Transactional
public class IdentityServiceImpl implements IIdentityService {

	// �����Ǹ�ĳ������������@Resource��spring������byName�ķ�ʽ��ע������ֵsessionFactory
	// �˴���sessionFactory��applicationontext�е�
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public void addIdentity(Identity identity) {
		sessionFactory.getCurrentSession().save(identity);// getCurrentSession������ֱ�Ӱ�

	}

}
