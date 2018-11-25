<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form method="post" action="insertstudentdetails" modelAttribute="my">
<table>

<tr>
<td>Student Name</td>
<td><for:input path="studentName"/></td>
<td><for:errors path="studentName"></for:errors></td>
</tr>

<tr>
<td>Student Department</td>
<td><for:select path="studentDepartment" items="${dept}"/></td>
</tr>

<tr>
<td><input type="submit" value="Add Student"></input></td>
</tr>

</table>
</for:form>


</body>
</html>