<!DOCTYPE html>
<html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="./fontawesome-free-5.15.4-web/css/all.css">
    <style>
        body {
            height: 100%;
            width: 100%;
            background-image: url("");
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;
            background-position: top;
            font-family: cursive;
        }

        /* .d-flex {
            margin-left: 1000px;
        } */

        .container {
            width: 100%;
            height: 70vh;
            position: relative;
            padding-left: 8%;
            padding-right: 8%;
            box-shadow: border-box;
        }

        .content {
            max-width: 500px;
            margin-top: 100px;
        }

        .content h2 {
            
            font-size: 30px;
            text-shadow: 0 0 10px rgb(12, 12, 12), 0 0 40px rgb(12, 12, 12), 0 0 100px rgb(12, 12, 12);
        }

        .content button {
            width: 160px;
            padding: 10px 0;
            border: none;
            outline: none;
            color: white;
            font-size: 16px;
            font-weight: 300;
            background: rgb(12, 12, 12);
            cursor: pointer;
            
        }

        .content button:hover {
            box-shadow: 0 0 10px rgb(12, 12, 12), 0 0 40px rgb(12, 12, 12), 0 0 100px rgb(12, 12, 12);
        }
       
        .car-image {
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
        #about{
            margin-left: 1024px;
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
          <a class="navbar-brand" href="#"><i class="fas fa-car"></i>&nbsp;Cars</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="./login"><i class="fas fa-user-cog"></i>&nbsp;Admin</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" id="about" href="#">About Us&nbsp;<i class="far fa-address-card"></i></a>
              </li>
              
            </ul>
            
          </div>
        </div>
      </nav>

    <div class="container">

        <div class="content">
            <h2><i class="fas fa-truck-monster"></i>&nbsp;Wheels Like Never Before!!!</h2>
            <br>
            <br>
           <h4>"We wander for Distraction but we travel for fulfilment"</h4>
            <a href="./register"><button class="btn1" type="submit" id="b1">Explore</button></a>

        </div>

        <img src="./audi_PNG1737.png" class="car-image">

    </div>


    <script src="./jquery.slim.min.js"></script>
    <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</body>

</html>
