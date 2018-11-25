package com.cg.assignmentrest.dao;

import java.util.List;

import com.cg.assignmentrest.entity.RegisteredCand;

public interface IDAO {
	boolean register(RegisteredCand bean);
	List<RegisteredCand> getList();
}
