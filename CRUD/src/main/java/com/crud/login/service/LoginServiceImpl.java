package com.crud.login.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.login.dao.LoginDAO;
import com.crud.login.model.LoginModel;

/**
 * @author Hardik Shah
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDAO;

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	@Transactional
	public boolean validateLogin(LoginModel loginModel) {
		return loginDAO.validateLogin(loginModel);
	}
}