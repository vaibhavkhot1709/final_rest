package com.final_rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.final_rest.model.Garden;

@Repository
public class GardenDaoImpl implements GardenDao {

//	@PersistenceContext(unitName = "  ")
//	EntityManager entityManager;
	@Autowired
	SessionFactory factory;

	@Override
	public Garden createGarden(Garden garden) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(garden);

		tx.commit();
		return garden;
	}

	public List<Garden> getAllDetail() {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Garden> gadList = session.createQuery("from Garden").list();

		return gadList;
	}

	public List<Garden> getGardenReso(/* int id, */ String name) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		List<Garden> list = new ArrayList();
//		Query query = session.createQuery("from Garden g where name=:name");
//		                                                   // g.id=:id and name=:name       
//		query.setParameter("id",id);  
//		query.setParameter("name", name);
//		list = query.list();
		
		// okkkkkkkkkkkkkkkkkk
//	=======================================================
//		System.out.println("hiiii");
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Garden> cq = cb.createQuery(Garden.class);
//		Root<Garden> root = cq.from(Garden.class);
//		cq.select(root);
//		cq.where(cb.equal(root.get("7 Garden"), name));
//		List<Garden> results = entityManager.createQuery(cq).getResultList();
//==========================================================
		
		Criteria  criteria=session.createCriteria(Garden.class);
//		criteria.add(Restrictions.eq("name", name));
		Garden gar=new Garden();
//		gar.getFruit().setFrt_name(name);
		
//		criteria.add(Restrictions.eq("fruit.frt_name", name));
		criteria.add(Restrictions.eq(gar.getFruit().getFrt_name(), name));
		
		
//		criteria.add(Restrictions.eq("frt_price", frt_price));
		
		List<Garden> gardlist=criteria.list();
		
		return gardlist;
	}

}
