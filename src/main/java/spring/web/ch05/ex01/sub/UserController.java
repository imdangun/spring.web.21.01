package spring.web.ch05.ex01.sub;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import spring.web.ch05.ex01.sub.domain.User;

@Controller("ch05.ex01.sub")
@RequestMapping("/ch05/ex01/sub")
public class UserController {
	@GetMapping
	public String userIn(User user) {
		return "ch05/ex01/sub/userIn";
	}
	
	@PostMapping
	public String userOut(@Valid User user, Errors err) {
		String view = "ch05/ex01/sub/userOut";
		if(err.hasErrors()) view = "ch05/ex01/sub/userIn";
		
		return view;
	}
}
