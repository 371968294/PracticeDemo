<%--
  Created by IntelliJ IDEA.
  User: mjm37_000
  Date: 2015/9/17 0017
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form modelAttribute="contentModel" method="post">
    <form:errors path="*"/>

    name：<form:input path="name"/><br/>
    <form:errors path="name"></form:errors><br/>

    age：<form:input path="age"/><br/>
    <form:errors path="age"></form:errors><br/>

    email：<form:input path="email"/><br/>
    <form:errors path="email"></form:errors><br/>

    <input type="submit" value="Submit"/>

</form:form>
</body>
</html>
