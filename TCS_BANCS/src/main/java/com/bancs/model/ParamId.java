package com.bancs.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ParamId implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Column(name = "buss_event")
	private String bussinessEvent;
	
//	@Column(name="param_name")//,insertable=false, updatable=false)
	private String parameterName;
	
	@Override
	public String toString() {
		return String.format("%s %s",bussinessEvent, parameterName);
	}
}
