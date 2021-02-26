package spring.web.ch02.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import spring.web.ch02.domain.User;

@Controller
public class UserController2 {
	@GetMapping("/ch02/ex02/user")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	
	@PostMapping("/ch02/ex02/user")
	public String userOut(User user, Model model, String agree) {
		System.out.println(user.getName());
		model.addAttribute("agree", agree);
		return "ch02/ex02/userOut";
	}
}
