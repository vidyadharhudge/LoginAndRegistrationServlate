<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/5/2020
  Time: 4:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" href="style.css">
</head>
</br></br>
</br></br>
</br></br>
<body>
<title> Login form </title>
<%
    String msg=(String)request.getAttribute("message");
    if (msg==null){
        msg="";
    }
%>
<%=msg%>
<div class = "form">
    <div action="LoginServlet">
        <form action="LoginServlet" method="post">
            <input type="text" name="username" placeholder="UserName">
            <input type="password" name="password" placeholder="Password">
            <input type="submit" name="submit" value="Login">
            <a href="Register.jsp">Registration</a>
        </form>
    </div>
</div>
</body>
</html>
