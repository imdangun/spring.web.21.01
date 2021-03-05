package spring.web.ch05.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.web.ch05.ex01.domain.User;

@Controller("ch05.ex01")
@RequestMapping("/ch05/ex01")
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch05/ex01/userIn";
	}
	
	@PostMapping
	public String userOut(User user) {
		return "ch05/ex01/userOut";
	}
}
