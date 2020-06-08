<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/5/2020
  Time: 4:26 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <center>
    <title>Login form</title>
</head>
<body>
<form method="post" action="LoginServlet">
    <table
            style="background-color: lightgreen; margin-left: 20px; margin-left: 20px;">

            <td><h3 style="color: red;">Login Page !!!</h3> </td>
            <td></td>
        </tr>
        <tr>
            <td>Username: </td>
            <td><input type="text" name="username" ></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td><input type="text" name="password" ></td>
        </tr>
        <tr>
        <tr><td><input type="submit" value="Login"></td><td><a href="Register.jsp">Registration</a></td></tr>
        </tr>
    </table>
    </table>
</form>
<center>
</body>
</html>
