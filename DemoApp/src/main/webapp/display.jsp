
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:out value="Hello World" />
		
		<sql:setDataSource var="db" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" url="jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=test" user="kranthi" password="Password@123"/>
		
		<sql:query var="rs" dataSource="${db}">select * from dbo.Student</sql:query>
		
		<c:forEach items="${rs.rows}" var="stud">
				<c:out value="${stud.FirstName }" /> <br>
		</c:forEach>

</body>

</html>