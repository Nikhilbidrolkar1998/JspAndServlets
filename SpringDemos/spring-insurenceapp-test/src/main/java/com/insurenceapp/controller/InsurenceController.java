package com.insurenceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurenceapp.model.Insurence;
import com.insurenceapp.service.IInsurenceService;

@RestController
public class InsurenceController {
	
	@Autowired
	IInsurenceService insurenceService;
	
	@GetMapping("/insurences")
	List<Insurence> shoeInsurences(){
		return insurenceService.getAll();
		}
	
	@GetMapping("/insurences/insurence-id/{insurenceId}")
	Insurence getOne(@PathVariable("insurenceId") int insurenceId){
		return insurenceService.getById(insurenceId);
		}
	}