

var sets = [];
	var selectedSet = [];
			var seatprice=100;
			var temp=0;
			var ans=0;
			var t=0;
			var mainprice=0;
$(document).ready(function(){
	$("#setTable td").click(function(){
		if($(this).hasClass("selectdSet"))
		{
			$(this).removeClass("selectdSet");
		}
		else
		{
			$(this).addClass("selectdSet");
		}
	});
	
	$( "td" ).click(function() {

    $( this ).toggleClass( "selected" );
     if($(this).hasClass("selected"))
     {
            	temp=temp+seatprice;
            	ans=temp;
            	selectedSet.push($(this).text());
          	$("#mainprice").text(temp);
          	
           if(ans>0)
           	{
             		ans=(temp*18)/100;
             		ans=ans+temp;
             		t=ans;
             		$("#totalprice").text(ans);
           	}
       }
            else
            {
            	selectedSet.pop($(this).text());
            	if(ans>0)
            	{
            		ans=ans-118;
            		$("#totalprice").text(ans);
            		
            	}
            	temp=temp-seatprice;
            }
    		$("#mainprice").text(temp);
            var name=$(this).text();
            console.log(selectedSet);

        });
          $("td.selected").each(function(){
            selectedSet.push($(this).text());
            alert(selectedSet);
        });
        
        
  
	/*$("#btnBookSeat").click(function(){
		$("#setTable td.selectdSet").each(function(){
			sets.push($(this).text());
		});
		console.log(sets);
	});*/
	
	$("#btnBookSeat").click(function(){
		$("td.selectdSet").each(function(){
			sets.push($(this).text());
			
		});
		
		/*$("td.selectdSet").each(function(){
			temp=temp+price;
			
		});*/
		//console.log(selectedSet);
		/*console.log(sets);
		sets=[];
		console.log(temp);
		temp=0;
		*/
		});
	 		//console.log(selectedSet);
	 
	 });
	
	  $("#addTicket").click(function(event){
        	alert("This is");
        	var alldata={};
        	alldata.name=$("#name").val();
        	alldata.mobileNo=$('#mobileNo').val();
        	alldata.email=$('#email').val();
        	alldata.pickup=$("#pickup").text();
        	alldata.dropoff=$("#dropoff").text();
        	alldata.busName=$("#busName").val();
        	alldata.busTime=$("#busTime").text();
        	alldata.seatid=selectedSet;
        	alldata.price=$('#totalprice').text	();
        	console.log(alldata);
        	console.log(JSON.stringify(alldata));
        	$.ajax({
        		type: "POST",
        		contentType: "application/json",
        		url: "http://192.168.1.193:8080/bookthat",
        		data: JSON.stringify(alldata),        		
        		success: function() {
        			alert("Saved successfully!");
        		},
        		error: function() {
        			alert("error");
        		}        	})
        		
        		console.log(alldata);
        });
	 

	 
	 
	
	
	 
