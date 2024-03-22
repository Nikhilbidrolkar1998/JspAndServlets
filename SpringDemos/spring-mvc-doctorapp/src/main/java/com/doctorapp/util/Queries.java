package com.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY="INSERT INTO doctor(doctor_name,speciality,experience,ratings,fees) VALUES(?,?,?,?,?)";
    public static final String UPDATEQUERY="UPDATE DOCTOR SET fees=? where doctor_id=?";
    public static final String DELETEQUERY="DELETE FROM DOCTOR where doctor_id=?";

    public static final String FINDALLQUERY="SELECT * FROM DOCTOR";
    public static final String FINDBYSPECIALITY="SELECT * FROM DOCTOR WHERE speciality=?";
    public static final String FINDBYSPEANDEX="SELECT * FROM DOCTOR WHERE speciality=? AND experience>=?";
    public static final String FINDBYSPEANDRATINGS="SELECT * FROM DOCTOR WHERE speciality=? AND rating>=?";
    public static final String FINDBYSPEANDFEES="SELECT * FROM DOCTOR WHERE speciality=? AND fees<=?";
    public static final String FINDBYSPEANDNAME="SELECT * FROM DOCTOR WHERE speciality=? AND doctor_name like ?";
    public static final String FINDBYID="SELECT * FROM DOCTOR WHERE doctor_id=?";
}
