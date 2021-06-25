$(document).ready(function() {
	
	$("#book-bus").click(function(event) {
		
		fire_ajax_submit();
	});
});

function fire_ajax_submit() {
	
	var bus = {};
	bus.id = $("#id").val();
	bus.name = $("#name").val();
	bus.mobileNo = $("#mobileNo").val();
	bus.email = $("#email").val();
	bus.pickup = $("#pickup").val();
	bus.pickup = $("#dropoff").val();
	bus.busName = $("#busName").val();
	bus.busTime = $("#busTime").val();
	bus.seatPrice=$("#seatPrice").val();

	console.log(JSON.stringify(bus));
	

	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "http://192.168.1.193:8080/bookBus",
		data: JSON.stringify(bus),

		success: function() {
			alert("Saved successfully!");
		},
		error: function() {
			alert("error");
		}

	})
}