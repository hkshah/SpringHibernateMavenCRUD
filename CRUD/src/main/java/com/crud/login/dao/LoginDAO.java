package com.crud.login.dao;

import com.crud.login.model.LoginModel;

/**
 * @author Hardik Shah
 *
 */
public interface LoginDAO {
	boolean validateLogin(LoginModel loginModel);
}