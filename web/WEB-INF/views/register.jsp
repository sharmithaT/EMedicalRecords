<%--
  Created by IntelliJ IDEA.
  User: sukee
  Date: 8/23/2018
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Register Here</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>


    <style>

        .marginstyle {
            margin: 50px;
        }

        .err{

            color: red;
        }

    </style>

</head>
<body>

<nav class="navbar bg-secondary navbar-dark">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/register">Register</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact us</a>
            </li>
        </ul>
    </div>
</nav>
<br>

<div class="container marginstyle">
    <h2>COMPLETE THE FORM TO REGISTER</h2> <br>
    <form:form action="/registerProcess" method="post" modelAttribute="patientRegistration">
        <div class="form group">
            <label for="First Name">First Name:</label>
            <form:input path="fname" type="text" name="fname" id="First Name" placeholder="First Name"
                        class="form-control" style="width: 50%"/>
            <form:errors path="fname" cssClass="err"/>
        </div>
        <br>
        <div class="form group">
            <label for="Last Name">Last Name:</label>
            <form:input path="lname" type="text" name="lname" id="Last Name" placeholder="Last Name"
                        class="form-control" style="width: 50%"/>
            <form:errors path="lname" cssClass="err"/>
        </div>
        <br>
        <div class="form group">
            <label for="gender">Gender:</label>
            <form:input path="gender" type="text" name="gender" id="gender" placeholder="Gender"
                        class="form-control" style="width: 50%"/>
            <form:errors path="gender" cssClass="err"/>
        </div>
        <br>
        <div class="form group">
            <label for="emailID">E-mail:</label>
            <form:input path="emailID" type="emailID" name="emailID" id="emailID" placeholder="Email"
                        class="form-control" style="width: 50%"/>
            <form:errors path="emailID" cssClass="err"/>
        </div>
        <br>
        <div class="form group">
            <label for="phNumber">Phone Number:</label>
            <input type="text" name="phNumber" id="phNumber" placeholder="XXX)XXX-XXXX"
                   class="form-control"  style="width: 50%">
        </div>
        <br>
        <div class="form group">
            <label for="username">UserName:</label>
            <input type="text" name="username" id="username" placeholder="UserName"
                   class="form-control"  style="width: 50%">
        </div>
        <br>
        <div class="form group">
            <label for="password">Password:</label>
            <input type="password" name="password" id="password" placeholder="Password"
                   class="form-control"  style="width: 50%">
            <br>
        </div>

        <input type="submit" value="Register" class="btn btn-secondary">

    </form:form>
</div>

</body>
</html>
