package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.libro;

@Repository

public class LibroDAOImpl implements LibroDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<libro> findAll() {
		//TODO Auto-generated method stub
				Session session=sessionFactory.getCurrentSession();
				
				return session.createQuery("from libro",libro.class).getResultList();
	}

	
	
	
	@Override
	@Transactional
	public libro findOne(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return  session.get(libro.class,id);
	}

	@Override
	@Transactional
	public void add(libro libro) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);

	}

	@Override
	@Transactional
	public void up(libro libro) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
