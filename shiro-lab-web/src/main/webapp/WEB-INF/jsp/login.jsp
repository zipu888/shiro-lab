<%--
  Created by IntelliJ IDEA.
  User: xiaohao
  Date: 2014/8/14
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>${msg}</h1>
    <div style="width: 600;height: 300;display: block;margin: 50 auto;border: 1px solid red">
        <form method="post" action="login.do">
            <input name="name" type="text"/><br/>
            <input name="password" type="text"/>
            <br/>
            <input type="submit" value="提交">
        </form>

    </div>
</body>
</html>
