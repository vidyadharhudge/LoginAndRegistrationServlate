<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/5/2020
  Time: 6:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
<head>
    <%
        String msg=(String)request.getAttribute("message");
        if (msg==null){
            msg="";
        }
    %>
    <%=msg%>
    <link rel="stylesheet" href="style.css">
</head>
</br></br>
</br></br>
</br></br>
<body>
    <div class = "form">
        <form action="Register" method="post">
            <input type="text" name="name" placeholder="Name">
            <input type="text" name="email" placeholder="Email">
            <input type="password" name="pass" placeholder="Password">
            <input type="password"name="confirmPass" placeholder="Confirm Password">
            <input type="submit" placeholder="submit" value="Register">
        </form>
        </table>
        </form>
    </div>
</div>
</center>
</body>