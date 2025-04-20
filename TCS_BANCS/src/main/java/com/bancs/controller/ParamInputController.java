package com.bancs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bancs.model.ParamInput;
import com.bancs.service.ParamInputService;
/*
 * If you want to use @Controller then
 * to convert method returns to JSON response
 * we have to annotate that method with @ResponseBody
 * */

@RestController
@CrossOrigin(origins="*")
public class ParamInputController {
	
	@Autowired
	private ParamInputService paramInputService;
	
	@GetMapping("/bEvent/{businessEvent}")
	public List<ParamInput> getParamRecords(@PathVariable("businessEvent") String businessEvent){
		return paramInputService.getParamInputRecords(businessEvent);
	}
}
