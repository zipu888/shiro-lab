<%--
  Created by IntelliJ IDEA.
  User: xiaohao
  Date: 2014/8/15
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<H1>shiro jsp tag </H1>

来宾账户能看到
<shiro:guest>
<h4>TAG<h4/>&nbsp;<input value="哈哈" type="button"/>
</shiro:guest>
<hr/>
<br/>
user能看到
<shiro:user>
<h4>TAG<h4/>&nbsp;欢迎<shiro:principal></shiro:principal>
</shiro:user>
<hr/>
<br/>
authenticated能看见
<shiro:authenticated>
    <h4>TAG<h4/>&nbsp;已经认真&nbsp;&nbsp;&nbsp;<shiro:principal></shiro:principal>
</shiro:authenticated>
<hr/>
<br/>
未验证
<shiro:notAuthenticated>
        <h4>TAG<h4/>&nbsp;未验证奥
</shiro:notAuthenticated>
<hr/>
<br/>
拥有admin权限能看见
<shiro:hasRole name="admin">
            <h4>TAG<h4/>&nbsp;用户[<shiro:principal/>]拥有角色 admin<br/>
</shiro:hasRole>
<hr/>
<br/>
拥有user或者admin任意角色就能看见
<shiro:hasAnyRoles name="admin,user">
                <h4>TAG<h4/>&nbsp;用户[<shiro:principal/>]拥有角色 admin 或 user<br/>
</shiro:hasAnyRoles>
<hr/>
<br/>
如果没有角色将显示
<shiro:lacksRole name="abc">
                    <h4>TAG<h4/>&nbsp;用户[<shiro:principal/>]没有角色 abc<br/>
</shiro:lacksRole>
<hr/>
<br/>
如果有这个权限  user:create
<shiro:hasPermission name="user:create">
                        <h4>TAG<h4/>&nbsp;用户[<shiro:principal/>]拥有权限 user:create<br/>
</shiro:hasPermission>
                            <hr/>
                            <br/>
                            如果没有org:create权限
                            <shiro:lacksPermission name="org:create">
                            <h4>TAG<h4/>&nbsp; 用户[<shiro:principal/>]没有权限 org:create<br/>
                            </shiro:lacksPermission>
                                <hr/>
                                <br/>
</body>
</html>
