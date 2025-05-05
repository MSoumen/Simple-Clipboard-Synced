package com.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.entity.T_ParamInput;
import com.db.repo.T_ParamInputRepository;

@Service
public class T_ParamInputService {
	@Autowired
	private T_ParamInputRepository paramInputRepository;
	
	public List<T_ParamInput> getDataUsingBusinessEvent(String businessEvent){
		return paramInputRepository.findByBusinessEvent(businessEvent);
	}
}
