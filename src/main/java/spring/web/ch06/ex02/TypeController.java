package spring.web.ch06.ex02;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/ch06/ex02")
public class TypeController {
	@GetMapping("/main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch06/ex02/type");
		return mv;
	}
	
	@PutMapping("/str")
	public String str(@RequestBody String userName) {
		return userName;
	}
	
	@PutMapping("/int")
	public int int_(@RequestBody String age) {
		return Integer.parseInt(age);
	}
	
	@PutMapping("/date")
	public LocalDate date(@RequestBody String birthday) {
		return LocalDate.parse(birthday);
	}
	
	@PutMapping("/boolean")
	public boolean bool(@RequestBody String isGood) {
		return Boolean.parseBoolean(isGood);
	}
}
