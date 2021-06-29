<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>ADMIN PAGE</title>
  <link rel="stylesheet" href="assets/css/bootstrap.css">
  <link rel="stylesheet" href="assets/css/google_releway.css">
   <link rel="stylesheet" href="assets/css/google_coiny.css">
   <link rel="stylesheet" href="css/awesomefont.css">
   <link rel="stylesheet" href="assets/css/style.css">
   <link rel="stylesheet" href="//pro.fontawesome.com/releases/v5.10.0/css/all.css">
  <link rel="stylesheet" href="//cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="//cdn.datatables.net/buttons/1.7.0/css/buttons.dataTables.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="./style.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>


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

.gone{
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
    color: white;
    font-family: Georgia, serif;
    font-size:10;
    font-weight: bold;
    background-color: #9370DB;
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

/* tables */
table {
  border-collapse: collapse;
  width: 96%;
  margin: 2%;
}

th {
  text-align: left;
  font-weight: 400;
  font-size: 13px;
  text-transform: uppercase;
  border-bottom: 1px solid rgba(0, 0, 0, 0.1);
  padding: 0 10px;
  padding-bottom: 14px;
}

tr:not(:first-child):hover {
  background: rgba(0, 0, 0, 0.1);
}

td {
  line-height: 40px;
  font-weight: 300;
  padding: 0 10px;
}

@media screen and (min-width: 600px) {
  html, body {
    height: 100%;
  }

  header[role=banner] {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    z-index: 99;
    height: 75px;
  }
  header[role=banner] .utilities {
    position: absolute;
    top: 0;
    right: 0;
    background: transparent;
    color: white;
    width: auto;
  }
  header[role=banner] .utilities li {
    display: inline-block;
  }
  header[role=banner] .utilities li a {
    padding: 0.5em 1em;
  }

  nav[role=navigation] {
    position: fixed;
    width: 200px;
    top: 75px;
    bottom: 0px;
  }

  main[role=main] {
    margin: 75px 0 40px 200px;
  }
  main[role=main]:after {
    content: "";
    display: table;
    clear: both;
  }

  .panel {
    margin: 2% 0 0 2%;
    float: left;
    width: 96%;
  }
  .panel:after {
    content: "";
    display: table;
    clear: both;
  }

  .box, .twothirds, .onethird {
    padding: 1rem;
  }

  .onethird {
    width: 33.333%;
    float: left;
  }

  .twothirds {
    width: 66%;
    float: left;
  }

  footer[role=contentinfo] {
    clear: both;
    margin-left: 200px;
  }
}
@media screen and (min-width: 900px) {
  footer[role=contentinfo] {
    position: fixed;
    width: 100%;
    bottom: 0;
    left: 0px;
    margin: 0;
  }

  .panel {
    width: 47%;
    clear: none;
  }
  .panel.important {
    width: 96%;
  }
  .panel.secondary {
    width: 23%;
  }
}
.topnav {
  overflow: hidden;
  background-color: #AF8FF1;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: red;
  color: black;
}

.topnav a.active {
  background-color: #AF8FF1;
  color: white;
}

.topnav-right {
  float: right;
}

</style>
</head>
<%
	
%>
<body>
    
    
<div class="topnav">
  <a class="active" href="#"><i class="fa fa-users fa-lg" aria-hidden="true">	&nbsp;Employee Dashboard</i></a>
  <div class="topnav-right">
      <a href="index.html"><i class="fa fa-sign-out fa-lg" aria-hidden="true" style="color: white;"> Logout</i></a>
  </div>
</div>
    <br>
<div class="gone">
		<p style="color: #D0C1ED;
		font-family: Georgia, serif;
		font-size: 40px;
		font-weight: bold; ">Alloted Complaints</p>
		</div>
    <% 
	String name=(String)session.getAttribute("fname");
	System.out.println(name);
	try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root","");
	Statement st= con.createStatement();

	ResultSet rs=st.executeQuery("select * from complaint where employee='"+name+"'");
	
	
	while(rs.next()){
		
	


%>

    <div class="content-blog">
		<div class="container">
                    <center>
                    <table class="table table-striped">
                        <thead >
                                                <th style="padding: 6px 6px;">Comp id</th>
                                                <th style="padding: 6px 6px;">Full name</th>
                                                <th style="padding: 6px 6px;">Address</th>
						<th style="padding: 6px 6px;">Number</th>
						<th style="padding: 6px 6px;">Email</th>
						<th style="padding: 6px 6px;">Complaint Type</th>
						<th style="padding: 6px 6px;">Explanation</th>
						<th style="padding: 6px 6px;">latitude</th>
						<th style="padding: 6px 6px;">longitude</th>
						<th style="padding: 6px 6px;">Status</th>
						<th style="padding: 6px 6px;">Alloted Employee</th>


</thead>
<tbody>
	
	<tr style=" border-bottom: 2px solid #BB9FF3;">		
			<td><%out.println(rs.getString(1)); %></td>
			<td><%out.println(rs.getString(2));%></td>
			<td><%out.println(rs.getString(3)); %></td>
			<td><%out.println(rs.getString(4)); %></td>
			<td><%out.println(rs.getString(5)); %></td>
			<td><%out.println(rs.getString(6)); %></td>
			<td><%out.println(rs.getString(7)); %></td>
			<td><%out.println(rs.getString(9)); %></td>
			<td><%out.println(rs.getString(10)); %></td>
			<td><%out.println(rs.getString(11)); %></td>
			<td><%out.println(rs.getString(12)); %></td>
			
		
	</tr>


<%
	}
	}
	catch(Exception e){
		System.out.println(e);
	}

%>
</tbody>
</table><br><br>

</body>
<script src="../dataTables/js/jquery.js"></script>
<script src="../dataTables/js/jquery.datatables.js"></script>
<script src="../dataTables/js/datatables.bootstrap.js"></script>
<script src="//code.jquery.com/jquery-3.5.1.js"></script>
<script src="//cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
<script src="//cdn.datatables.net/buttons/1.7.0/js/dataTables.buttons.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
<script src="//cdn.datatables.net/buttons/1.7.0/js/buttons.html5.min.js"></script>
<script src="//cdn.datatables.net/buttons/1.7.0/js/buttons.print.min.js"></script> 

<script>


$(document).ready(function() {
    $('#example').DataTable( {
    	
    } );
} );
</script>

</html>