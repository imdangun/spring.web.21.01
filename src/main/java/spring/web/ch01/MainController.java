package spring.web.ch01;

import java.time.ZonedDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String main(Model model) {		
		model.addAttribute("now", ZonedDateTime.now());
		return "ch01/main";
	}
}
