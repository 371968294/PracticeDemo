<%--
  Created by IntelliJ IDEA.
  User: mjm37_000
  Date: 2015/9/16 0016
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/databind/parambind?urlParam=AAA" method="post" enctype="multipart/form-data">
    <input type="text" name="formParam"/><br/>
    <input type="file" name="formFile"/><br/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
