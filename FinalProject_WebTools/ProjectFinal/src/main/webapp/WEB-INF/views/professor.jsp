<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Professors!!</title>
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
			
<script>
function sampleAjax() {


	$.ajax({
		type : "GET",
		url : "professorCourses.htm",
		contentType: "application/json",
		dataType : "json",
		success : function(response) {
			displayTheContent(response);
			 alert("success");
			alert(response); 
		},
	
		error : function(){
		 	alert("Error"); 
			//write whatever you want here
		}

	});

}

function displayTheContent(response){
	
	$("#displayDiv").empty();
	for(var i=0, l = response.length; i < l; i++){
		var user = response[i];
		$("#displayDiv").attr('style', 'color: #1ABC9C !important;');
		$("#displayDiv").append("<a href='#Marks'><li>"+user.firstName+" "+user.lastName+"</li></a>");
	}
}

</script>

 

</head>
<body>

<!-- header -->
	<div class="banner">
		<div class="header" >
			<div class="container">
				<div class="logo">
					<a href="registerUser.htm"><img src="resources/images/images-6.jpeg" alt="" /></a>
				</div>
				<div class="menu">												
					<a href="#" class="right_bt" id="activator"><img src="resources/images/menu.png" alt=""/></a>
						<div class="box" id="box">
							<div class="box_content">
							   <div class="menu_box_list">
								   <ul>
									   <li class="active"><a href="#home" class="scroll">Home</a></li>
									   	<li><a href="#addNew" class="scroll">Add Courses</a></li>
										<li><a href="#about" class="scroll">Taught Courses</a></li>
									
										<li><a href="#logout" class="scroll">Logout</a></li>
										
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
								<h1>Hi there <span> Professors </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>
							<div class="banner-info">
								<h1>Have a nice <span> Day</span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>	
							<div class="banner-info">
								<h1>Enter Marks <span> </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>	
							<div class="banner-info">
								<h1>Grade Students <span> </span></h1>
								<p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit </p>
							</div>
						</li>
						<li>
							<div class="banner-info">
								<h1>Check average <span> </span></h1>
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
		
	</div>
<!-- header -->	
<div class="ourservices" id="about">
	<div class="container">
		<div class="col-md-5">
			<h2>TAUGHT <span>COURSES |</span></h2>
		</div>
			<div class="clearfix"> </div>
		
	 <a href="#enterMarks1">Get list of Students</a>
	 
	 
	<div class="clearfix"> </div>
	</div>
</div>
<a href="#activator" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

<div class="hello" id="addNew">
	<div class="container">
		<div class="col-md-4">
			<h3>HELLO <span>PROFESSOR </span></h3>
		</div>
	
			<div class="clearfix"> </div>
				<p>You can add new Courses..</p>
				<div class="say">	
					
					<div class="col-md-7">
		
						<form action="addCourses.htm" method="post">
					
								
						<div class="button">
						<input type="submit" value="send">
						</div>
						</form>							
				 	
				 	
				 	
				 	<%--  <form:form action="addCourses.htm" commandName="course" method="post" > 
				
					
				 	<div class="text-field-firstname">
					<form:input path="courseName" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'courseName';}" />
					</div>
					
					<div class="text-field-firstname">
					<form:input path="courseDescription" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'courseDescription';}" />
					</div>	
						
					<div class="text-field-firstname">
					<form:input path="creditHour" size="30" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'creditHour';}" />
					</div>
						
						<div class="button">
					  <input type="submit" value="ADD"  >
						</div>
				
						
					 </form:form>   --%>
					 
					
					</div>
						<div class="clearfix"> </div>
				</div>
				
	</div>

</div>

<a href="#activator" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>





<div class="hello" id="enterMarks1">
	<div class="container">
		<div class="col-md-4">
			<h3>SAY <span>HELLO | </span></h3>
		</div>
	
			<div class="clearfix"> </div>
				<p>Get list of all students..</p>
				<div class="say">	
					
					<div class="col-md-7">
					
					<form action="professorCourses.htm" method="get">
					
								
						<div class="button">
						<input type="submit" value="GET STUDENTS">
						</div>
						</form>	
					
					
					
					
					
					<!-- <div class="button">
					  <input type="submit" value="SHOW" onclick=" return sampleAjax();" >
						</div>	
						<div  class="clearfix" id="displayDiv"></div> -->
								
						
							<div class="clearfix"> </div>	 
					
					<!-- <span id="page"> <button onclick="fn()" >Students</button></span>	 -->
					</div>
						<div class="clearfix"> </div>
				</div>
				
	</div>
</div>
<div class="hello" id="Marks">
	<div class="container">
		<div class="col-md-4">
			<h3>SAY <span>HELLO | </span></h3>
		</div>
	
			<div class="clearfix"> </div>
				<p>Enter Marks..</p>
				<div class="say">	
					
					<div class="col-md-7">
			 	
					<form action="addMarksToStudent.htm" method="post">
					
								
						<div class="button">
						<input type="submit" value="send">
						</div>
						</form>							
				 	
				
				 
				
					</div>
						<div class="clearfix"> </div>
				</div>
				
	</div>
</div>
<div class="hello" id="logout">
	<div class="container">
	<div class="logo">
					<a href="registerUser.htm"><img src="resources/images/images-6.jpeg" alt="" /></a>
				</div>
		<div class="col-md-4">
			<h3>SAY <span>HELLO | </span></h3>
		</div>
	
			<div class="clearfix"> </div>
				<p>You sure you want to Log Out?</p>
				<div class="say">	
					
					<div class="col-md-7">
					<form:form action="logout.htm" commandName="userAccount" method="get" >
						<form:input path="username" size="30"  />
						<div class="button">
								<input type="submit" value="YES" id="results" >
							
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