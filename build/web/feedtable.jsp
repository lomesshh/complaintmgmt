<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Feedback Form</title>
    <style>

body{
		background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), url(https://i.postimg.cc/yYC536yP/feedbackimg.jpg);
		height: 100vh;
		-webkit-background-size: cover;
		background-size: cover;
		background-position: center center;
		position: relative;
	}

.header{
    color: black;
	text-align: center;
	margin-top: 5rem;
	margin-bottom: 5rem;
	font-size:40px
}
/*
th{
    color: black;

}

th{
    color: black;
    font-family: Georgia, serif;
    font-size: 20px;
    font-weight: bold;
    background-color: #d8f0f2;  
}*/


.content-table {
  border-collapse: collapse;
  margin: 25px 0;
  font-size: 0.9em;
  min-width: 400px;
  border-radius: 8px 8px 0 0;
  overflow: hidden;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.content-table thead tr {
  background-color: #9966FF;
  color: #fff;
  text-align: left;
  font-size: 18px;
}

.content-table th,
.content-table td {
  padding: 12px 15px;
}

.content-table tbody tr {
  border-bottom: 1px solid #ccccff;
}

.content-table tbody tr:nth-of-type(even) {
  background-color: #f3f3f3;
}

.content-table tbody tr:last-of-type {
  border-bottom: 2px solid #ccccff;
}

.content-table tbody tr.active-row {
    font-size: 15px;
}

    </style>    
</head>
<body>
    <%@page import="java.sql.*,java.util.*"%>
    <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root","");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from feedback");
        %>
        
        <div class="header">
		<p style="color: #bb99ff;
		font-family: Georgia, serif;
		font-size: 40px;
		font-weight: bold; ">User Feedbacks</p>
		</div>

	<div class="content-blog">
		<div class="container">
			<table class="table table-striped content-table">
				<thead>
                                   
						<th>Experience</th>
						<th>First name</th>
						<th>Last name</th>
						<th>Number</th>
						<th>Email</th>
						<th>Comments</th>
					
				</thead>
                                <%
                                while(rs.next()){
                                %>
				<tbody >
					<tr class="active-row">
						<td><%=rs.getString(1)%></td>
						<td><%=rs.getString(2)%></td>
						<td><%=rs.getString(3)%></td>
						<td><%=rs.getString(4)%></td>
						<td><%=rs.getString(5)%></td>	
						<td><%=rs.getString(6)%></td>								
					</tr>
				</tbody>
			<% } %></table>
		</div>
	</div>
</body>
</html>
