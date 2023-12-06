<%@page import="java.util.Scanner"%>
<%@page import="com.te.console.dao.ShowDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String name = (String) request.getParameter("username"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
<link rel="stylesheet" href="./fontawesome-free-5.15.4-web/css/all.css">
    
<!-- <link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css"> -->

<style>
    @import url('https://fonts.googleapis.com/css2?family=Irish+Grover&family=Press+Start+2P&family=Titillium+Web:wght@200;300&display=swap');

body{
height: 100%;
width: 100%;
background-image: url("https://eskipaper.com/images/colorful-plain-wallpaper-1.jpg"); 
background-repeat: no-repeat;
background-position: center ;
background-size: cover;
background-position: top;
font-family: 'Irish Grover', cursive;
/* font-family: 'Press Start 2P', cursive;
font-family: 'Titillium Web', sans-serif; */
}

*{
box-sizing: border-box;
}

h1{
color: rgb(0, 0, 0);
text-align: center;
margin-top: 100px;
}



.image{
height: 10vh;
margin-left: 150px;
}

.btn1{
width: 20%;
height: 50px;
font-size: 20px;
outline: none;
border: none;
border-radius: 30px;
color: rgb(10, 9, 9);
cursor: pointer;
display: flex;
margin-top: 20px;
background-color: rgb(15, 206, 181);
margin-top: 20px;
margin-left:550px;
padding-left: 75px;
padding-top: 10px;
opacity: .5;
}
.btn1:hover{
opacity: 1;
}


.btn2{
width: 20%;
height: 50px;
font-size: 20px;
outline: none;
border: none;
border-radius: 30px;
color: rgb(10, 9, 9);
cursor: pointer;
display: flex;
margin-top: 20px;
background-color: rgb(206, 117, 15);
margin-top: 20px;
margin-left:550px;
padding-left: 65px;
padding-top: 10px;
opacity: .5;
}

.btn2:hover{
opacity: 1;
}

.btn3{
width: 20%;
height: 50px;
font-size: 20px;
outline: none;
border: none;
border-radius: 30px;
color: rgb(10, 9, 9);
cursor: pointer;
display: flex;
margin-top: 20px;
background-color: rgb(15, 206, 181);
margin-top: 20px;
margin-left:550px;
padding-left: 60px;
padding-top: 10px;
opacity: .5;
}
.btn3:hover{
opacity: 1;
}

.fas {
padding-top: 7px;
}

</style>

<link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
            <span class="navbar-brand mb-0 h1">
                <img src="https://media-exp1.licdn.com/dms/image/C560BAQG0AWiNk9adfQ/company-logo_200_200/0/1589460948762?e=2159024400&v=beta&t=vt7a20WisKFyDcJqDtuxk0bNEdakHwfKYj3z0pkTnpM" alt="" width="30" height="24">
                Test Yantra</span>
            </div>
        </nav>
      <br> 
	<br>
	<br>
	<br>
	<h1><u>Login Successfull</u></h1>
	<br>
	
	<a href="./display?action=show&name=<%= name %>"><button class="btn1" type="submit" id="b1">Show Details</button></a>
    <br>
	<a href="./display?action=delete&name=<%= name %>"><button class="btn2" type="submit" id="b2">Delete Account</button></a>
    <br>
    <a href="./editDetails.jsp?action=update&name=<%= name %>"><button class="btn3" type="submit" id="b3">Update Account</button></a>
	

    <script src="./jquery.slim.min.js"></script>
<script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script> 
</body>
</html>