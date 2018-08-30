package com.project.patient.repositories;

import com.project.patient.database.DatabaseConnection;
import com.project.patient.models.Doctors;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.Map;

@Repository
public class AppointmentRepository {

    public void confirmAppointment(Doctors doctor, String userName) {
        DatabaseConnection databaseConnection=new DatabaseConnection();
        Connection connection=databaseConnection.createConnection();
        databaseConnection.confirmAppointment(connection,doctor,userName);
    }

    public Map viewAppointments(String userName)
    {
        DatabaseConnection databaseConnection=new DatabaseConnection();
        Connection connection=databaseConnection.createConnection();
       Map map= databaseConnection.viewAppointments(connection,userName);
        return map;


    }

    public void deleteAppointment(Doctors doctor, String userName) {

        DatabaseConnection databaseConnection=new DatabaseConnection();
        Connection connection=databaseConnection.createConnection();
        Map map = databaseConnection.viewAppointments(connection, userName);
        databaseConnection.openAppointments(connection, map);
        databaseConnection.deleteAppointment(connection, doctor, userName);

    }
}
