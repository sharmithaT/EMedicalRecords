package com.project.patient.service;

import com.project.patient.models.PatientLogin;
import com.project.patient.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Service
public class LogService {
    @Autowired
    LogRepository logRepository;

    public Map loginUser(@ModelAttribute PatientLogin patientLogin)
    {
        Map hashmap=logRepository.loginUser(patientLogin);
        return hashmap;
    }





    public ModelAndView validateLogin(PatientLogin patientLogin, Map hashMap) {
        ModelAndView modelAndView = new ModelAndView();

        if (patientLogin.getPassword().equals(hashMap.get("password"))) {
            modelAndView.setViewName("welcome");
            modelAndView.addObject("login",patientLogin);


        }else {
            modelAndView.setViewName("index");
            modelAndView.addObject("error", "Invalid Username or Password");
        }

        return modelAndView;

    }
}
