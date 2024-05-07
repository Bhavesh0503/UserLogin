package com.bhavesh.Dao;

import com.bhavesh.Users.User;

;

public interface UserDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
}
