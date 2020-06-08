<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/5/2020
  Time: 6:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <center>
    <title>Register form</title>

</head>
<body>
<form method="post" action="Register">
    <table
            style="background-color: skyblue; margin-left: 20px; margin-left: 20px;">
        <td><h3 style="color: red;">Registration Page !!!</h3> </td>
        <td></td>
        </tr>
    <tr>
    <td>Name: </td>
    <td><input type="text" name="name" ></td>
    </tr>
        <tr>
            <td>Password: </td>
            <td><input type="text" name="pass" ></td>
        </tr>
        <tr>
            <td>ConfirmPassword: </td>
            <td><input type="text" name="confirmPass" ></td>
        </tr>
    <tr>
        <td>Email ID: </td>
        <td><input type="text" name="email" ></td>
    </tr>
    <tr>
        <td><input type="submit" value="register" /></td>
    </tr>
    </table>
</form>
</center>
</body>
</html>