package spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.web.ch02.domain.User;

@Controller
@RequestMapping("/ch02/ex01")
public class UserController {
	@GetMapping("/11")
	public ModelAndView user11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11));
		mv.setViewName("ch02/ex01/user");
		
		return mv;
	}
}
