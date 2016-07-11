<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<input id="txtid" type="text"/>
	<input id="btntest" class="cltest" type="button" onclick="testrequest()" value="YES" />
</body>
<script type="text/javascript">
$(document).ready(function() {
	lists(); // list all objects in table
	$("#btntest").click(function(data){
		var psid=$("#txtid").val();
		$.post("listobjectby.nk",{
			ps_id : psid
		},
				function(data){		
				alert(data);
		});
	});
/*
 * generate rows inside table list
 * */
function lists() {
	$.post("listobject.nk", function(data) {
		alert(data);
	});
}

})
</script>
</html>