<%@page import="java.sql.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
        	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<title>View Data</title>
<style>

body{
	background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), url(https://i.postimg.cc/yYC536yP/feedbackimg.jpg);
	height: 100vh;
	-webkit-background-size: cover;
	background-size: cover;
	background-position: center center;
	position: relative;
        align-content: center;
}

.header{
    color: black;
	text-align: center;
	margin-top: 5rem;
	margin-bottom: 5rem;
	font-size:40px
}

th{
    color: black;
    
}

th{
    color: black;
    font-family: Georgia, serif;
    font-size:10;
    font-weight: bold;
    background-color: #d8f0f2;  
}

td{
    color: black;

}

td{
    color: black;
    font-family: 'Source Sans Pro', sans-serif;
    font-size:10;
    font-weight: bold;
    background-color: whitesmoke;  
}




    </style>

</head>
<body>
<div class="header">
		<p style="color: #d8f0f2;
		font-family: Georgia, serif;
		font-size: 40px;
		font-weight: bold; ">User Complaints</p>
		</div>
    <div class="content-blog">
		<div class="container">
                    <center>
                    <table class="table table-striped">
				<thead>
                                                <th>Comp id</th>
                                                <th>Full name</th>
						<th>Number</th>
						<th>Email</th>
						<th>Complaint Type</th>
						<th>Explanation</th>
						<th>image</th>
                                                <th>Address</th>
						<th>latitude</th>
						<th>longitude</th>
						<th>Status</th>
						<th>Alloted Employee</th>
                                                <th>Action</th>


</thead>
<tbody>
<% 

String host="jdbc:mysql://localhost:3306/complaint2";
Connection conn=null;
Statement stat=null;
ResultSet res=null;
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection(host,"root","");
stat=conn.createStatement();
String data="select * from complaint order by id";
res=stat.executeQuery(data);
while(res.next()){
	
%>
<tr>
    <td><%=res.getString("id") %></td>
  <td><%=res.getString("fullname") %></td>
   <td><%=res.getString("number") %></td>
    <td><%=res.getString("email") %></td>
     <td><%=res.getString("complainttype") %></td>
      <td><%=res.getString("explanation") %></td>
       <td><a target="_blank" href="images/<%=res.getString("filename") %>">
           <image src="images/<%=res.getString("filename") %>" width="70" height="70"/>
           </a>
       </td>
        <td><%=res.getString("address") %></td>
       <td><%=res.getString("latitude") %></td>
       <td><%=res.getString("longitude") %></td>
       <td><%=res.getString("status") %></td>
       <td><%=res.getString("employee") %></td>
       <td>
                    <a href='updateDriver.jsp?u=<%=res.getString("number") %>' class="btn btn-info">Update</a>
       </td>
 </tr>
 <%
 }%>
</tbody>

</table>
</body>
</html>