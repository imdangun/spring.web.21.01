package spring.web.ch06.ex04.dao;

import java.util.List;

import spring.web.ch06.ex04.domain.User;

public interface UserDao {
	List<User> selectUsers();
	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(int userId);	
}
