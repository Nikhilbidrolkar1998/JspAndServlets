package com.greetapp.service;

import java.util.List;

import com.greetapp.model.Insurence;

public interface IInsurenceService {
	List<Insurence> getAll();
	Insurence getById(int insurenceID);
}
