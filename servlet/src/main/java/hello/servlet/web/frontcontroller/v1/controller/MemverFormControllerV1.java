package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemverFormControllerV1 implements ControllerV1 {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String viewPath = "/WEB-INF/views/new-form.jsp"; // WEB-INF 경로 안에 있는 JSP 는 외부에서 호출 불가 (컨트롤러에서만 호출)
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); // Controller -> View 이동 시 사용
        dispatcher.forward(request, response); // 다른 Servlet or JSP 로 이동할 수 있는 기능
    }
}
