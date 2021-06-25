 function vm(){
		 
   	var self=this;
       self.bus=ko.observableArray([]);
       $.getJSON("http://192.168.1.193:8080/showAllBus",function(data){
       	 self.bus(data);
       	 var name=data[0].busName;
      
       });
 	  
   }
   ko.applyBindings(new vm());