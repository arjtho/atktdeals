<%--
  Created by IntelliJ IDEA.
  User: Mahadev Mane
  Date: 9/23/13
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="AtKtDeals">
    <meta name="author" content="Arjun Thorat">
    <link rel="shortcut icon" href="resources/assets/ico/favicon.png">

    <title> <tiles:insertAttribute name="title" ignore="true"/>  </title>

    <!-- Bootstrap core CSS -->
    <link href="resources/dist/bootstrap/css/bootstrap.css" rel="stylesheet">

    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="resources/font-awesome/css/font-awesome.min.css">


    <!-- Less standard css -->
    <link rel="stylesheet/less" type="text/css" href="resources/dist/custom/less/app.less"/>

    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/dist/jquery/js/jquery-2.0.3.js"></script>
    <script src="resources/dist/bootstrap/js/bootstrap.min.js"></script>

    <!-- Less standard css -->
    <script src="resources/dist/less/less-1.4.1.min.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="resources/assets/js/html5shiv.js"></script>
    <script src="resources/assets/js/respond.min.js"></script>
    <![endif]-->

    <script src="resources/dist/custom/js/ajax/atkt-ajax.js"></script>
    <script src="resources/dist/custom/js/common/vanilla-model.js"></script>
    <script src="resources/dist/custom/js/app-nav-toolbar.js"></script>
    <script src="resources/dist/custom/js/login.js"></script>
    <script>
        $( document ).ready(function() {
            AppNavToolbarSN.init();
        });
    </script>
</head>

<body>

<%--Application Body Contents--%>
<tiles:insertAttribute name="header" />

<%--Application Body Contents--%>
<tiles:insertAttribute name="body"/>


<tiles:insertAttribute name="vanilla-model"/>

<%--Application Footer Contents--%>
<tiles:insertAttribute name="footer" />

</body>
</html>
