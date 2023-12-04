package filters;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import servlets.HelloServlet;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request the {@link HttpServletRequest} to be wrapped.
     * @throws IllegalArgumentException if the request is null
     */
    public CommonRequestWrapper(HttpServletRequest request) {//생성자
        super(request);

        //요청시 공통 처리 부분
       request.setAttribute("siteConfig","사이트설정...");
    }

    @Override
    public String getParameter(String name) { //getParameter() 메서드 재정의 : 쿼리스트링으로 입력한 값-> 대문자로 변경해줌
        String value = super.getParameter(name);

        value = value == null? value : value.toUpperCase();
        return value;
    }
}
