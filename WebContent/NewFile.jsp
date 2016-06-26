<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebApp</title>
<script type="text/javascript">
var upload = function() {
    var cppfiles = document.getElementById("cppfile").files[0];
    return false;
};
</script>
</head>
<body>
<form method="post" onsubmit="return upload();">
  <fieldset>
    <legend>Upload cpp file</legend>
    <input type="file" name="cppfile" id="cppfile">
    <input type="submit" value="Upload">
  </fieldset>
</form>

</body>
</html>