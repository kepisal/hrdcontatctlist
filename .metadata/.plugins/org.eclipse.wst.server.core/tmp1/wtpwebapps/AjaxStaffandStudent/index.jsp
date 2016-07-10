<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff and Student Management</title>
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- <script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> -->
<script type="text/javascript" src="js/jquery-min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<center>
		<div class="col-sm-2"></div>
		<div class="maincontent text-center col-sm-8">
			<div id="title">
				<h1>Staff and Student Management</h1>
				<h4>Ke Pisal, Class Battambong</h4>
			</div>
			<div id="classlist">
				<label>Search By Name : </label> <input type=text id=txtinput />
				<select	id=classselected onclick="searchClass()">
				
				</select>
			</div>
			<div id="universitylist">
				<select id=unvselected onclick="searchUniversity()">
				
				</select>
			</div>
			<div id="statuslist">
				<select id=statusselected onclick="searchStatus()">
				<option value=''>All Status</option>
				<option value=1>Active</option>
				<option value=0>Deactive</option>
				</select>
			</div>
			<div>
				<table  class="col-md-12">
					<thead>
						<tr>
							<th>ID</th>
							<th>NAME</th>
							<th>GENDER</th>
							<th>UNIVERSITY</th>
							<th>CLASS</th>
							<th>STATUS</th>
						</tr>
					</thead>
					<tbody id="tblist">
					</tbody>
				</table>
			</div>
		</div>
		<div class="col-sm-2"></div>
	</center>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>