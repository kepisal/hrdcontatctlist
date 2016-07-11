$(document).ready(function() {
	lists(); // list all objects in table
	
/*
 * generate rows inside table list
 * */
function lists() {
	$.post("listobject.hrd", function(data) {
		$("#tblist").html(listobjectdetails(data));
	});
}
})