<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Home" method="POST">
<h4>Hotel Name:<span> <input type="text" title="hotelname" size="25"></span></h4> 
<h4>Number of Rooms:<input type="text" name="numberOfRooms1" size="2">
Room Type: <select name="roomType1">
	<option>Double</option>
	<option>King</option>
	<option>Queen</option>
</select></h4>
<h4>Number of Rooms:<input type="text" name="numberOfRooms2" size="2">
Room Type: <select name="roomType2">
	<option>Double</option>
	<option>King</option>
	<option>Queen</option>
</select></h4>
<h4>Number of Rooms:<input type="text" name="numberOfRooms3" size="2">
Room Type: <select name="roomType3">
	<option>Double</option>
	<option>King</option>
	<option>Queen</option>
</select></h4>
<button type="submit" name="submit" >Submit</button>
</form>
</body>
</html>