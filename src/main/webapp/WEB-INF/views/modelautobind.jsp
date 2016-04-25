<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form modelAttribute="accountmodel" method="post">
    用户名：<form:input path="username"/><br/>
    密 码：<form:password path="password"/><br/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
