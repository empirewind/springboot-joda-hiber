$(document).ready(function(){
	showTableOne();
	showTableTwo();
});

function showTableOne(){
	$.ajax({
		url: "/showTableOne",
		type :"get",
		success:function(data){
			var data= eval('('+data+')');
			var html='';
			html+='<table><tbody>';
			for(var i=0; i<data.length; i++){
				html+='<tr><td>'+data[i][0]+'</td><td>'+data[i][1]+'</td><td>'+data[i][2]+'</td></tr>';
			}
			html+='</tbody><table>';
			$('#tableOne').empty().append(html);
		}
	});
}

function showTableTwo(){
	$.ajax({
		url: "/showTableTwo",
		type :"get",
		success:function(data){
			var data= eval('('+data+')');
			var html='';
			html+='<table><tbody>';
			for(var i=0; i<data.length; i++){
				html+='<tr><td>'+data[i].uId+'</td><td>'+data[i].name+'</td><td>'+data[i].pId+'</td></tr>';
			}
			html+='</tbody><table>';
			$('#tableTwo').empty().append(html);
		}
	});
}