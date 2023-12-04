package filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class CommonFilter implements Filter {//필요한 필터 설정들 전체 정리
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(new CommonRequestWrapper((HttpServletRequest) request), response);
    }
}
