$(document).ready(function() {
	
	$("#error_busName").hide();
	$("#error_pickup").hide();
	
	var error_busName=false;
	var error_pickup=false;
	
	$("#busName").focusout(function(){
		check_busName();
	});
	$("#pickup").focusout(function(){
		check_pickup();
	});
	
	function check_busName()
	{
		var tname=$("#busName").val().length;
		if(tname<=4){
			$("#error_busName").html("This Field Required");
			$("#error_busName").show();
			error_theatrename=true;
		}else{
			$("#error_busName").hide();
		}
	}
	
	
	function check_pickup(){
		var pu=$("#pickup").val()
		if(pu<=0){
			$("#error_pickup").html("This Field Required");
			$("#error_pickup").show();
			error_pickup=true;
		}else{
			$("#error_pickup").hide();
		}
	}
	
	
	$("#add-bus").click(function(event) {
		
		
		error_busName=false;
		error_pickup=false;
		check_busName();
		check_pickup();
		
		if(error_busName==false && error_pickup==false){
			var bus = {};
			
		
		
	
	bus.id = $("#id").val();
	bus.busName = $("#busName").val();
	bus.pickup = $("#pickup").val();
	bus.dropoff = $("#dropoff").val();
	bus.busTime = $("#busTime").val();
	bus.busType = $("#busType").val();
	console.log(JSON.stringify(bus));
	

	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "http://192.168.1.193:8080/addBus",
		data: JSON.stringify(bus),

		success: function() {
			alert("Saved successfully!");
			$("#myform")[0].reset();
		},
		error: function() {
			alert("error");
		}

	})
	}
	});
});

