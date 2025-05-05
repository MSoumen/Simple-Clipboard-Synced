package com.bancs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancs.model.Dropdown;

@Repository
public interface DropdownRepo extends JpaRepository<Dropdown, Integer> {
	
}
