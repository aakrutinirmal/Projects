<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CourseAdded</title>
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
</head>
<body>
<div class="banner">
		<div class="header" >
<div class="hello" id="addNew">
	<div class="container">
	<div class="logo">
					<a href="registerUser.htm"><img src="resources/images/images-6.jpeg" alt="" /></a>
				</div>
		<div class="col-md-4">
			<h3> <span>PROFESSOR </span></h3>
		</div>
	
			<div class="clearfix"> </div>
				<p>You added new Courses..</p>
				<div class="say">	
					
					<div class="col-md-7">
						<form action="addNewCourse.htm" method="post">		
						<input type="text" class="text" name="courseName" value="courseName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'courseName';}" required />
						
					
						<input type="text" class="text" name="courseDescription" value="courseDescription" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'courseDescription';}" required />
						
							
						<input type="text" class="text" name="creditHour" value="creditHour" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'creditHour';}" required />
						
						<div class="button">
						<input type="submit" value="ADD">
						</div>
				
						<div class="clearfix"> </div>
						
						</form>	 
					
					
					</div>
						<div class="clearfix"> </div>
				</div>
				
	</div>
</div>
</div>
</div>
</body>
</html>