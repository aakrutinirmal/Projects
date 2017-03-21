<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Asap:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Karla:400,400italic,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="resources/css/flexslider.css" type="text/css" media="screen" />
<link href="resources/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<script src="resources/js/jquery.min.js"></script>

<script>
function courseCallAjax() {


	$.ajax({
		type : "GET",
		url : "displayCoursesToStudent.htm",
		contentType: "application/json",
		dataType : "json",
		success : function(response) {
		//	displayTheContent(response);
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
	alert("inside display");
	$("#displayDiv").empty();
	for(var i=0, l = response.length; i < l; i++){
		var user = response[i];
		$("#displayDiv").attr('style', 'color: #1ABC9C !important;');
		$("#displayDiv").append("<a href='#Marks'><li>"+course.courseName+" "+course.courseName+"</li></a>");
	}
}

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
					<div class="col-md-7">
					
					<h3>SEE courses:</h3>
				
				<form action="displayCoursesToStudent.htm" method="get">		
						
						<div class="button">
						<input type="submit" value="SHOW">
						</div>
				
					<!-- 	<div class="clearfix"> </div> -->
						
						</form>			 
					 
</div>
</div>
</div>
	</div>
	</div>				 
					 
</body>
</html>