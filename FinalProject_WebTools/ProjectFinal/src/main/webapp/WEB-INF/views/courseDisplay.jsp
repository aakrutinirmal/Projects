<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Course</title>
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



<h3>The courses are:</h3>



<form action="addCourseToStudent.htm" method="post">
<select name="selectCourse">
<c:forEach var="course" items="${courses}">               
               <option value="${course.crn}">${course.courseName}</option>
            </c:forEach>
</select>

<input type="submit"  value="ENROLL TO COURSE">
 </form>

</div>
</div>
</div>
</div>
</div>


</body>
</html>