package spring.web.ch06.ex03;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.web.ch06.domain.User;

@RestController
@RequestMapping("/ch06/ex03")
public class ParamController {
	@GetMapping("/main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch06/ex03/param");
		return mv;
	}
	
	@GetMapping("/1")
	public void param1(int userId, String userName, 
			@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate birthday) {
		System.out.println((userId + 10) + "," + userName + "," + birthday.minusDays(1));
	}
	
	@PostMapping("/2")
	public void param2(@RequestParam int userId, @RequestParam String userName,
			@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate birthday) {
		System.out.println((userId + 10) + "," + userName + "," + birthday.minusDays(1));
	}
	
	/* 실패
	@DeleteMapping("/3")
	public void param3(@RequestBody int userId, @RequestBody String userName,
			@RequestBody @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate birthday) {
		System.out.println((userId + 10) + "," + userName + "," + birthday.minusDays(1));
	}
	*/
	
	@DeleteMapping("/3")
	public void param3(@RequestBody User user) {
		System.out.println((user.getUserId() + 10) + "," 
							+ user.getUserName() + "," 
							+ user.getBirthday().minusDays(1));
	}
}
/*
parameter  @RequestParam    GET, POST
JSON       @RequestBody     POST, PUT, PATCH, DELETE
*/
