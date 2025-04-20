package com.bancs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancs.model.ParamInput;
import com.bancs.repository.ParamInputRepository;

@Service
public class ParamInputService {
	@Autowired
	private ParamInputRepository paramInputRepository;
	
	public List<ParamInput> getAllParamInputs(){
		return paramInputRepository.findAll(); 
	}
	
	public List<ParamInput> getParamInputRecords(String businessEvent){
		return paramInputRepository.findByBusinessEvent(businessEvent);
	}
	
}
