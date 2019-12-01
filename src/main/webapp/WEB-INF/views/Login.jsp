<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Login</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css">
		<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700%7CRoboto%7CJosefin+Sans:100,300,400,500" rel="stylesheet" type="text/css">
		<script src="https://unpkg.com/scrollreveal/dist/scrollreveal.min.js"></script>
	</head>
	
	<body>
		
		<form id="Log" action="perform_login" method="post">
			<div class="container">
				<div class="row">
					<div class="col-sm-4 col-sm-offset-4 col-lg-4 col-lg-offset-4">
						<div class="box">
							<!-- <div class="center-block"> -->
								<h2>Login</h2>
									<div class="input-group">
								      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
								      <input id="Username" type="text" class="form-control" name="username" placeholder="Username" required/>
								    </div>
								    <br>
								    <div class="input-group">
								      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
								      <input id="Password" type="password" class="form-control" name="password" placeholder="Password" required/>
								    </div>
								<button type="submit" class="btn btn-success">Submit</button>
								<br>
								<br>
								<p>Not a member? <a href="Register.html">Sign Up</a></p>
							<a1>Forgot Password</a1>
							<!-- </div> -->
						</div>
					</div>
				</div>
			</div>
		</form>
		
		
		<script
			src="https://code.jquery.com/jquery-3.2.1.js"
			integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
			crossorigin="anonymous">
		</script>
		
		<!-- <script>
		sr.reveal('.box', {
	          duration: 2000,
	          origin: 'bottom',
	          distance: '300px',
	        });
		</script>
		
		<script>
		    $(function () {
		      // Smooth Scrolling
		      $('a[href*="#"]:not([href="#"])').click(function () {
		        if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname)
		        {
		          var $target = $(this.hash);
		          target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
		          if (target.length) {
		            $('html, body').animate({
		              scrollTop: target.offset().top,
		            }, 1000);
		            return false;
		          }
		        }
		      });
		    });
    	</script> -->
	</body>
</html>