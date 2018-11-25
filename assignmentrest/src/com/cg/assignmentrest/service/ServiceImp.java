package com.cg.assignmentrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignmentrest.dao.IDAO;
import com.cg.assignmentrest.entity.RegisteredCand;
@Service
public class ServiceImp implements IService {

	@Autowired
	IDAO dao;
	
	@Override
	public boolean register(RegisteredCand bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	@Override
	public List<RegisteredCand> getList() {
		// TODO Auto-generated method stub
		return dao.getList();
	}

}
