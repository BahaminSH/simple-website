<%--
  Created by IntelliJ IDEA.
  User: Bahamin
  Date: 11/02/2022
  Time: 11:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="/css/welcome.css">
    <script src = "/js/welcome.js"></script>
</head>
<body>

<nav id="topNav" class="nav navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" style="color: red" href="#">UBlog</a>
        </div>
        <ul class="nav navbar-nav">
            <li id="t1" class="active"><a href="#">Home</a></li>
            <li id="t2"><a href="#">About</a></li>
            <li id="t3"><a href="#">Contacts</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Login</a></li>
        </ul>
    </div>
</nav>

<div class="container-fluid">
    <div class="row content">
        <div id="leftNav" class="col-sm-2 sidenav text-left">
            <h3>Contents:</h3>
            <ul class="nav nav-pills nav-stacked">
                <li id="l1" class="active"><a href="">Friend's Stuff</a></li>
                <li id="l2"><a href="">Family's Stuff</a></li>
                <li id="l3"><a href="">Work's Stuff</a></li>
            </ul><br>
        </div>
        <div class="col-sm-8 text-left">
            <h1 id="Header1"></h1>
            <p id="Paragraph1"></p>
        </div>
        <div class="col-sm-2 sidenav text-center">
            <div class="well">Ad1</div>
            <div class="well">Ad2</div>
        </div>
    </div>
</div>

</body>
</html>
