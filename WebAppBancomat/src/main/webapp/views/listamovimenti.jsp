<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h1 align="center"><font color="BURLYWOOD">LISTA MOVIMENTI</font></h1>
</head> 
	<pre>
	</pre>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="http://127.0.0.1:8080/WebAppTemplate/home.html"><button class="btn">HOME</button></a><style> 
</style></body>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
	<pre>
	</pre>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="button"  <a href="http://127.0.0.1:8080/WebAppTemplate/versamento"> <button class="btn">VERSAMENTO</button></a><style>
</style> 
        </li>
              <div class="button">
                <a href="http://127.0.0.1:8080/WebAppTemplate/prelievo"> <button class="btn">PRELIEVO</button></a><style>
</style>    
            </div>
         <div class="button">
                <a href="http://127.0.0.1:8080/WebAppTemplate/listamovimenti"> <button class="btn">LISTA MOVIMENTI</button></a><style>
</style>
        </div>s
      </ul>
    </div>
  </div>
</nav>

	<pre>
	
	
	
	</pre>
	<h2 align="center"><font color="BURLYWOOD">TRANSAZIONI</font></h2>
<span class="d-block p-2 bg-dark text-white" id="saldo" >Saldo :</span>

<script  type="text/javascript">
var movimento.saldo = document.getElementById("saldo");
movimento.saldo.innerHTML = slideCol.value;
array.forEach(SingletonMovimentoBancomat.getInstance().getListaMovimenti().length => {
	if(request.getMovimentazione().setOperazione(TipologiaMovimento.VERSAMENTO)){
		movimento.saldo=movimento.taglio*movimento.quantita;
	}else {
		((movimento.taglio*movimento.quantita)=>request.getMovimentazione().setOperazione(TipologiaMovimento.PRELIEVO)){
			if(movimento.saldo<request.getMovimentazione().setOperazione(TipologiaMovimento.PRELIEVO)){
				document.write("ERROR!!!")
			}else{
				(movimento.saldo-request.getMovimentazione().setOperazione(TipologiaMovimento.PRELIEVO);
			}
		}
	}
});
</script>

<table class="table table-dark table-striped">
 
    <tr>
    <th scope="col">ID</th>
      <th scope="col">Data-Ora</th>
      <th scope="col">Operazione</th>
      <th scope="col">Nominativo</th>
       <th scope="col">Taglio</th>
      <th scope="col">Quantità</th>
     <th scope="col">Saldo</th>
      <th scope="col">Elimina</th>
    </tr>
  
 <c:set var="numMov" scope="session" value="0"/>
  <c:forEach var="movimento" items="${moveWay.listaMovimentiRestituiti}">
   <c:set var="numMov" scope="session" value="${numMov+1}"/>
    <tr>
     <td> <c:out value="${numMov}"/></td>
     <td> <c:out value="${movimento.id}"/></td>
     <td> <c:out value="${movimento.dataEora}"/></td>
     <td> <c:out value="${movimento.operazione}"/></td>
     <td> <c:out value="${movimento.nominativo}"/></td>
     <td> <c:out value="${movimento.taglio}"/></td>
     <td> <c:out value="${movimento.quantita}"/></td>
       <td> conto: <c:out value="${movimento.taglio*movimento.quantita}"/></td>
      <td><a href="elimina-movimento?id=<c:out value="${movimento.id}"/>"> <input class="myclass" type="button"  value="ELIMINA"/></a></td>
    </tr>

<body background="https://wallpaperboat.com/wp-content/uploads/2021/04/15/75170/finance-09.jpg">
<script src="static/js/test.js"></script>
</body>
</html>