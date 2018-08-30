<%--
  Created by IntelliJ IDEA.
  User: sukee
  Date: 8/23/2018
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>HomePage</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  </head>
  <body>
  <nav class="navbar navbar-expand-sm bg-secondary navbar-dark">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/register">Register</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contact Us</a>
      </li>
    </ul>
  </nav>


  <div class="container">
    <h2>Login</h2>

    <form action="/validateLogin" method="post">
      <div class="form-group">
        <label for="usr">Name:</label>
        <input type="text" class="form-control" id="usr" name="username">
      </div>
      <div class="form-group">
        <label for="pwd">Password:</label>
        <input type="password" class="form-control" id="pwd" name="password">
      </div>
      <button type="submit" class="btn btn-secondary">Submit</button>

      <!--<a class="nav-link" href="/register">Register</a>-->

    </form>
    <p>Not a member? <a href="/register">Register Here</a>.</p>

  </div>
  </body>
</html>
