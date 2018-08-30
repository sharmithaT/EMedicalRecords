package com.project.patient.service;

import com.project.patient.models.Doctors;
import com.project.patient.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    public void confirmAppointment(Doctors doctor, String userName) {

        appointmentRepository.confirmAppointment(doctor, userName);

    }

    public Map viewAppointments(String userName) {
        Map map = appointmentRepository.viewAppointments(userName);

        return map;
    }

    public void deleteAppointments(Doctors doctor, String userName) {
        appointmentRepository.deleteAppointment(doctor, userName);
    }
}
