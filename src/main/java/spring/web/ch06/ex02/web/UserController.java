package spring.web.ch06.ex02.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.web.ch06.ex02.domain.User;
import spring.web.ch06.ex02.service.UserService;

@RestController("ch06.ex02.userController")
@RequestMapping("/ch06/ex02/user")
public class UserController {
	@Autowired private UserService userService;
	
	@GetMapping("/list")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@PostMapping("/add")
	public boolean addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/fix")
	public boolean fixUser(@RequestBody User user) {
		return userService.fixUser(user);
	}
	
	@DeleteMapping("/del/{userId}")
	public boolean delUser(@PathVariable int userId) {
		return userService.delUser(userId);
	}
}
