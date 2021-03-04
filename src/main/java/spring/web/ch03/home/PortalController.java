package spring.web.ch03.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch03")
public class PortalController {
	@GetMapping("/home")
	public String portal() {
		return "ch03/home/portal";
	}
	
	@GetMapping("/naver")
	public String naver() {
		return "redirect:https://www.naver.com";
	}
	
	@GetMapping("/daum")
	public String daum() {
		return "redirect:https://www.daum.net";
	}
}
