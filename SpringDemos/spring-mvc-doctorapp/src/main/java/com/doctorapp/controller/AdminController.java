package com.doctorapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctorapp.service.IDoctorService;

@Controller
public class AdminController {
	
	@RequestMapping("admin")
	public String admin(Model model) {
		return "login";
	}
	
	@RequestMapping("login")
	public String login(@RequestParam("adminname") String adminname,@RequestParam("password") String password) {
		if(adminname.equals("admin") && password.equals("123")) {
			return "admindash";
		}
		return "login";
	}
	
	@RequestMapping("add-doctor-form")
	public String addDoctor(Model model) {
		return "adddoctor";
	}
	
	@RequestMapping("update-doctor-form")
	public String updateDoctor(Model model) {
		return "editDoctor";
	}
	
	@RequestMapping("delete-doctor-form")
	public String deleteDoctor(Model model) {
		return "deletedoctor";
	}
}
