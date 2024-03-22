package org.doctoreapp.client;

import org.doctoreapp.exception.DoctorNotFoundException;
import org.doctoreapp.model.Doctor;
import org.doctoreapp.model.Specialization;
import org.doctoreapp.service.DoctorServiceImpl;
import org.doctoreapp.service.IDoctorService;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService=new DoctorServiceImpl();
        Specialization specialization=Specialization.GYNAEC;
        String speciality=specialization.getSpeciality();
//        Doctor doctor=new Doctor("Sandhya",speciality,500,5,1);
//        doctorService.addDoctor(doctor);

//        doctorService.updateDoctor(1,5000);

        List<Doctor> doctors=doctorService.getAll();
        for(Doctor doctor:doctors){
            System.out.println(doctor);
        }

        System.out.println("----------------");

        try {
            List<Doctor> doctorList1=doctorService.getBySpecialityAndLesFees("GYNAECOLOGIST",3000.0);
            for(Doctor doctor:doctorList1){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
