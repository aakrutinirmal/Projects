<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>

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
<div class="banner">
		<div class="header" >
<div class="hello" id="about">
	<div class="container">
<div class="col-md-12">
			<h2><span>Hello Students and Professors...</span></h2> 
<h3><a href="registerUser.htm">Enter the Blackboard!!</a></h3>
<!-- <a href="loginUser.htm">Login</a> -->
</div>
</div>

</div>
</div>
</div>

</body>

</html>

