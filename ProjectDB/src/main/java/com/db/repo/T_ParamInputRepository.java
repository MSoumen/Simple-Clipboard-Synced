package com.db.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.db.entity.T_ParamInput;

public interface T_ParamInputRepository extends JpaRepository<T_ParamInput, String> {
	
	@Query(value="select t from T_ParamInput t where t.bussinessEvent=?1")
	public List<T_ParamInput> findByBusinessEvent(String businessEvent);
}
