
$(document).ready(function() {
	
	$("#deletebus").click(function(event) {
		
		fire_ajax_delete();
	});
});

function fire_ajax_delete() {
	
	var bus = {};
	bus.id = $("#id").val();
	bus.busName = $("#busName").val();
	bus.pickup = $("#pickup").val();
	bus.dropoff = $("#dropoff").val();
	bus.busTime = $("#busTime").val();
	bus.busType = $("#busType").val();
	console.log(JSON.stringify(bus));
	 self.removeRow = function(bus) {
      self.bus.remove(bus);
    };
	$.ajax({
		type: "DELETE",
		contentType: "application/json",
		url: "http://192.168.1.193:8080/deleteBus/id",
		 dataType: "json",
		 data:ko.toJSON(this),
		
		success: function(data) {
			/*self.showComment.remove(function(bus){return bus.id==id;});*/
			alert("deleted successfully!");
		},
		error: function() {
			alert("error");
		}
	});

	}

