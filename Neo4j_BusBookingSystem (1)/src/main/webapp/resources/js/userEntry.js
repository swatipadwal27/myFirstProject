$(document).ready(function() {
	
	
	$("#add-user").click(function(event) {
		
		fire_ajax_submit();
	});
	
	  
      
});

function fire_ajax_submit() {
	
	var user = {};
	user.username = $("#username").val();
	user.password = $("#password").val();
	user.role = $("#role").val();
	console.log(JSON.stringify(user));
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "http://192.168.1.193:8080/userEntry",
		data: JSON.stringify(user),

		success: function() {
			alert("Saved successfully!");
		},
		error: function() {
			alert("error");
		}

	})
	
}


