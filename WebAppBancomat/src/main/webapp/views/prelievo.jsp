<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Bank</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/test.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<pre>
	</pre>
<h1 align="center"><font color="BURLYWOOD">PRELIEVO</font></h1>
</head> 
	<pre>
	</pre>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="http://127.0.0.1:8080/WebAppTemplate/home"><button class="btn">HOME</button></a><style> 
</style>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
	<pre>
	</pre>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="button"  href="http://127.0.0.1:8080/WebAppTemplate/versamento"> <button class="btn">VERSAMENTO</button></a><style>
</style> 
        </li>
              <div class="button">
                <a href="http://127.0.0.1:8080/WebAppTemplate/prelievo"> <button class="btn">PRELIEVO</button></a><style>
</style>    
            </div>
         <div class="button">
                <a href="http://127.0.0.1:8080/WebAppTemplate/listamovimenti"> <button class="btn">LISTA MOVIMENTI</button></a><style>
</style>
        </div>
      </ul>
    </div>
  </div>
</nav>
	<pre>
	
	
	
	</pre>
	<h2 align="center"><font color="BURLYWOOD">EFFETTUA PRELIEVO</font></h2>

<form:form id="form_submit" action="registrazioneMovimenti" method="get" modelAttribute="operazione">
<!-- Nominativo -->
 <input  id="nominativo" path="nominativo"  class="form-control" placeholder="Nominativo" aria-label="Nominativo" aria-describedby="basic-addon1"/>
<!-- Taglio -->
<div class="p-2">
 <select class="form-select" aria-label="Default select example">
 
  <option selected>TAGLIO</option>
  <option value="1">10</option>
  <option value="2">20</option>
  <option value="3">50</option>
</select>
<pre>
	
	
</pre>
<!-- Qantitativo -->
<form name="casellaTesto" method="post">
   <input type="text" name="nomeCasella" style="color:BURLYWOOD" value="                  QUANTITÀ BANCONOTE" size="40" maxlength="20">
</form>
<!-- Range quantità da 1a 100 -->
<span id="valoreNumericoImporto" style="font-weight:bold;color:BURLYWOOD;">100</span>
<input type="range" class="slidecontainer" min="1" max="100" step="1" id="customRange1" >
   <form action="#" name="Digita Importo" onSubmit="return(validate());">
<table cellpadding="2" width="20%" align="center"
  cellspacing="2">
  <script>
var slideCol = document.getElementById("customRange1");
var y = document.getElementById("valoreNumericoImporto");
y.innerHTML = slideCol.value;
slideCol.oninput = function() {
    y.innerHTML = this.value;
}
</script>
</div>
<pre>
</pre>
<!-- Invia Importo -->

<button  type="submit" id="bth-search" onclick="showMessages()"  class="btn btn-primary btn-lg float-right">CONFERMA</button><br>


<script src="static/js/test.js"></script>


<body background="https://wallpaperboat.com/wp-content/uploads/2021/04/15/75170/finance-09.jpg">
<script src="static/js/test.js"></script>
</body>
</html>
	