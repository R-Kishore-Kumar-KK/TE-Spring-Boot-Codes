<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Details</title>
<style type="text/css">
body{
  background-image: url("https://eskipaper.com/images/colorful-plain-wallpaper-1.jpg");
}

table {
  margin:auto;
  margin-top: 100px;
}

td{
	color: black;
	
}


 h1{
    color: rgb(13, 14, 12);
    text-align: center;
    padding-top: 100px;
}
 
.btn1{
width: 25%;
height: 40px;
background: rgb(4, 243, 211);
outline: none;
border: none;
border-radius: 20px;
color: rgb(15, 15, 15);
cursor: pointer;
opacity: .5;
font-size: 20px;
margin-left: 500px;
}
.btn1:hover{
opacity: 1;
}

</style>
<link rel="stylesheet" href="./fontawesome-free-5.15.4-web/css/all.css">
<link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
</head>
<body>
	<nav class="navbar navbar-light bg-transparent">
        <div class="container-fluid">
          <span class="navbar-brand mb-0 h1">
            <img src="https://media-exp1.licdn.com/dms/image/C560BAQG0AWiNk9adfQ/company-logo_200_200/0/1589460948762?e=2159024400&v=beta&t=vt7a20WisKFyDcJqDtuxk0bNEdakHwfKYj3z0pkTnpM" alt="" width="30" height="24">
             <a class="navbar-brand" href="./front" >Test Yantra</a></span>
        </div>
      </nav>
      <h1><u>Employee Details</u></h1>
	<table >
		<tr>
			<th>Name:</th>
            <td>&emsp;<b><%= request.getAttribute("name") %></b></td>
        </tr>
        <tr>
			<th>UserName:</th>
            <td>&emsp;<b><%= request.getAttribute("uname") %></b></td>
        </tr>  
        <tr> 
			<th>Password:</th>
            <td>&emsp;<b><%= request.getAttribute("pass") %></b></td>
        </tr> 
        <tr>
			<th>Age:</th>
            <td>&emsp;<b><%= request.getAttribute("age") %></b></td>
        </tr>   
        <tr> 
			<th>Email:</th>
            <td>&emsp;<b><%= request.getAttribute("email") %></b></td>
        </tr>
        <tr>
			<th>Role:</th>
            <td>&emsp;<b><%= request.getAttribute("role") %></b></td>
        </tr>
        <tr>
			<th>Salary:</th>
            <td>&emsp;<b><%= request.getAttribute("salary") %></b></td>
		</tr>
    
	</table>
  <br>
  <br>
 
	<script src="./jquery.slim.min.js"></script>
<script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script> 
</body>
</html>