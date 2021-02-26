package spring.web.ch02.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import spring.web.ch02.domain.User;

@Controller("ch02.ex02")
public class UserController {
	@GetMapping("/ch02/ex02/userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	
	@GetMapping("/ch02/ex02/userOut")
	public String userOut(User user, Model model, String agree) {		
		model.addAttribute("agree", agree);
		return "ch02/ex02/userOut";
	}
}
