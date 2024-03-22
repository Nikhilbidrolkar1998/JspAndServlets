package com.doctorapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;




@Controller
public class DoctorController {
	@Autowired
	private IDoctorService doctorService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Doctor> doctors=doctorService.getAll();
		model.addAttribute("doctors", doctors);
		return "home";
	}
	
	@RequestMapping("/addDoctor")
	public String addDoctor(Doctor doctor) {
		doctorService.addDoctor(doctor);
		System.out.println(doctor);
		return "admindash";
	}
	
	@RequestMapping("/editDoctor")
	public String editDoctor(@RequestParam("doctorId") int doctorId, Model model) {
		Doctor doctor=doctorService.getById(doctorId);
		model.addAttribute("doctor",doctor);
		return "updatedoctor";
	}
	
	@RequestMapping("/updateDoctor")
	public String updateDoctor(Doctor doctor, Model model) {
		int doctorId=doctor.getDoctorId();
		double fees=doctor.getFees();
		doctorService.updateDoctor(doctorId,fees);
		return "admindash";
	}
	
	@RequestMapping("/deleteDoctor")
	public String deleteDoctor(@RequestParam("doctorId") int doctorId, Model model) {
		doctorService.deleteDoctor(doctorId);
		model.addAttribute("message","Doctor is deleted successfully");
		return "admindash";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("choice") String choice,Model model) {
		List<Doctor> doctors=doctorService.speciality(choice);
		model.addAttribute("doctors", doctors);
		return "success";
	}
}
