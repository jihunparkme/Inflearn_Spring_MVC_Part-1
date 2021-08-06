package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns ="/hello")
public class HelloServlet extends HttpServlet {

    /**
     * 해당 Servlet "/hello" 이 호출되면 service method 호출
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        // localhost:8080/hello?username=park
        String username = request.getParameter("username");
        System.out.println("username = " + username);



        //HTTP Response Header (Content-Type)
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        //HTTP Response Body
        response.getWriter().write("hello " + username);
    }
}
