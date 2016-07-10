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
				<h1>Contact Information List</h1>
			</div>
			<div id="classlist">
				<label>Search By Name : </label> <input type=text id=txtinput /> <select
					id=classselected onclick="searchClass()">

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
				<b><a href="#">New Contact</a></b>
			</div>
			<div>
				<table class="col-md-12">
					<thead>
						<tr>
							<th>No</th>
							<th>Name</th>
							<th>GENDER</th>
							<th>Position</th>
							<th>Institue</th>
							<th>Contact</th>
							<th>Remark</th>
						</tr>
					</thead>
					<tbody id="tblist">
					</tbody>
				</table>
			</div>
			<div></div>
		</div>
		<div class="col-sm-2"></div>
	</center>
	<!-- <div class="col-md-3"></div>
	<div class="col-md-6">
		<table class="col-md-12">
			<thead>
				<h1>Student information</h1>
			</thead>
			<tbody>
				<tr>
					<td><label>Student ID : </label></td>
					<td><input type="text" id="txtid" /></td>
				</tr>
				<tr>
					<td><label>Student Name : </label></td>
					<td><input type="text" id="txtname" /></td>
				</tr>
				<tr>
					<td><label>Student Gender : </label></td>
					<td><select>
							<option>Male</option>
							<option>Female</option>
					</select></td>
				</tr>
				<tr>
					<td><label>Student University : </label></td>
					<td><input type="text" id="txtid" /></td>
				</tr>
				<tr>
					<td><label>Student Class : </label></td>
					<td><input type="text" id="txtid" /></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					
					<td colspan="2"><input type="button" value="Cancel" /><input type="button" value="Submit" /></td>
				</tr>
			</tfoot>
		</table>
	</div>
	<div class="col-md-3"></div> -->
	<!-- <script type="text/javascript" src="js/script.js"></script> -->
</body>
</html>