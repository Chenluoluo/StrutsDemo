package com.city.erp.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.city.erp.factory.HibernateFactory;
import com.city.erp.model.UserModel;
import com.city.erp.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public void add(UserModel userModel) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(userModel);
		tx.commit();
		session.close();
		System.out.println("增加成功");
	}

	@Override
	public void delete(UserModel userModel) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(userModel);
		tx.commit();
		session.close();
		System.out.println("删除成功");
	}

	@Override
	public List<UserModel> getAllList() throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String sql = "from UserModel";
		Query<UserModel> query = session.createQuery(sql, UserModel.class);
		List<UserModel> list = query.getResultList();
		tx.commit();
		session.close();
		System.out.println("获取成功");
		return list;
	}

}
