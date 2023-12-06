<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

    
    @import url('https://fonts.googleapis.com/css2?family=Irish+Grover&family=Montserrat+Alternates:wght@100&family=Press+Start+2P&family=Titillium+Web:wght@200;300&display=swap');

body{
height: 100%;
width: 100%;
background-image: url("https://eskipaper.com/images/colorful-plain-wallpaper-1.jpg"); 
background-repeat: no-repeat;
background-position: center ;
background-size: cover;
font-family: 'Irish Grover', cursive;

/* font-family: 'Montserrat Alternates', sans-serif;
font-family: 'Press Start 2P', cursive;
font-family: 'Titillium Web', sans-serif; */
} 

*{
box-sizing: border-box;
}

h1{
color: rgb(13, 14, 12);
text-align: center;
}

form{

background-position: center;
background-size: cover;
width: 400px;

margin: auto; 
 margin-top: 40px; 

padding: 10px;
border-radius: 10px;
}

.image{
height: 10vh;
margin-left: 150px;
}

.input-container{
display: flex;
width: 100%;
margin-bottom: 10px;
}

.icon{
color: rgb(14, 13, 13);
margin-top: 5px;
padding: 8px;
min-width: 25px;
text-align: center;
 border-radius: 10px; 
 size: 30px;
}

.input-field{
outline: none;
width: 100%;
color: rgb(8, 8, 8);
background: transparent;
border: none;
border: 2px solid rgb(11, 12, 12);
 border-radius: 10px; 
padding: 10px;
margin-left: 10px;
font-family: Verdana, Geneva, Tahoma, sans-serif;
}

.btn1{
width: 105%;
height: 40px;
background: rgb(4, 243, 211);
outline: none;
border: none;
border-radius: 20px;
color: rgb(15, 15, 15);
cursor: pointer;
opacity: .5;
font-size: 20px;
}
.btn1:hover{
opacity: 1;
}

.btn2{
width: 105%;
height: 40px;
background: rgb(206, 117, 15);
outline: none;
border: none;
border-radius: 20px;
color: rgb(15, 15, 15);
cursor: pointer;
opacity: .5;
font-size: 20px;


}
.btn2:hover{
opacity: 1;
}

.input-field:hover{
border-right: none;
border-left: none;
border-top: none;
} 

.check{
margin-bottom: 20px;
padding-bottom: 10px;
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
              Test Yantra</span>
        </div>
      </nav>
	<form action="./registerprocess" method="post">
        <h1><i class="fas fa-cash-register"></i> &nbsp;<u>Register</u></h1>
		<label>Name:</label>
		<input class="input-field" type="text" name="firstname" id="firstname" required="required"> <br><br>
		
		<label>Username:</label>
		<input class="input-field" type="text" name="username" id="username" required="required"> <br><br>
			
		<label>Password:</label>
		<input class="input-field" type="password" name="pwd" id="pwd" required="required"> <br><br>
		
		<label>Age:</label>
		<input class="input-field" type="number" name="age" id="age" required="required"> <br><br>
		
		<label>Email:</label>
		<input class="input-field" type="email" name="email" id="email" required="required"> <br><br>
		
		<label>Role:</label>
		<input class="input-field" type="text" name="role" id="role" required="required"> <br><br>
		
		<label>Salary:</label>
		<input class="input-field" type="number" name="salary" id="salary" required="required"><br><br>
	
		<input class="btn1" type="submit" value="Submit"> 
		<br>
		<br>
		<input class="btn2" type="reset" value="Cancel">
	
	</form>
    <script src="./jquery.slim.min.js"></script>
<script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script> 
</body>
</html>