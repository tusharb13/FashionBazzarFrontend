<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Fashion Site</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="./resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="./resources/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="./resources/themes/css/bootstrappage.css" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="./resources/themes/css/flexslider.css" rel="stylesheet"/>
		<link href="./resources/themes/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="./resources/themes/js/jquery-1.7.2.min.js"></script>
		<script src="./resources/bootstrap/js/bootstrap.min.js"></script>				
		<script src="./resources/themes/js/superfish.js"></script>	
		<script src="./resources/themes/js/jquery.scrolltotop.js"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>
    <body>		
		<div id="top-bar" class="container">
			<div class="row">
				<div class="span4">
					<form method="POST" class="search_form">
						<input type="text" class="input-block-level search-query" Placeholder="eg. T-shirt">
					</form>
				</div>
				<div class="span8">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="#">My Account</a></li>
							<li><a href="#">Your Cart</a></li>
							<li><a href="#">Checkout</a></li>					
							<li><a href="#">Login</a></li>		
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="wrapper" class="container">
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<a href="index.html" class="logo pull-left"><img src="./resources/themes/images/logo.png" class="site_logo" alt=""></a>
					<nav id="menu" class="pull-right">
						<ul>
							<li><a href="#">Woman</a>					
								<ul>
									<li><a href="#">Western Wear</a></li>									
									<li><a href="#">Indian Wear</a></li>
									<li><a href="#">Shoes</a></li>									
								</ul>
							</li>															
							<li><a href="#">Man</a></li>			
							<li><a href="#">Sport</a>
								<ul>									
									<li><a href="#">Gifts and Tech</a></li>
									<li><a href="./products.html">Ties and Hats</a></li>
									<li><a href="./products.html">Cold Weather</a></li>
								</ul>
							</li>							
							<li><a href="./products.html">Hangbag</a></li>
							<li><a href="./products.html">Best Seller</a></li>
							<li><a href="./products.html">Top Seller</a></li>
						</ul>
					</nav>
				</div>
			</section>
			<section  class="homepage-slider" id="home-slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<img src="./resources/themes/images/carousel/banner-1.jpg" alt="" />
						</li>
						<li>
							<img src="./resources/themes/images/carousel/banner-2.jpg" alt="" />
							<div class="intro">
								<h1>Mid season sale is on bitches</h1>
								<p><span>Up to 50% Off</span></p>
								<p><span>On selected items online and in stores</span></p>
							</div>
						</li>
					</ul>
				</div>			
			</section>
			<section class="header_text">
				This is a fashion site. 
				<br/>Don't miss to use our cheap and best clothes.
			</section>
			<section class="main-content">
				<div class="row">
					<div class="span12">													
						<div class="row">
							<div class="span12">
								<h4 class="title">
									<span class="pull-left"><span class="text"><span class="line">Featured <strong>Products</strong></span></span></span>
									<!-- <span class="pull-right">
										<a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
									</span> -->
								</h4>
								<div id="myCarousel" class="myCarousel carousel slide">
									<div class="carousel-inner">
										<div class="active item">
											<ul class="thumbnails">												
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="#"><img src="./resources/themes/images/ladies/1.jpg" alt="" /></a></p>
														<a href="#" class="title">Ut wisi enim ad</a><br/>
														<a href="#" class="category">Commodo consequat</a>
														<p class="price">$17.25</p>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="#"><img src="./resources/themes/images/ladies/2.jpg" alt="" /></a></p>
														<a href="#" class="title">Quis nostrud exerci tation</a><br/>
														<a href="#" class="category">Quis nostrud</a>
														<p class="price">$32.50</p>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<p><a href="#"><img src="./resources/themes/images/ladies/3.jpg" alt="" /></a></p>
														<a href="#" class="title">Know exactly turned</a><br/>
														<a href="#" class="category">Quis nostrud</a>
														<p class="price">$14.20</p>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<p><a href="#"><img src="./resources/themes/images/ladies/4.jpg" alt="" /></a></p>
														<a href="#" class="title">You think fast</a><br/>
														<a href="#" class="category">World once</a>
														<p class="price">$31.45</p>
													</div>
												</li>
											</ul>
										</div>
										
									</div>							
								</div>
							</div>						
						</div>
						<br/>
						
					</div>				
				</div>
			</section>
			<section class="our_client">
				<h4 class="title"><span class="text">Manufactures</span></h4>
				<div class="row">					
					<div class="span2">
						<img alt="" src="./resources/themes/images/clients/14.png">
					</div>
					<div class="span2">
						<img alt="" src="./resources/themes/images/clients/35.png">
					</div>
					<div class="span2">
						<img alt="" src="./resources/themes/images/clients/1.png">
					</div>
					<div class="span2">
						<img alt="" src="./resources/themes/images/clients/2.png">
					</div>
					<div class="span2">
						<img alt="" src="./resources/themes/images/clients/3.png">
					</div>
					<div class="span2">
						<img alt="" src="./resources/themes/images/clients/4.png">
					</div>
				</div>
			</section>
			<section id="footer-bar">
				<div class="row">
					<div class="span3">
						<h4>Navigation</h4>
						<ul class="nav">
							<li><a href="#">Homepage</a></li>
							<li><a href="register">Register</a></li>  
							<li><a href="category">Enter Categories</a></li>
							<li><a href="supplier">Enter Suppliers</a></li>
							<li><a href="product">Enter Products</a></li> 
							<li><a href="productdisplay">Product Display</a></li>    
							<li><a href="aboutus">About Us</a></li>
							<li><a href="contactus">Contact Us</a></li>
							<li><a href="#">Your Cart</a></li>
							<li><a href="login">Login</a></li>							
						</ul>					
					</div>
					<div class="span4">
						<h4>My Account</h4>
						<ul class="nav">
							<li><a href="#">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="#">Wish List</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
					</div>
					<div class="span5">
						<p class="logo"><img src="./resources/themes/images/logo.png" class="site_logo" alt=""></p>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>
						<br/>
						
					</div>					
				</div>	
			</section>
			<section id="copyright">
				<span>Copyright 2018. All right reserved.</span>
			</section> 
		</div>
		<script src="./resources/themes/js/common.js"></script>
		<script src="./resources/themes/js/jquery.flexslider-min.js"></script>
		<script type="text/javascript">
			$(function() {
				$(document).ready(function() {
					$('.flexslider').flexslider({
						animation: "fade",
						slideshowSpeed: 4000,
						animationSpeed: 600,
						controlNav: false,
						directionNav: true,
						controlsContainer: ".flex-container" // the container that holds the flexslider
					});
				});
			});
		</script>
    </body>
</html>