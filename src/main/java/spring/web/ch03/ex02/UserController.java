package spring.web.ch03.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.web.ch02.domain.User;

@Controller("ch03.ex02")
@RequestMapping("/ch03/ex02")
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch03/ex02/userIn";
	}
	
	@PostMapping
	public String userOut(HttpServletRequest request, HttpSession session) {
		String userName = request.getParameter("userName");
		int age = Integer.parseInt(request.getParameter("age"));
		
		request.setAttribute("user", new User(userName + "(request)", age));
		session.setAttribute("user", new User(userName + "(session)", age + 10));
		
		return "ch03/ex02/userOut";
	}
}
