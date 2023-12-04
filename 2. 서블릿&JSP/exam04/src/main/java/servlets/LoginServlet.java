package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet("/member/login")
public class LoginServlet extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doGet()");
        RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/templetes/member/login.jsp");
        rd.forward(req,resp);
    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        //init()메서드 : 최초 한번만 호출됨. 주로 서블릿 객체의 초기 작업(설정 작업 등)을 정의한다
        System.out.println("init()");
        String key1=config.getInitParameter("key1");
        String key2=config.getInitParameter("key2");
        System.out.printf("key1=%s, key2=%s%n", key1,key2);
    }

    @Override
    public void destroy() {
        //destroy() 메서드 : 자원 해제 작업
        System.out.println("destroy()");
    }
}
