package com.city.oa.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.city.oa.factory.HibernateFactory;
import com.city.oa.model.IPModel;
import com.city.oa.service.IIPService;

public class IPServiceImpl implements IIPService{

	@Override
	public void add(IPModel im) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(im);
		tx.commit();
		session.close();
		System.out.println("登陆成功");
	}

	@Override
	public boolean check(String ip) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String sql = "from IPModel";
		Query<IPModel> query = session.createQuery(sql, IPModel.class);
		List<IPModel> list = query.getResultList();
		tx.commit();
		session.close();
		System.out.println("获取成功");
		for (IPModel ipModel : list) {
			if(ip.equals(ipModel.getIp()))
				return true;
		}
		return false;
	}

}
