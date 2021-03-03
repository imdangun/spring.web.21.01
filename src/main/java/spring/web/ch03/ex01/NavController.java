package spring.web.ch03.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch03/ex01")
public class NavController {
	@GetMapping("/forward")
	public String forward() {
		return "forward:target";
	}
	
	@GetMapping("/target")
	public String target() {
		return "ch03/ex01/target";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:target";
	}
}
