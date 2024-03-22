package com.insurenceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insurenceapp.model.Insurence;

@Service
public class InsurenceServiceImpl implements IInsurenceService{

	@Override
	public List<Insurence> getAll() {
		List<Insurence> insurences=getAllInsurences();
		return insurences;
	}

	@Override
	public Insurence getById(int insurenceId) {
		List<Insurence> insurences=getAllInsurences();
		for(Insurence insurence:insurences) {
			if(insurence.getInsuranceId()==insurenceId) {
				return insurence;
			}
		}
		return null;
	}
	
	private List<Insurence> getAllInsurences(){
		return Arrays.asList(
				new Insurence(101, "V0-H001", "voya", "health", 10, 1000),
				new Insurence(102, "BJ-M01", "Bajaj", "Motor", 10, 5000),
				new Insurence(103, "FI-LIFE", "Fidelity", "life", 15, 8000),
				new Insurence(104, "V0-Mx01", "voya", "Motor", 12, 3000)
				);
	}
}
