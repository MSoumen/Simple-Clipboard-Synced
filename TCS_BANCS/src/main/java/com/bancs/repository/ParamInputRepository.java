package com.bancs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bancs.model.ParamInput;

@Repository
public interface ParamInputRepository extends JpaRepository<ParamInput, Long>{
	@Override
	@Query(value="select * from T_Param_Input", nativeQuery = true)
	public List<ParamInput> findAll();
	
	@Query(value="select * from T_Param_Input where buss_event=?", nativeQuery=true)
	public List<ParamInput> findByBusinessEvent(String businessEvent);
}
