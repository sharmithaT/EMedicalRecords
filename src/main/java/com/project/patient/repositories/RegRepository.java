package com.project.patient.repositories;

import com.project.patient.database.DatabaseConnection;
import com.project.patient.models.PatientRegistration;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.sql.Connection;

@Repository
public class RegRepository {



    public void registerUser(@ModelAttribute PatientRegistration patientRegistration)
    {
        DatabaseConnection databaseConnection=new DatabaseConnection();

        Connection connection = databaseConnection.createConnection();

        databaseConnection.registerUser(connection, patientRegistration);


    }
}
