<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Complaint Form</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            
        * {
	margin: 0;
	padding: 0;
}
body {
	font-family: 'Poppins', sans-serif;
        background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url(https://i.postimg.cc/G2xqzrdD/post-complaint.jpg);
	height: 100vh;
	background-size: cover;
	background-position: center center;
	position: relative;
}

.wrapper {
	width: 1170px;
	margin: auto;
}
.nav-area {
	float: right;
	list-style: none;
	margin-top: 30px;
        padding: 20px 20px;
}
.nav-area li {
	display: inline-block;
}
.nav-area li a {
        margin-bottom: 30px;
	color: #fff;
	text-decoration: none;
	padding: 1px 20px;
	font-family: poppins;
	font-size: 20px !important;
	text-transform: uppercase;
}
.nav-area li a:hover {
	background: #fff;
	color: #333;
}
.ui {
    background-color: #333;
    padding: 30px;
    margin-top: 10px;  
    opacity: 0.8;
}
.ui label{
    color: #fff;
}

.ui h1{
    color: #fff;
    font-family: cursive;
}

.inputfield
 {  
 position:relative;  
 top:30px;  
 width:900px;  
 line-height: 60px!important;  
 }
            
        </style>
        

    </head>
    <body>
       
        <div class="container">
            
           <div class="row">
               
               <div class="col-log-3"></div>
               
               <div class="col-log-6">
                   <div class="ui">
                       <h1 class="text-center">POST COMPLAINT HERE</h1><br>
                       <form action="FileUploadServlet" method="post" enctype="multipart/form-data" class="form-group text-center">
                           <div class="row">
                               <div class="col-lg-6">
                                   <label>Full Name :</label>
                                   <input type="text" name="fullname" class="form-control" required="required" placeholder="Enter your First name">
                               </div>
                               <div class="col-lg-6">
                                   <label>Mobile Number :</label>
                                   <input type="tel" name="number" class="form-control" required="required" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" maxlength="10" placeholder="Enter your Mobile Number">
                               </div>
                            </div>
                           
                           <br>
                              <div class="row">
                               <div class="col-lg-6">
                                   <label>E-mail :</label>
                                   <input type="email" name="email" id='email' class="form-control" required="required" placeholder="Enter your Email">
                               </div>
                               <div class="col-lg-6">
                                  <label>Department :</label>
                           <select class="form-control" name="complainttype">
                               <option value="Choose Department">Choose Department</option>
                               <%
                                                try
                                                {
                                                    Connection conn1=null;
                                                    Statement stat1=null;
                                                    ResultSet res1=null;
                                                    String data1="select * from department";
                                                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                    conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root","");
                                                    stat1=conn1.createStatement();
                                                    res1 = stat1.executeQuery(data1);
                                                    while(res1.next())
                                                    {
                                                        %>
                                                        <option value="<%=res1.getString("dept_name")%>"><%=res1.getString("dept_name")%></option>
                                                        <%
                                                    }

                                                }
                                                catch(Exception ex)
                                                {
                                                    ex.printStackTrace();
                                                    out.println("Error "+ex.getMessage());
                                                }
                                                
                                                %>
                           </select>
                               </div>
                            </div>   
                     <br>
                      <label>Describe Your Complaint :</label>
                                <textarea class="form-control" type="textarea" required="required" name="explanation" id="comments" placeholder="Describe..." maxlength="6000" rows="2"></textarea>

                           <br>
                           <div class="row">
                           <div class="col-lg-6">
                                <label for="imageFile">Select some images:</label>
	                   <input type="file" id="imageFile" name="file" class="form-control" multiple>
                            </div>
                            <div class="col-lg-6">
                                <label for="imageFile">Address of complaint</label>
	                   <input type="text" id="add" name="address" class="form-control" >
                            </div>
                            </div>
                            <br>
                                   
                           <button onclick="getLocation()" type="button"  class="btn btn-info btn-block btn-lg">Get Your Location</button><br>
                           <div class="row">
                               <div class="col-lg-6">
                                   <label>Latitude :</label>
                                   <input type="text" id="latValue" name="latitude" class="form-control" >
                               </div>
                               <div class="col-lg-6">
                                   <label>Longitude :</label>
                                   <input type="text" id="longValue" name="longitude" class="form-control" >
                               </div>
                            </div>
                           <p id="demo"></p>
                           <br> 
                           <input type="hidden" name="status" class="form-control" required="required" value="Updating soon">
                           <input type="hidden" name="employee" class="form-control" required="required" value="allotment in process">
                           <input type="hidden" name="cmptid" class="form-control" >

                
                           
                           <input type="submit" value="SUBMIT" class="btn btn-info btn-block btn-lg" onclick="sendalert()">
                           
                       </form>
                    </div> 
               </div>
           </div>
        </div>
        <script type="text/javascript">
$('#myList').change( function() {
    $('.typetoggle').hide();
});
</script>

<script>
function sendalert() {
    alert("your complaint successfully registered");
}    
</script>

        <script>
var x = document.getElementById("demo");

function getLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition, showError);
  } else { 
    x.innerHTML = "Geolocation is not supported by this browser.";
  }
}

function showPosition(position) {
  document.getElementById("latValue").value = position.coords.latitude;
  document.getElementById("longValue").value = position.coords.longitude;
  // x.innerHTML = "Latitude: "  + position.coords.latitude + 
  // "<br>Longitude: " + position.coords.longitude;
}

function showError(error) {
  switch(error.code) {
    case error.PERMISSION_DENIED:
      x.innerHTML = "User denied the request for Geolocation."
      break;
    case error.POSITION_UNAVAILABLE:
      x.innerHTML = "Location information is unavailable."
      break;
    case error.TIMEOUT:
      x.innerHTML = "The request to get user location timed out."
      break;
    case error.UNKNOWN_ERROR:
      x.innerHTML = "An unknown error occurred."
      break;
  }
}
</script>
    </body>
</html>
