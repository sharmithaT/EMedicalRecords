package com.project.patient.repositories;

import com.project.patient.database.DatabaseConnection;
import com.project.patient.models.PatientLogin;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.sql.Connection;
import java.util.Map;

@Repository
public class LogRepository {

    public Map loginUser(@ModelAttribute PatientLogin patientLogin)
    {
        DatabaseConnection dbConnection=new DatabaseConnection();

        Connection connection=dbConnection.createConnection();

        Map hashMap=dbConnection.getUser(connection,patientLogin);
        return hashMap;

    }

}
