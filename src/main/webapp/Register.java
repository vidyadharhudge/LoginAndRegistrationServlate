package webapp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

@WebServlet("/Register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String confirmPass = request.getParameter("confirmPass");

        Pattern pattern1 = null;
        Pattern pattern2 = null;
        Pattern pattern3 = null;
        pattern1 = pattern1.compile("[A-Z][A-Z a-z]{3,}");
        pattern2 = pattern2.compile("[0-9]{4,}");
        pattern3= pattern3.compile("^[a-zA-Z0-9]{3,}+[@][a-zA-Z0-9]{3,}+[.][a-zA-Z]{3,}$");
        if ((pattern1.matches(valueOf(pattern1), name)) && (pattern2.matches(valueOf(pattern2), pass)) && pass.equals(confirmPass) && (pattern3.matches(valueOf(pattern3), email))) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/test", "root", "1234");
                PreparedStatement ps = con.prepareStatement
                        ("insert into register (username,password,email)values(\'" + name + "\',\'" + pass + "\',\'" + email + "\')");
                int i = ps.executeUpdate();
                if (i > 0) {
                    RequestDispatcher rd=getServletContext().getRequestDispatcher("/Register.jsp");
                    String message = "<h4  style=\"color:red\" align=\"center\">Registration Is Successful</h4>";
                    request.setAttribute("message",message);
                    rd.include(request,response);
                }
            } catch (Exception se) {
                se.printStackTrace();
            }
        } else {
            RequestDispatcher rd=getServletContext().getRequestDispatcher("/Register.jsp");
            String message = "<h4  style=\"color:red\" align=\"center\">Registration Is Unsuccessful</h4>";
            request.setAttribute("message",message);
            rd.include(request,response);
        }
    }
}
