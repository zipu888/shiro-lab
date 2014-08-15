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
    <script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
</head>
<body>
<h1>${msg}</h1>
    <div style="width: 600;height: 300;display: block;margin: 50 auto;border: 1px solid red">
        <form method="post" action="login.do">
            用户名:<input name="name" type="text"/><br/>
            密码：<input name="password" type="text"/><br/>
            验证码:<input type="text"/><img id="codeimg" src="1236.yazhengma" width="200" height="100"/> <a href="javascript:void(0);" id="refreshCode">点击刷新</a> <br/>
            <input type="submit" value="提交">
        </form>

    </div>
</body>
<script>
         $(function(){
             $("#refreshCode").click( function(){
                 var t =Math.random();
                 $("#codeimg").attr("src",t+".yazhengma");
             });
         });


</script>
</html>
