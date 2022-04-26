$(document).ready(function () {
//operazione versamento
   $('#btn-versamento').click(function (event) {   

    var requestData = {
	    'movimentoRequest':{
		  
		  'operazione':"VERSAMENTO",
		  'taglio':$( "#taglio option:selected" ).text(),
		  'quantita':$('#rangeValore').val(),
		  'nominativo':$('#txt-nominativo').val()
	    }
     };
    

    var response=fire_ajax_post("api/movimento_add", requestData);

 });
});

function deleteAereo(itemId){

var response=fire_ajax_pathvar("api/delete/"+itemId);
var response_object=response.responseJSON;

 var response_text=response.responseText;
$('#text-feedback').text(response_text);
    

$("#listaMovId tr.mia").remove();

$.each(response_object.movimentiSearchResponse, function(i, item) {
    var riga="<tr class='mia'>";
	     riga+="<td>"+item.id+"</td>";
	     riga+="<td>"+item.dataEora+"</td>";
	     riga+="<td>"+item.operazione+"</td>";
         riga+="<td>"+item.nominativo+"</td>";
	     riga+="<td>"+item.taglio+"</td>";
	     riga+="<td>"+item.quantita+"</td>";
         riga+="<td>"+item.taglio*item.quantita+"</td>";
	     riga+="<td><button onClick='elimina-movimento(\""+item.id+"\")' type='button' class='btn btn-danger'>delete</button></td>";
   riga+="</tr>";
   $("#listaMovId").append(riga);
    });	
}




//operazione prelievo
$(document).ready(function () {
	
   $('#btn-prelievo').click(function (event) {   

     var importo=0;
    if($( "#importo option:selected").text()=="AltroImporto") importo=$("#altro_importo_num").val();
    else importo=$( "#importo option:selected").text();
    var requestData = {
	    'movimentazione':{
		  'quantita':1,
          'altroImporto':importo,
		  'operazione':"PRELIEVO",
		  'taglio':$( "#importo option:selected").val(),
		  'nominativo':$('#txt-nominativo1').val()
	    }
     };

    var response=fire_ajax_post("api/movimento_add", requestData);

 });

});

function deleteAereo(itemId){

var response=fire_ajax_pathvar("api/delete/"+itemId);
var response_object=response.responseJSON;

 var response_text=response.responseText;
$('#text-feedback').text(response_text);
    

$("#listaMovId tr.mia").remove();


$.each(response_object.movimentiSearchResponse, function(i, item) {
    var riga="<tr class='mia'>";
	     riga+="<td>"+item.id+"</td>";
	     riga+="<td>"+item.dataEora+"</td>";
	     riga+="<td>"+item.operazione+"</td>";
         riga+="<td>"+item.nominativo+"</td>";
	     riga+="<td>"+item.taglio+"</td>";
         riga+="<td>"+item.altroImporto+"</td>";
	     riga+="<td>"+item.taglio-item.saldo+"</td>";
	     riga+="<td><button onClick='elimina-movimento(\""+item.id+"\")' type='button' class='btn btn-danger'>delete</button></td>";
   riga+="</tr>";
   $("#listaMovId").append(riga);
    });	
}
