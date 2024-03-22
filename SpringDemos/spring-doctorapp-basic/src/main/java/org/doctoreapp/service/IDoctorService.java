package org.doctoreapp.service;

import org.doctoreapp.exception.DoctorNotFoundException;
import org.doctoreapp.exception.IdNotFoundException;
import org.doctoreapp.model.Doctor;

import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);
    Doctor getById(int doctorId) throws IdNotFoundException ;

    List<Doctor> getAll() ;
    List<Doctor> Speciality(String speciality) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndExp(String speciality,int experience) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndLesFees(String speciality,double fees) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndRatings(String speciality,int rating) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndNameContains(String speciality,String doctorName) throws DoctorNotFoundException;


}
