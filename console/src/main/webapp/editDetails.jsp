<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String name = request.getParameter("name"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit The Details</title>
<style>
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

}

form{

background-position: center;
background-size: cover;
width: 400px;
margin: auto; 
margin-top: 180px; 

border-radius: 10px;
padding: 10px;
/* border-radius: 10px; */
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
transition: 0.2s;
text-decoration: none;
}
.btn1:hover{
opacity: 1;
box-shadow: 0 0 10px rgb(15, 206, 181), 0 0 40px rgb(23, 136, 121), 0 0 100px rgb(16, 61, 55);
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
padding-left: 75px;
padding-top: 10px;
opacity: .5;
transition: 0.2s;

}

.btn2:hover{
opacity: 1;
box-shadow: 0 0 10px rgb(206, 117, 15), 0 0 40px rgb(141, 90, 32), 0 0 100px rgb(78, 55, 28);
text-decoration: none;
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
padding-left: 75px;
padding-top: 10px;
opacity: .5;
transition: 0.2s;
}
.btn3:hover{
opacity: 1;
box-shadow: 0 0 10px rgb(15, 206, 181), 0 0 40px rgb(23, 136, 121), 0 0 100px rgb(16, 61, 55);
}


</style>
<link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
</head>
<body>
	<nav class="navbar navbar-light bg-transparent">
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
        <br>
		<h1><u>Edit the Details</u></h1>
		<a href="./display?action=email&name=<%= name %>"><button class="btn1" type="submit">Edit the Email</button></a>
	   <a href="./display?action=nam&name=<%= name %>"><button class="btn2" type="submit">Edit the Name</button></a>
	   <a href="./display?action=salary&name=<%= name %>"><button class="btn3" type="submit">Edit the Salary</button></a>
		
       <script src="./jquery.slim.min.js"></script>
       <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script> 
</body>
</html>