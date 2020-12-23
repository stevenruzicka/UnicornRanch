<%@page import="com.ruzicka.unicorns.Ranch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You don't belong here.</title>
</head>
<body>
   <%
     	Ranch ranch = new Ranch();
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		ranch.updateUnicorn(name,location);
	%>

</body>
</html>