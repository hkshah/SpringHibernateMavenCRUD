package com.crud.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.user.dao.UserDAO;
import com.crud.user.model.UserModel;

/**
 * @author Hardik Shah
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public boolean registerUser(UserModel userModel) {
		return userDAO.registerUser(userModel);
	}

	@Override
	@Transactional
	public List<UserModel> listAllUsers() {
		return userDAO.listAllUsers();
	}

	@Override
	@Transactional
	public UserModel getUserById(int id) {
		return userDAO.getUserById(id);
	}

	@Override
	@Transactional
	public void updateUser(UserModel userModel) {
		userDAO.updateUser(userModel);
	}

	@Override
	@Transactional
	public void removeUser(int id) {
		userDAO.removeUser(id);
	}
}