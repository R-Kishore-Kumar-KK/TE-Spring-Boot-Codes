<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit the Mail</title>
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
        width: 50%;
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
    margin-left:100px;
    padding-left: 60px;
    padding-top: 0px;
    opacity: .5;
    }
    .btn1:hover{
    opacity: 1;
    }
    
    
    .btn2{
        width: 50%;
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
    margin-left:100px;
    padding-left: 75px;
    padding-top: 0px;
    opacity: .5;
    }
    
    .btn2:hover{
    opacity: 1;
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
.input-field:hover{
    border-right: none;
    border-left: none;
    border-top: none;
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
<form action="./update?change=mail" method="post">
		
		<input hidden="invisible" type="text" name="username" id="username" value="<%=request.getAttribute("uname")%>" required="required"> <br><br>
		
		<label>Email</label>
		<input class="input-field" type="email" name="email" id="email" value="<%=request.getAttribute("email")%>" required="required"> <br><br>
		
		<input class="btn1" type="submit" value="Update"> 
		<input class="btn2" type="reset" value="Reset"> 
</form>
<script src="./jquery.slim.min.js"></script>
       <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script> 
</body>
</html>