package webapp;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ValidationFilter")
public class ValidationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside filter");
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        String path=request.getRequestURI();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if (path.contains("LoginServlet")){
            if (username!=null && username.trim().length()<6 && password!=null && password.trim().length()<8){
                RequestDispatcher rd= request.getServletContext().getRequestDispatcher("/Login.jsp");
                String message = "<h4  style=\"color:red\" align=\"center\">Either Username Or Password Is Wrong</h4>";
                request.setAttribute("message",message);
                rd.include(request,response);
            }
        }
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {
    }
}
