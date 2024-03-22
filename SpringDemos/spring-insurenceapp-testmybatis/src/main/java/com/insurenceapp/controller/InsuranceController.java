package com.insurenceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurenceapp.exception.InsurenceNotFoundException;
import com.insurenceapp.model.Insurence;
import com.insurenceapp.service.IInsurenceService;

@RestController
@RequestMapping("/insurence-api/v1")
public class InsuranceController {
	
	@Autowired
	IInsurenceService iInsurenceService;
	
	@PostMapping("/insurences")
	ResponseEntity<Void> addInsurence(@RequestBody Insurence insurence) {
		iInsurenceService.addInsurence(insurence);
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
	}
	
	@PutMapping("/insurences")
	ResponseEntity<Void> updateInsurence(@RequestBody Insurence insurence) {
		iInsurenceService.updateInsurence(insurence.getInsurenceId(), insurence.getPremium());
		return ResponseEntity.accepted().build();
	}
	
	@DeleteMapping("/insurences/insurence-id/{insurenceId}")
	ResponseEntity<Void> deleteInsurence(int insurenceId ) {
		iInsurenceService.deleteInsurence(insurenceId);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/insurences")
	ResponseEntity<List<Insurence>>  getAll(){
		HttpHeaders headers=new HttpHeaders();
		headers.add("info","return list of insurences");
		headers.add("desc","All insurences from db");
		List<Insurence> insurences=iInsurenceService.getAll();
		ResponseEntity<List<Insurence>> entity=new ResponseEntity<>(insurences,headers,HttpStatus.OK);
		return entity;
		
	}
	
	@GetMapping("//insurences/brand/{brand}")
	ResponseEntity<List<Insurence>> getByBrand(@PathVariable("brand") String brand){
		List<Insurence> insurences=iInsurenceService.getByBrand(brand);
		HttpHeaders headers=new HttpHeaders();
		headers.add("info", "return list of insurences ny brand");
		return ResponseEntity.status(200).headers(headers).body(insurences); 
		
	}
	
	@GetMapping("/insurences/brand/{brand}/type/{type}")
	ResponseEntity<List<Insurence>> getByBrandAndType(@PathVariable("brand") String brand,@PathVariable("type") String type){
		List<Insurence> insurences=iInsurenceService.getByBrandAndType(brand, type);
		return ResponseEntity.ok(insurences);
		
	}
	
	@GetMapping("/insurences/type-premium")
	ResponseEntity<List<Insurence>> getByTypeAndLesserPremium(@RequestParam("type") String type,@RequestParam("premium") double premium){
		List<Insurence> insurences=iInsurenceService.getByTypeAndLesserPremium(type, premium);
		HttpHeaders headers=new HttpHeaders();
		headers.add("info", "return list of insurences by type premium");
		return ResponseEntity.accepted().headers(headers).body(insurences);
		
	}
	
	@GetMapping("/insurences/insurence-id/{insurenceId}")
	ResponseEntity<Insurence> getById(@PathVariable("insurenceId") int insurenceID){
		Insurence insurences=iInsurenceService.getById(insurenceID);
		return ResponseEntity.ok().body(insurences);
		
	}
}