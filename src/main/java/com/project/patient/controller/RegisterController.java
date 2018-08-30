package com.project.patient.controller;

import com.project.patient.models.PatientRegistration;
import com.project.patient.service.RegService;
import com.project.patient.validators.RegValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegisterController {
    @Autowired
    RegService regService;


@RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView registrationPage(Model model)
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("register");
        model.addAttribute("patientRegistration",new PatientRegistration());

        return modelAndView;
    }
@RequestMapping(value = "/registerProcess",method = RequestMethod.POST)
    public ModelAndView registerUser(@Validated @ModelAttribute("patientRegistration") PatientRegistration patientRegistration, BindingResult errors)
    {



        ModelAndView modelAndView=new ModelAndView();
        if(errors.hasErrors()){
            System.out.println("errors");
            modelAndView.setViewName("register");
            return modelAndView;
        }
        regService.registerUser(patientRegistration);
        modelAndView.setViewName("home");
        return modelAndView;

    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
    binder.addValidators(new RegValidator());
    }
}
