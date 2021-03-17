package spring.web.ch06.ex02.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.web.ch06.ex02.dao.map.UserMap;
import spring.web.ch06.ex02.domain.User;

@Repository("ch06.ex04.userDao")
public class UserDaoImpl implements UserDao {
	@Autowired private UserMap userMap;
	
	@Override
	public List<User> selectUsers() {
		return userMap.selectUsers();
	}
	
	@Override
	public int insertUser(User user) {
		return userMap.insertUser(user);
	}
	
	@Override
	public int updateUser(User user) {
		return userMap.updateUser(user);
	}
	
	@Override
	public int deleteUser(int userId) {
		return userMap.deleteUser(userId);
	}
}
