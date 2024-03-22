package com.insurenceapp.service;

import java.util.List;

import com.insurenceapp.exception.InsurenceNotFoundException;
import com.insurenceapp.model.Insurence;

public interface IInsurenceService {
	void addInsurence(Insurence insurence);
	void updateInsurence(int insurenceId,double premium);
	void deleteInsurence(int insurenceId );
	
	List<Insurence> getAll();
	List<Insurence> getByBrand(String brand) ;
	List<Insurence> getByBrandAndType(String brand,String type) ;
	List<Insurence> getByTypeAndLesserPremium(String type,double premium) ;
	Insurence getById(int insurenceID) ;
}
