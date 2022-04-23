
<%@page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <title>Spring Boot ajax example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css"/>
</head>
<c:url var="home" value="/WebAppTemplate" scope="request" />
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Demo.Neotech.SRL</a>
        </div>
    </div>
</nav>

<div class="container" style="min-height: 500px">
    <div class="starter-template">
        <h1>Spring Boot AJAX Example</h1>

        <form class="form-horizontal" id="search-form">
            <div class="form-group form-group-lg">
                <label class="col-sm-2 control-label">Aereo</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="aereo"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" id="bth-search"
                            class="btn btn-primary btn-lg">Search
                    </button>
                </div>
            </div>
        </form>
       <div id="feedback"></div>
    </div>

</div>

<div class="container">
    <footer>
        <p>Demo 01</p>
    </footer>
</div>

<!--  -script type="text/javascript" src="webjars/jquery/2.2.4/jquery.min.js"></script-->
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="static/js/main.js"></script>

</body>
</html>