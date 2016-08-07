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
function retrieveobjectby() {
	var stuname = $('#txtinput').val();
	var stuclass = $('#classselected option:selected').val();
	var stuuniver = $('#unvselected option:selected').val();
	var stustatus = $('#statusselected option:selected').val();
	if (stuname == '') {
		lists();
	}
	$.post("searchobject.hrd", {
		stu_name : stuname,
		stu_class : stuclass,
		stu_university : stuuniver,
		stu_status : stustatus
	}, function(data) {
		$("#tblist").html(listobjectdetails(data));
	});
}
})