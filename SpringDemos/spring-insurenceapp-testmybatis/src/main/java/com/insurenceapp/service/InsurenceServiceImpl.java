package com.insurenceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurenceapp.exception.InsurenceNotFoundException;
import com.insurenceapp.model.Insurence;
import com.insurenceapp.repository.IInserenceRepository;

@Service
public class InsurenceServiceImpl implements IInsurenceService{
	
	@Autowired
	IInserenceRepository inserenceRepository;
	@Override
	public void addInsurence(Insurence insurence) {
		inserenceRepository.addInsurence(insurence);
		
	}

	@Override
	public void updateInsurence(int insurenceId, double premium) {
		inserenceRepository.updateInsurence(insurenceId, premium);
		
	}

	@Override
	public void deleteInsurence(int insurenceId) {
		inserenceRepository.deleteInsurence(insurenceId);
		
	}

	@Override
	public List<Insurence> getAll() {
		
		return  inserenceRepository.getAll();
	}

	@Override
	public List<Insurence> getByBrand(String brand) {
		
		return inserenceRepository.getByBrand(brand);
	}

	@Override
	public List<Insurence> getByBrandAndType(String brand, String type) {
		
		return inserenceRepository.getByBrandAndType(brand, type);
	}

	@Override
	public List<Insurence> getByTypeAndLesserPremium(String type, double premium)  {
		// TODO Auto-generated method stub
		return inserenceRepository.getByTypeAndLesserPremium(type, premium);
	}

	@Override
	public Insurence getById(int insurenceID) {
		// TODO Auto-generated method stub
		return inserenceRepository.getById(insurenceID);
	}

	
}