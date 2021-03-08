package spring.web.ch05.ex02;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch05.ex02")
@RequestMapping("/ch05/ex02")
public class UserController {
	@GetMapping("/login")
	public String loginIn(@ModelAttribute("user") UserDto userDto,
			@CookieValue(required=false) Cookie rememberId) {
		if(rememberId != null) userDto.setUserId(rememberId.getValue());
		return "ch05/ex02/loginIn";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("user") UserDto userDto,
			Errors err, HttpSession session,
			String rememberId, HttpServletResponse response) {
		String view = "ch05/ex02/loginOut";
		if(err.hasErrors()) view = "ch05/ex02/loginIn";
		
		session.setAttribute("userId", userDto.getUserId());
		
		if(rememberId != null) {
			Cookie cookie = new Cookie("rememberId", userDto.getUserId());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		
		return view;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:login";
	}
	
	@GetMapping("/article")
	public String article() {
		return "ch05/ex02/article";
	}
}
