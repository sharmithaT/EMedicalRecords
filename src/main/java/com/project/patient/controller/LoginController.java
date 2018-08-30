package com.project.patient.controller;

import com.project.patient.models.PatientLogin;
import com.project.patient.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    LogService logService;

    @RequestMapping(value = "/login")
    public ModelAndView welcomePage()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
    public Object loginUser(@ModelAttribute("patientLogin") PatientLogin patientLogin)
    {
        Map hashMap=logService.loginUser(patientLogin);
        return logService.validateLogin(patientLogin,hashMap);

    }




}
