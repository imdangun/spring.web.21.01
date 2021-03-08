package spring.web.ch05.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		boolean isLogined = false;
		Object userId = request.getSession().getAttribute("userId");
		
		if(userId != null) isLogined = true;
		else response.sendRedirect(request.getContextPath() + "/ch05/ex02/login");
		
		return isLogined;
	}

}
