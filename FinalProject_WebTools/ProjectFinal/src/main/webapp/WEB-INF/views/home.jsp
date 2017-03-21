<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE HTML>
<html>
<head>
<title>MyBlackboard</title>
<link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Asap:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Karla:400,400italic,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="resources/css/flexslider.css" type="text/css" media="screen" />
<link href="resources/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/my.js"></script>
<script type="text/javascript">
			<!-- script-for-portfolio -->
						jQuery(document).ready(function($) {
							$(".scroll").click(function(event){		
								event.preventDefault();
								$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
							});
						});
					</script>					
				<script type="text/javascript" src="resources/js/jquery.mixitup.min.js"></script>
				<script type="text/javascript">
						$(function () {
			
							var filterList = {
			
								init: function () {
				
					// MixItUp plugin
					// http://mixitup.io
					$('#portfoliolist').mixitup({
						targetSelector: '.portfolio',
						filterSelector: '.filter',
						effects: ['fade'],
						easing: 'snap',
						// call the hover effect
						onMixEnd: filterList.hoverEffect()
					});				
				
				},
				
				hoverEffect: function () {
				
					// Simple parallax effect
					$('#portfoliolist .portfolio').hover(
						function () {
							$(this).find('.label').stop().animate({bottom: 0}, 200, 'easeOutQuad');
							$(this).find('img').stop().animate({top: -30}, 500, 'easeOutQuad');				
						},
						function () {
							$(this).find('.label').stop().animate({bottom: -40}, 200, 'easeInQuad');
							$(this).find('img').stop().animate({top: 0}, 300, 'easeOutQuad');								
							}		
						);				
				
					}

				};
			
				// Run the show!
				filterList.init();
			});	
			</script>
			<!-- script-for-portfolio -->
			<!-- pop-up-box -->
			<script type="text/javascript" src="resources/js/modernizr.custom.min.js"></script>
				<script src="resources/js/jquery.magnific-popup.js" type="text/javascript"></script> 
			<script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>
				<!-- pop-up-box -->
				<script type="text/javascript" src="resources/js/move-top.js"></script>
       <script type="text/javascript" src="resources/js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
		</script>
		<script type="text/javascript">
		$(document).ready(function() {
				/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
				*/
		$().UItoTop({ easingType: 'easeOutQuart' });
});
		</script>
		

</head>
<body>
<!-- header -->
	<div class="banner">
		<div class="header" >
			<div class="container">
				<div class="logo">
					<a href=""><img src="resources/images/images-6.jpeg" alt="" /></a>
				</div>
				<div class="menu">												
					<a href="#" class="right_bt" id="activator"><img src="resources/images/menu.png" alt=""/></a>
						<div class="box" id="box">
							<div class="box_content">
							   <div class="menu_box_list">
								   <ul>
									   <li class="active"><a href="#home" class="scroll">Home</a></li>
										<li><a href="#about" class="scroll">Enroll</a></li>
										<li><a href="#contact-us" class="scroll">Login </a></li>
										<!-- <li><a href="#" class="scroll">Logout </a></li> -->
										
									</ul>
								</div>
								<a class="boxclose" id="boxclose"><img src="resources/images/close.png" alt=""/></a>
							</div>                
						</div>
						<script type="text/javascript" src="resources/js/easing.js"></script>
							 <script type="text/javascript">
									var $ = jQuery.noConflict();
										$(function() {
											$('#activator').click(function(){
													$('#box').animate({'top':'0px'},500);
											});
											$('#boxclose').click(function(){
													$('#box').animate({'top':'-700px'},500);
											});
										});
										$(document).ready(function(){
										
										//Hide (Collapse) the toggle containers on load
										$(".toggle_container").hide(); 
										
										//Switch the "Open" and "Close" state per click then slide up/down (depending on open/close state)
										$(".trigger").click(function(){
											$(this).toggleClass("active").next().slideToggle("slow");
											return false; //Prevent the browser jump to the link anchor
										});
										
										});
									</script>
				</div> 
					<div class="clearfix"> </div>				
			</div>			
		</div>
		<div class="container">
			<section class="slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<div class="banner-info" id="home">
								<h1>hi there, Students & <span> Professors </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>
							<div class="banner-info">
								<h1> Students <span> </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>	
							<div class="banner-info">
								<h1>Professors <span> </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>	
							<div class="banner-info">
								<h1>What a nice day it is !! <span> </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>
							<div class="banner-info">
								<h1>Smile Please!! <span> </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
					</ul>
				</div>
			</section>
		</div>
						<!-- FlexSlider -->
							  <script defer src="resources/js/jquery.flexslider.js"></script>
							  <script type="text/javascript">
								$(function(){
								  SyntaxHighlighter.all();
								});
								$(window).load(function(){
								  $('.flexslider').flexslider({
									animation: "slide",
									start: function(slider){
									  $('body').removeClass('loading');
									}
								  });
								});
							  </script>
						<!-- FlexSlider -->
		<div class="info">
			<div class="container">
				<a class="work" href="#about" id="enroll">Enroll</a>
				<a class="hire" href="#contact-us" id="login">Login</a>
			</div>
		</div>
	</div>
<!-- header -->	
<!-- ourstory -->
<div class="hello" id="about">
	<div class="container">
		<div class="col-md-4">
			<h3>SAY <span>HELLO | </span></h3>
		</div>
	
			<div class="clearfix"> </div>
				<p>Welcome new user...Enroll to create your account</p>
				<div class="say">	
					
					<div class="col-md-7">
					<form:form action="registerUser.htm" commandName="userAccount" method="post" >
				  <div class="text-field-firstname">
<form:input path="firstName" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'firstName';}" required="required"/><form:errors  path="firstName" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'firstName';}" required="required"></form:errors>
							
				</div>
						<div class="text-field-lastname">
<form:input path="lastName" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'lastName';}" required="required" /><form:errors path="lastName" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'lastName';}" required="required"></form:errors>
							
						</div>
						
						<div class="text-field-lastname">
<form:input path="username" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'username';}" required="required" /><form:errors path="username" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'username';}" required="required"></form:errors>
							
						</div>
						<div class="text-field-lastname">
<form:input path="password" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}" required="required"/><form:errors path="password" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}" required="required"></form:errors>
						
						</div>
						<div class="text-field-lastname">
<form:input path="emailId"  size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'emailId';}" required="required"/><form:errors path="emailId" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'emailId';}" required="required"></form:errors>
							
						</div>
						
						 <div class="text-field-lastname">
<form:input path="role" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'role';}" required="required"/><form:errors path="role" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'role';}" required="required"></form:errors>
					
						</div> 
						<div class="button">
						
						
						<input type="submit" value="send">
						
						</div>
							<div class="clearfix"> </div>
					</form:form>		
					</div>
						<div class="clearfix"> </div>
				</div>
				
	</div>

</div>	

 <div class="hello" id="contact-us">
	<div class="container">
		<div class="col-md-4">
			<h3>SAY <span>HELLO | </span></h3>
		</div>
	
			<div class="clearfix"> </div>
				<p>Welcome returning user...Sign in to your account.</p>
				<div class="say">	
					
					<div class="col-md-7">
					<form:form action="loginUser.htm" commandName="userAccount" method="post" id="loginForm" >
						<div class="text-field-firstname">
							
							<form:input path="username" size="30" required="required"/><form:errors path="username" size="30" required="required"></form:errors>
						</div>
						<div class="text-field-lastname">
		
						<form:input type="password" path="password" size="30" required="required"/><form:errors type="password" path="password" size="30" required="required"></form:errors>
						</div>
						
						<div class="button">
								<input type="submit" value="send" >
							
						</div>
							<div class="clearfix"> </div>	
					</form:form>	
					</div>
						<div class="clearfix"> </div>
				</div>
				
	</div>
</div> 
<a href="#activator" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>	
</body>
</html>