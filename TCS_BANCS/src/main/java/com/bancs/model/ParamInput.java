package com.bancs.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_Param_Input")
public class ParamInput implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
//	@EmbeddedId
//	private ParamId paramId;	
	
	@Column(name = "buss_event")
	private String bussinessEvent;
	
	@Id	
	@Column(name="param_name")
	private String parameterName;
	
	@Column(name = "param_size")
	private Integer parameterSize;
	
	@Column(name = "type")
	private String parameterType;
	
	@Override
	public String toString() {
		return String.format("%s %s %s %s", this.bussinessEvent, this.parameterName, this.parameterSize, this.parameterType);
//		return String.format("%s %s %s", this.paramId, this.parameterSize, this.parameterType);
	}

	public String getBussinessEvent() {
		return bussinessEvent;
	}

	public void setBussinessEvent(String bussinessEvent) {
		this.bussinessEvent = bussinessEvent;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

//	public String getParamId() {
//		return paramId.toString();
//	}
//
//	public void setParamId(ParamId paramId) {
//		this.paramId = paramId;
//	}
	
	public Integer getParameterSize() {
		return parameterSize;
	}

	public void setParameterSize(Integer parameterSize) {
		this.parameterSize = parameterSize;
	}

	public String getParameterType() {
		return parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	
	
}
