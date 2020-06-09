package webapp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;
import static java.lang.String.valueOf;

@WebServlet ("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String un = request.getParameter("username");
        String pw = request.getParameter("password");
        Pattern pattern1=null;
        Pattern pattern2=null;
        pattern1=pattern1.compile("[A-Z][A-Z a-z]{3,}");
        pattern2=pattern2.compile("[0-9]{4,}");
        if ((pattern1.matches(valueOf(pattern1),un))&&(pattern2.matches(valueOf(pattern2),pw))){
            request.getRequestDispatcher("Welcome.jsp").forward(request,response);
        }
        else {
            RequestDispatcher rd=getServletContext().getRequestDispatcher("/Login.jsp");
            String message = "<h4  style=\"color:red\" align=\"center\">Either Username Or Password Is Wrong</h4>";
            request.setAttribute("message",message);
            rd.include(request,response);
        }
    }
}
