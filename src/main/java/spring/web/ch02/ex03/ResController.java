package spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch02/ex03")
public class ResController {
	@GetMapping
	public String res() {
		return "/ch02/ex03/res";
	}
}
