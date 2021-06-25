$(document).ready(function() {
			var selectedSet = [];
			var seatprice=100;
			var temp=0;
			var ans=0;
			var t=0;
			
			var mainprice=0;
        $( "td" ).click(function() {
            $( this ).toggleClass( "selected" );
//           $("td.selected").each(function(){
//              selectedSet.push($(this).text());
//                console.log(selectedSet);
//                temp=temp+seatprice;
//                if(temp>0){
//           		ans=(temp*18)/100;
//           		temp=ans+temp;
//           	}
//                console.log(ans);
//             	console.log(temp);
//            });
            if($(this).hasClass("selected")){
            	temp=temp+seatprice;
            	ans=temp;
            	selectedSet.push($(this).text());
          	$("#mainprice").text(temp);
          	
           	if(ans>0){
             		ans=(temp*18)/100;
             		ans=ans+temp;
             		t=ans;
             		$("#totalprice").text(ans);
           	}
            }else{
            	selectedSet.pop($(this).text());
            	if(ans>0){
            		ans=ans-118;
            		$("#totalprice").text(ans);
            		
            	}
            	temp=temp-seatprice;
//            	$("#totalprice").text(ans);
//            	temp=temp-seatprice;
//            	ans=temp;
////            	$("#mainprice").text(temp);
//            	ans=temp;
//            	if(ans>0){
//             		ans=(temp*18)/100;
//             		ans=ans-temp;
//            	}
            }
//            if(temp>0){
//      		ans=(temp*18)/100;
//      		temp=ans+temp;
//     	}
            $("#mainprice").text(temp);
            var name=$(this).text();
            console.log(name);
        });
        $("td.selected").each(function(){
            selectedSet.push($(this).text());
            alert(selectedSet);
        });
        console.log(temp);
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
        	
        /*	alldata.seatlen=selectedSet.length+1;*/
        	console.log(alldata);
        	
        	console.log(JSON.stringify(alldata));
        	$.ajax({
        		type: "POST",
        		contentType: "application/json",
        		url: "http://192.168.1.193:8080/bookthat",
        		data: JSON.stringify(alldata),        		success: function() {
        			console.log(alldata);
        			alert("Saved successfully!");
        		},
        		error: function() {
        			alert("error");
        		}        	})
        });
//        selectcallfunction();
//        pricetotal();//
//        $("#countprice").click(function(){
//        	alert("This");
//        	console.log("THis is ");
//        	$("td.selected").each(function(){
//                 selectedSet.push($(this).text());
//                 console.log(selectedSet);
//             });
//        	$("td.selected").each(function() {
//      			temp=temp+seatprice;
//      			mainprice=temp;
//      		});
//        	if(temp>0){
//        		ans=(temp*18)/100;
//        		temp=ans+temp;
//        	}
//        	$("#totalprice").text(temp);
//        	$("#mainprice").text(mainprice);
//         	console.log(temp);
//         	console.log(ans);
//         	console.log(temp);
//        });
     console.log(selectedSet);
     $('td').click( function() {
    $(this).toggleClass("red-cell");
  } );
     
});