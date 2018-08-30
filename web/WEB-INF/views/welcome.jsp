<%--
  Created by IntelliJ IDEA.
  User: sukee
  Date: 8/27/2018
  Time: 6:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
Welcome ${patientLogin.username}
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
           <%-- <a class="navbar-brand" href="/">Hospital</a>--%>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>

            <li><a href="/doctors">Doctors</a></li>
            <li><a href="/myAppointments">My Appointments</a></li>
            <li><a href="/myAppointments">Delete Appointments</a> </li>

        </ul>


        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> ${patientLogin.username} </li>
        </ul>
    </div>
</nav>




</body>
</html>
