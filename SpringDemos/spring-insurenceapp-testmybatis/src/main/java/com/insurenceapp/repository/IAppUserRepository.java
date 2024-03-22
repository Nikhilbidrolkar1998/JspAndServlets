package com.insurenceapp.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.insurenceapp.model.AppUser;

@Mapper
public interface IAppUserRepository {
	@Insert("insert into appuser values(#{userId},#{userName},#{password},#{email})")
	void addUser(AppUser user);
	
	@Select("select * from appuser where username=#{userName}")
	AppUser findByUser(String username);
}
