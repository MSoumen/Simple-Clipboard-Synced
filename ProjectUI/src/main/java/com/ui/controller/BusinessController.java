package com.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ui.entity.T_ParamInput;
import com.ui.service.BusinessFormService;

@RestController
public class BusinessController {
	
	@Autowired
	private BusinessFormService businessFormService;
	
	@GetMapping("/business/{businessId}")
	public T_ParamInput[] getBusinessDataFromProjectDB(@PathVariable("businessId")String businessId) {
//		return businessFormService.getTParamInput(businessId)[0].toString();
		return businessFormService.getTParamInput(businessId);
	}
	
}
