<%--
  Created by IntelliJ IDEA.
  User: mjm37_000
  Date: 2015/9/18 0018
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
money:<br/>
<spring:eval expression="contentModel.money"></spring:eval><br/>
date:<br/>
<spring:eval expression="contentModel.date"></spring:eval><br/>
</body>
</html>
