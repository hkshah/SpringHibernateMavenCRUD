package com.crud.login.service;

import com.crud.login.model.LoginModel;

/**
 * @author Hardik Shah
 *
 */
public interface LoginService {

	boolean validateLogin(LoginModel loginModel);
}
