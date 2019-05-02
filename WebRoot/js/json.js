$(function(){
	$.getJSON('state_city.json',function(data){
		$.each(data,function(state,city){
			$("#state1").append("<option value='"+state+"' >"+state+"</option>");
			
		})
	});
});


$(function() {
	$("#state1").change(function() {
		var sid = $("#state1").val();
		$.getJSON('state_city.json',function(data){
			for(var s in data){
				if(s==sid){
					var arr = ""+data[s]+"";
					var city = arr.split(',');
					$("#city1").empty();
					 for(var i in city){
						 $("#city1").append("<option value='"+city[i]+"' >"+city[i]+"</option>");
				        }
				}
			}
		});
	});
});

$(function(){
	$.getJSON('state_city.json',function(data){
		$.each(data,function(state,city){
			$("#state2").append("<option value='"+state+"' >"+state+"</option>");
			
		})
	});
});


$(function() {
	$("#state2").change(function() {
		var sid = $("#state2").val();
		$.getJSON('state_city.json',function(data){
			for(var s in data){
				if(s==sid){
					var arr = ""+data[s]+"";
					var city = arr.split(',');
					$("#city2").empty();
					 for(var i in city){
						 $("#city2").append("<option value='"+city[i]+"' >"+city[i]+"</option>");
				        }
					//
				}
			}
		});
	});
});