package com.cg.assignmentrest.dao;

import java.util.List;




import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.assignmentrest.entity.RegisteredCand;

@Repository
public class DAOImp implements IDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public boolean register(RegisteredCand bean) {
		// TODO Auto-generated method stub
		boolean isValid=false;
		em.merge(bean);
		em.flush();
		isValid=true;
		return isValid;
	}

	@Override
	public List<RegisteredCand> getList() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("from Course");
		List<RegisteredCand> list=query.getResultList();
		return list;
	}

}
