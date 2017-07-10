package com.crud.user.dao;

import java.util.List;

import com.crud.user.model.UserModel;

/**
 * @author Hardik Shah
 *
 */
public interface UserDAO {
	boolean registerUser(UserModel userModel);

	List<UserModel> listAllUsers();

	UserModel getUserById(int id);

	void updateUser(UserModel userModel);

	void removeUser(int id);
}