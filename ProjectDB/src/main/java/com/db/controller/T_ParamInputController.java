package com.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.entity.T_ParamInput;
import com.db.service.T_ParamInputService;

@RestController
@CrossOrigin("*")
public class T_ParamInputController {
	@Autowired
	private T_ParamInputService paramInputService;
	
	@GetMapping("/business/{businessEvent}")
	public List<T_ParamInput> getT_ParamInput(@PathVariable("businessEvent") String businessEvent) {
		return paramInputService.getDataUsingBusinessEvent(businessEvent);
	}
	
}
