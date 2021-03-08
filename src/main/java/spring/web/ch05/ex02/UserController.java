package spring.web.ch05.ex02;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch05.ex02")
@RequestMapping("/ch05/ex02")
public class UserController {
	@GetMapping("/login")
	public String loginIn(@ModelAttribute("user") UserDto userDto) {
		return "ch05/ex02/loginIn";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("user") UserDto userDto,
			Errors err, HttpSession session) {
		String view = "ch05/ex02/loginOut";
		if(err.hasErrors()) view = "ch05/ex02/loginIn";
		
		session.setAttribute("userId", userDto.getUserId());
		
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
