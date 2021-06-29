<html>
    <head>
        	<style>
	/*Reset*/
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
	user-select: none;
}

body {
	height: 100vh;
	width: 100vw;
	font-family: arial;
	background: url('https://i.postimg.cc/T1QN2gMS/pexels-lukas-590022.jpg') no-repeat;
	background-size: cover;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container {
	background-color: rgba(0 ,0 , 0, 0.5);
	height: 700px;
	width: 600px;
	border-radius: 0.9rem;
	display: flex;
	justify-content: center;
	box-shadow: 2px 2px 15px #000;
}

.container .form-heading {
	height: 3rem;
	margin: 2.5rem 0 1rem 0;
	text-transform: uppercase;
	display: flex;
	justify-content: center;
	align-items: center;
	color: white;
}

.container .form-group {
	padding: 0.9rem;
}

.container .form-group label {
	font-size: 1.3rem;
	color: #fff;
}

.container  .form-group input {
	background-color: rgba(255, 255, 255, 0.7);
	height: 30px;
	width: 20rem;
	border-radius: 0.4rem;
	font-size: 1rem;
	font-weight: bold;
	text-align: center;
	border: none;
	outline: none;
}

.container .form-btn {
	text-align: center;
	padding: 0.9rem;
}

.container .form-btn input[type="submit"] {
	background-color: 	#FA8072;
	color: #fff;
	padding: 0.3rem 0.9rem;
	font-weight: bold;
	font-size: 1.1rem;
	border-radius: 0.3rem;
	border: none;
	outline: none;
	cursor: pointer;
}

.container .form-btn input[type="submit"]:hover {
	background-color: 	#CD5C5C;
}

.container .form-text p {
	color: orange;
	text-decoration: underline;
	cursor: pointer;
}
	</style>
    </head>
    <body>
         <div class="container">
		<form action=""newjsp.jsp method="post">
                    <br><br><br><br><br><br><br><br><br><br>
			<div class="form-heading">
				<h1>Check Status</h1>
			</div>
			<div class="form-group">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>Enter Complaint ID</label><br><br>
				&nbsp;<input type="text" name="eid">
			</div>
			<div class="form-btn">  
				<input type="submit"  value="Get Status">
                                
			</div>
                    </div>
                 </form>
    
<%@page import="java.sql.*"%>

<%
String id=request.getParameter("eid");
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root","");
    if(!cn.isClosed())
    {
        PreparedStatement ps=cn.prepareStatement("select * from complaint where id='"+id+"'");
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {%>
       <div class="container">
		<form >
                    <br><br><br><br><br><br><br><br>
			<div class="form-group">
				<label>Complaint ID:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" readonly value='<%=rs.getString("id") %>'>
			</div>
			<div class="form-group">
				<label>First Name:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" readonly value='<%=rs.getString("fullname") %>'>
			</div>
			<div class="form-group">
				<label>Cont Number:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" readonly value='<%=rs.getString("number") %>'>
			</div>
			<div class="form-group">
				<label>Email:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" readonly value='<%=rs.getString("email") %>'>
			</div>
			<div class="form-group">
				<label>Complaint Type:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" readonly value='<%=rs.getString("complainttype") %>'>
			</div>
			<div class="form-group">
				<label>Status:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" readonly value='<%=rs.getString("status") %>'>
			</div>
			<div class="form-group">
				<label>Alloted Employee:</label>&nbsp;&nbsp;&nbsp;
				<input type="text" readonly value='<%=rs.getString("employee") %>'>
			</div>
		</form>
	</div>
    </body>
</html>
        <%}
        else
        {
            out.println("");
        }
    }
}
catch (Exception e)
{
    out.println("The Error is :" +e.getMessage());
}

%>