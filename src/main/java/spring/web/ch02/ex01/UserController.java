package spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping("/21")
	public String user21(Model model) {
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user";
	}
	
	@GetMapping("/22")
	public String user22() {
		return "ch02/ex01/user";
	}
	
	@GetMapping("/31")
	public void user31(User user) {
		user.setName("양승일");
		user.setAge(31);
	}
	
	@GetMapping("/32")
	public void user32(@ModelAttribute("man") User user) {
		user.setName("서준한");
		user.setAge(32);
	}
	
	@GetMapping("/41")
	public User user41() {
		User user = new User("김가람", 41);
		return user;
	}
	
	@GetMapping("42")
	@ModelAttribute("man")
	public User user42() {
		User user = new User("박찬우", 42);
		return user;
	}	
}