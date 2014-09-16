<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaohao
  Date: 2014/8/15
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>已经成功完成微博认证</h1>
<%
   Map<String,String> map =(HashMap) session.getAttribute("authMap");
   String accessToken =map.get("accessToken");
   String nick =map.get("nick");
%>
access token:<%=accessToken%><br/>
nick:<%=nick%>
</body>
</html>
