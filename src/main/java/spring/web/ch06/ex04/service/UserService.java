package spring.web.ch06.ex04.service;

import java.util.List;

import spring.web.ch06.ex04.domain.User;

public interface UserService {
	List<User> getUsers();
	boolean addUser(User user);
	boolean fixUser(User user);
	boolean delUser(int userId);
}
