package spring.web.ch06.ex01;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.web.ch06.domain.User;

@RestController
@RequestMapping("/ch06/ex01")
public class AjaxController {
	@GetMapping("/main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch06/ex01/ajax");
		return mv;
	}
	
	@GetMapping("/get")
	public User get() {
		return new User(100, "양승일", LocalDate.of(2025, 7, 12));
	}
	
	@PostMapping("/post")
	public User post(@RequestBody User user) {
		return user;
	}
	
	@PutMapping("/put")
	public User put(@RequestBody User user) {
		return user;
	}
	
	@PatchMapping("/patch")
	public User patch(@RequestBody User user) {
		return user;
	}
	
	@DeleteMapping("/delete")
	public User delete(@RequestBody User user) {
		return user;
	}
}
