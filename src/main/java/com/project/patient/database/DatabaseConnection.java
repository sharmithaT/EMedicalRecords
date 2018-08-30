package com.project.patient.database;

import com.project.patient.models.Doctors;
import com.project.patient.models.PatientLogin;
import com.project.patient.models.PatientRegistration;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DatabaseConnection {

    String firstname,lastname,gender,phnumber;
    String userName,password,email;
    String docName, specialization, day, time;

    public Connection createConnection()
    {
        Connection conn=null;

        try {
            Class.forName("org.postgresql.Driver");
             conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "sukeerthi");


        }catch (ClassNotFoundException e)

        {
            e.printStackTrace();
        }catch (SQLException se)
        {
            se.printStackTrace();
        }

        return conn;

    }
    public void registerUser(Connection connection, PatientRegistration patientRegistration)
    {
        try {
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT into patientregister (firstname, lastname, gender, emailid, phonenum, username, password) values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1,patientRegistration.getFname());
            preparedStatement.setString(2,patientRegistration.getLname());
            preparedStatement.setString(3,patientRegistration.getGender());
            preparedStatement.setString(4,patientRegistration.getEmailID());
            preparedStatement.setString(5,patientRegistration.getPhNumber());
            preparedStatement.setString(6,patientRegistration.getUsername());
            preparedStatement.setString(7,patientRegistration.getPassword());
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public Map getUser(Connection connection,PatientLogin patientLogin) {

        try {

            PreparedStatement preparedStatement = connection.prepareStatement("select username,password from patientregister where username=(?)");
            preparedStatement.setString(1, patientLogin.getUsername());
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                userName = resultSet.getString("userName");
                password = resultSet.getString("password");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("inside getvalue");
        }

        Map hashMap = new HashMap();
        hashMap.put("userName", userName);
        hashMap.put("password", password);

        return hashMap;
    }

    public void confirmAppointment(Connection connection, Doctors doctor, String userName) {

        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT into appointmentsdata(username, docname, specialization, day, time) values (?,?,?,?,?)");
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, doctor.getDocName());
            preparedStatement.setString(3, doctor.getSpecialization());
            preparedStatement.setString(4, doctor.getDay());
            preparedStatement.setString(5, doctor.getTime());

            preparedStatement.execute();

            PreparedStatement preparedStatement1 = connection
                    .prepareStatement("DELETE FROM doctorsdata where docname = (?)");
            preparedStatement1.setString(1, doctor.getDocName());

            preparedStatement1.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public Map viewAppointments(Connection connection, String userName1) {
        try {

            PreparedStatement preparedStatement = connection
                    .prepareStatement("select * FROM appointmentsdata where username = (?)");
            preparedStatement.setString(1, userName1);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                userName = resultSet.getString("userName");
                docName = resultSet.getString("docName");
                specialization = resultSet.getString("specialization");
                day = resultSet.getString("day");
                time = resultSet.getString("time");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        Map map = new HashMap();
        map.put("userName", userName);
        map.put("docName", docName);
        map.put("specialization", specialization);
        map.put("day", day);
        map.put("time", time);

        return map;

    }
    public void openAppointments(Connection connection, Map map) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into doctorsdata(docname, specialization, day, time) values (?,?,?,?)");
            preparedStatement.setString(1, (String)map.get("docName"));
            preparedStatement.setString(2, (String)map.get("specialization"));
            preparedStatement.setString(3, (String)map.get("day"));
            preparedStatement.setString(4, (String)map.get("time"));

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAppointment(Connection connection, Doctors doctor, String userName) {

        try {


            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM appointmentsdata where username = (?)");

            preparedStatement.setString(1, userName);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
