package org.doctoreapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.doctoreapp.model.Doctor;
import org.springframework.jdbc.core.RowMapper;


public class DoctorMapper implements RowMapper<Doctor>{

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor=new Doctor();
		doctor.setDoctorName(rs.getString("doctor_name"));
		doctor.setDoctorId(rs.getInt("doctor_id"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setExperience(rs.getInt("experience"));
		doctor.setFees(rs.getDouble("fees"));
		doctor.setRating(rs.getInt("ratings"));
		return doctor;
	}
	
}
