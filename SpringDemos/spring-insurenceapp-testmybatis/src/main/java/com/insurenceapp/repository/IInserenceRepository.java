package com.insurenceapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.insurenceapp.model.Insurence;

@Mapper
public interface IInserenceRepository {
	@Insert("insert into insurence(insurance_id,policy_name,brand,type,duration,premium) values(#{insurenceId},#{policyName},#{brand},#{type},#{duration},#{premium})")
	void addInsurence(Insurence insurence);
	
	@Update("update insurence set premium=#{premium} where insurance_id=#{insurenceId}")
	void updateInsurence(int insurenceId,double premium);
	
	@Delete("delete from insurence where insurance_id=#{insurenceId}")
	void deleteInsurence(int insurenceId );
	
	@Select("select * from insurence")
	@Results({
			@Result(property = "insurenceId",column = "insurance_id"),
			@Result(property = "policyName",column = "policy_name"),
			
	})
	List<Insurence> getAll();
	
	@Select("select * from insurence where brand=#{brand}")
	@Results({
		@Result(property = "insurenceId",column = "insurance_id"),
		@Result(property = "policyName",column = "policy_name"),
		
})
	List<Insurence> getByBrand(String brand);
	
	@Select("select * from insurence where brand=#{brand} and type=#{type}")
	@Results({
		@Result(property = "insurenceId",column = "insurance_id"),
		@Result(property = "policyName",column = "policy_name"),
		
})
	List<Insurence> getByBrandAndType(String brand,String type);
	
	@Select("select * from insurence where type=#{type} and premium<#{premium}")
	@Results({
		@Result(property = "insurenceId",column = "insurance_id"),
		@Result(property = "policyName",column = "policy_name"),
		
})
	List<Insurence> getByTypeAndLesserPremium(String type,double premium) ;
	
	
	Insurence getById(int insurenceID);
}
