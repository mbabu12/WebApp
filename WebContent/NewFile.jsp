<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebApp</title>
</head>
<body>
<form action = "Main" method="post" enctype="multipart/form-data">
	<fieldset>
		<legend>Upload cpp file</legend>
    	<input type="file" name="file">
    	<legend>Upload input file</legend>
    	<input type="file" name="input">
    	<legend>Upload test file</legend>
    	<input type="file" name="test">
    	<input type="submit" value="Upload">
    </fieldset>
</form>
</body>
</html>