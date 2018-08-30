package com.project.patient.repositories;

import com.project.patient.database.DatabaseConnection;
import com.project.patient.models.Doctors;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class DoctorRepository {

    public void getDoctorsList(Doctors doctor) {

        DatabaseConnection databaseConnection=new DatabaseConnection();
        Connection connection=databaseConnection.createConnection();
    }
}
