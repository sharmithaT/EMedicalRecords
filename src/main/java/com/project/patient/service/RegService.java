package com.project.patient.service;

import com.project.patient.models.PatientRegistration;
import com.project.patient.repositories.RegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class RegService {
    @Autowired
    RegRepository regRepository;

    public void registerUser(@ModelAttribute PatientRegistration patientRegistration)
    {
        regRepository.registerUser(patientRegistration);

    }
}
