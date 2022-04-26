<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css"/>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Demo.Neotech.SRL</a>
        </div>
    </div>
</nav>
<div class="container" style="min-height: 200px">
    <div class="starter-template">
        <h1>Ajax example with SpringBootServer</h1>
          <input type="text" id="txt-nominativo" class="form-control"/>
          <button id="btn-invio" class="btn btn-primary btn-lg">Add Movimento</button>
    </div>
</div>

<div class="container">
<h1>Response</h1>
<table id="listaMovId" class="table table-dark table-striped">
<tr>
   <th>campo1</th><th>campo2</th><th>campo3</th><th>campo4</th>
</tr>
</table>
<div id="text-feedback"></div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>


<script type="text/javascript" src="static/js/bancomat_ajax.js"></script>
<script type="text/javascript" src="static/js/main.js"></script>


</body>
</html>