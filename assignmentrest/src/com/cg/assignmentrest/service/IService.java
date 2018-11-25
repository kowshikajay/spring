package com.cg.assignmentrest.service;

import java.util.List;

import com.cg.assignmentrest.entity.RegisteredCand;

public interface IService {
	boolean register(RegisteredCand bean);
	List<RegisteredCand> getList();
}
