package com.bancs.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_Dropdown")
public class Dropdown implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer dropdownId;
	
	@Column(name="name")
	private String dropdownName;

	@Column(name="buss_id")
	private String businessId;
	
	public Integer getDropdownId() {
		return dropdownId;
	}

	public void setDropdownId(Integer dropdownId) {
		this.dropdownId = dropdownId;
	}

	public String getDropdownName() {
		return dropdownName;
	}

	public void setDropdownName(String dropdownName) {
		this.dropdownName = dropdownName;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	
	
	
}
