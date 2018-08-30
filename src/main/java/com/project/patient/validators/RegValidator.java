package com.project.patient.validators;

import com.project.patient.models.PatientRegistration;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return PatientRegistration.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {

        PatientRegistration patientRegistration=(PatientRegistration)o;

        if(patientRegistration.getFname()==null||patientRegistration.getFname().equals("")){
            errors.rejectValue("fname","patientRegistration.fname","First Name cannot be empty");
        } else if(patientRegistration.getFname().length()<3){
            errors.rejectValue("fname","patientRegistration.fname","Firstname cannot be less than 3 letters");
        }

        if(patientRegistration.getLname()==null||patientRegistration.getLname().equals("")){
            errors.rejectValue("lname","patientRegistration.lname","Last name cannot be empty");
        }

        if(patientRegistration.getGender()==null||patientRegistration.getGender().equals("")){
            errors.rejectValue("gender","patientRegistration.gender","Gender cannot be empty");

        }
        if(patientRegistration.getEmailID()==null||patientRegistration.getGender().equals("")){
            errors.rejectValue("emailID","patientRegistration.emailID","Email ID cannot be empty");
        }



    }
}
