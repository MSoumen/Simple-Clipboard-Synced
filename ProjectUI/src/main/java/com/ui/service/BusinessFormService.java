package com.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ui.entity.T_ParamInput;

@Service
public class BusinessFormService {
	@Autowired
	private RestTemplate restTemplate;
//	public BusinessFormService(RestTemplate restTemplate) { //Constructor injection
//		this.restTemplate = restTemplate;
//	}
	
//	public T_ParamInput[] getTParamInput(String businessId) {
//		String url = "http://localhost:8081/business/"+businessId;
//		return restTemplate.getForObject(url, T_ParamInput[].class);
//		
//	}
	
	//using ResponseEntity
	public T_ParamInput[] getTParamInput(String businessId) {
		String url = "http://localhost:8081/business/"+businessId;
		ResponseEntity<T_ParamInput[]> res = restTemplate.exchange(url, HttpMethod.GET, null, T_ParamInput[].class);
		
		if(res.getStatusCode().is2xxSuccessful()) {
			System.out.println("Header: "+res.getHeaders());
			System.out.println("Class: "+res.getClass());
			return res.getBody();
		}
			
		throw new RuntimeException("Failed to fetch business Details. Status: "+res.getStatusCode());
	}
}
