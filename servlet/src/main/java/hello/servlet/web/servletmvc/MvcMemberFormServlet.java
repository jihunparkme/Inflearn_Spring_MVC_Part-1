package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String viewPath = "/WEB-INF/views/new-form.jsp"; // WEB-INF 경로 안에 있는 JSP 는 외부에서 호출 불가 (컨트롤러에서만 호출)
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); // Controller -> View 이동 시 사용
        dispatcher.forward(request, response); // 다른 Servlet or JSP 로 이동할 수 있는 기능
        /**
         * Redirect : Client에 응답이 갔다가, Client가 다시 Redirect 경로로 요청
         * Forward : 서버 내부에서 일어나는 호출
         */
    }
}
