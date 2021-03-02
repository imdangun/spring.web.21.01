package spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch02/home")
public class NumController {
	@GetMapping
	public String numIn() {
		return "ch02/home/numIn";
	}
	
	@PostMapping
	public String numOut(Number num) {
		return "ch02/home/numOut";
	}
}
