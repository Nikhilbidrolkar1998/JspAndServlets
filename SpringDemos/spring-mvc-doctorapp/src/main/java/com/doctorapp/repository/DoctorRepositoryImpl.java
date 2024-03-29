package com.doctorapp.repository;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	
    public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
    public void addDoctor(Doctor doctor) {
		Object[] doctorArr= {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getFees(),doctor.getRating(),doctor.getExperience()};
		jdbcTemplate.update(Queries.INSERTQUERY,doctorArr);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
    	jdbcTemplate.update(Queries.UPDATEQUERY,fees,doctorId);
    }

    @Override
    public void deleteDoctor(int doctorId) {
    	jdbcTemplate.update(Queries.DELETEQUERY,doctorId);
    }

    @Override
    public Doctor findById(int doctorId) {
    	Doctor doctor=jdbcTemplate.queryForObject(Queries.FINDBYID,new DoctorMapper(),doctorId);
		return doctor;
    }

    @Override
    public List<Doctor> findAll() {
    	org.springframework.jdbc.core.RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.FINDALLQUERY, mapper);
		return doctors;
    }

    @Override
    public List<Doctor> Speciality(String speciality)  {
    	org.springframework.jdbc.core.RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.FINDBYSPECIALITY, mapper,speciality);
		return doctors;

    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
    	List<Doctor> doctors=jdbcTemplate.query(Queries.FINDBYSPEANDEX, new DoctorMapper(),speciality,experience);
		return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndLesFees(String speciality, double fees) {
    	List<Doctor> doctors=jdbcTemplate.query(Queries.FINDBYSPEANDFEES, new DoctorMapper(),fees);
		return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int rating) {
    	List<Doctor> doctors=jdbcTemplate.query(Queries.FINDBYSPEANDRATINGS, new DoctorMapper(),rating);
		return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
    	List<Doctor> doctors=jdbcTemplate.query(Queries.FINDBYSPEANDNAME, new DoctorMapper(),doctorName);
		return doctors;
    }
}
