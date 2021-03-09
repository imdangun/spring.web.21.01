package spring.web.ch06.ex04.dao.map;

import java.util.List;

import spring.web.ch06.ex04.domain.User;

public interface UserMap {
	List<User> selectUsers();
	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(int userId);
}
