<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>

</head>
<body>
<for:form action="insertvaluestoupdatesearch" modelAttribute="my1">
<table>
<tr>
<th>StudentId</th>
<th>StudentName</th>
<th>StudentDepartment</th>

</tr>

<tr>
<td>${searchvalue.studentId}</td>
<td>${searchvalue.studentName}</td>
<td>${searchvalue.studentDepartment}</td>
</tr>

<tr>
<td><input type="submit" value="UpdateStudent"></input></td>
</tr>

</table>
</for:form>
</body>
</html>
