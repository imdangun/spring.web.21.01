package spring.web.ch06.ex02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.web.ch06.ex02.dao.UserDao;
import spring.web.ch06.ex02.domain.User;

@Service("ch06.ex04.userService")
public class UserServiceImpl implements UserService {
	@Autowired private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.selectUsers();		
	}
	
	@Override
	public boolean addUser(User user) {
		return userDao.insertUser(user) > 0;
	}

	@Override
	public boolean fixUser(User user) {
		return userDao.updateUser(user) > 0;
	}

	@Override
	public boolean delUser(int userId) {
		return userDao.deleteUser(userId) > 0;
	}
}
