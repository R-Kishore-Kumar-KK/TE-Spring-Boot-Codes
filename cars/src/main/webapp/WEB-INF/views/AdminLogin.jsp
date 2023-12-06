<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="./fontawesome-free-5.15.4-web/css/all.css">
    <style>
        body {
            height: 100%;
            width: 100%;
            /* background: yellow; */
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;
            background-position: top;
            font-family: cursive;
        }

        .container {
            width: 100%;
            height: 70vh;
            position: relative;
            padding-left: 8%;
            padding-right: 8%;
            box-shadow: border-box;
        }

        .content {
            max-width: 600px;
            margin-top: 100px;
        }

        .content h1 {
            font-size: 60px;
            text-shadow: 10px 10px 10px rgb(12, 12, 12), 0 0 40px rgb(12, 12, 12), 0 0 100px rgb(12, 12, 12);
        }

        .content button {
            width: 245px;
            padding: 10px 0;
            border: none;
            outline: none;
            color: white;
            font-size: 16px;
            font-weight: 300;
            background: rgb(12, 12, 12);

            cursor: pointer;
            margin-left: 115px;
            transition: 0.2s;
        }

        .content button:hover {
            
            box-shadow: 0 0 10px rgb(12, 12, 12), 0 0 40px rgb(12, 12, 12), 0 0 100px rgb(12, 12, 12);
        }

        .car-image {
            margin-left: 10px;
            width: 50%;
            position: absolute;
            top: 70px;
            right: 50px;
            bottom: 60px;
            animation: run 2s linear 1;
        }
        .car-image:hover {
            -webkit-transform: scaleX(-1);
            transform: scaleX(-1);  
        }
        @keyframes run {
            0% {
                transform: translate(-100px, -100px);
            }

            100% {
                transform: translate(0px, 0px);
            }
        }

        .input-field1 {
            outline: none;
            width: 54.5%;
            color: rgb(8, 8, 8);
            background: transparent;
            border: none;
            border: 2px solid rgb(11, 12, 12);
            /* border-radius: 10px; */
            padding: 10px;
            margin-left: 10px;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
            
        }

        .input-field1:hover {
            border-right: none;
            border-left: none;
            border-top: none;
            
        }

        .input-field {
            outline: none;
            width: 46%;
            color: rgb(8, 8, 8);
            background: transparent;
            border: none;
            border: 2px solid rgb(11, 12, 12);
            /* border-radius: 10px; */
            padding: 10px;
            margin-left: 10px;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
        }

        .input-field:hover {
            border-right: none;
            border-left: none;
            border-top: none;
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Cars</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

        </div>
    </nav>
    <form action="">
        <div class="container">

            <div class="content">
                <h1>Admin Login</h1>
                <br>
                Id:<input class="input-field1" type="text" name="admin" id="admin">
                <br>
                <br>
                Password:<input class="input-field" type="password" name="password" id="password">
                <br>
                <br>
                <button class="btn1  " type="submit">Login</button>
            </div>

            <img src="./audi_PNG1737.png" class="car-image">

        </div>
    </form>
    <script src="./jquery.slim.min.js"></script>
    <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</body>

</html>