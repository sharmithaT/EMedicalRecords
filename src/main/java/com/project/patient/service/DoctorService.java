package com.project.patient.service;

import com.project.patient.models.Doctors;
import com.project.patient.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public void doctorService(Doctors doctor) {

        doctorRepository.getDoctorsList(doctor);

    }
}
