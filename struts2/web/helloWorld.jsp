<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/28/028
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
    <h1><s:property value="massage"/></h1>
  </div>
  <div>
    <form action="helloword.action" method="post">
      请输入您的姓名:<input type="text" name="name">
      <input type="submit" value="提交">
    </form>
  </div>
  </body>
</html>
