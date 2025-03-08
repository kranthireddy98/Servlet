<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
			String DB_URL = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=test";
            String USER = "kranthi";
            String PASSWORD = "Password@123";

         String sql ="select * from dbo.Student";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            rs.next();
%>
Id : <%= rs.getString(1) %> <br>
Name : <%= rs.getString(2) %> <br>
88 <br>
</body>
</html>