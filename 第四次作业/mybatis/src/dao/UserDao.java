package dao;

import java.util.List;

import bean.User;

public interface UserDao {
	public User findUserById(String id);

	public List<User> findUserByName(String name);
	
	public void insertUser(User user);
}
