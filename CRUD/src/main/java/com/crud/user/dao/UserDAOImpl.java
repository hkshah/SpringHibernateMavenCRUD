package com.crud.user.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.crud.login.model.LoginModel;
import com.crud.user.model.UserModel;

/**
 * @author Hardik Shah
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean registerUser(UserModel userModel) {
		Session session = sessionFactory.getCurrentSession();
		LoginModel loginModel = new LoginModel();
		loginModel.setUsername(userModel.getUsername());
		loginModel.setPassword(userModel.getPassword());
		session.save(userModel);
		session.save(loginModel);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserModel> listAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from UserModel").list();
	}

	@Override
	public UserModel getUserById(int id) {
		return (UserModel) sessionFactory.getCurrentSession().get(UserModel.class, new Integer(id));
	}

	@Override
	public void updateUser(UserModel userModel) {
		sessionFactory.getCurrentSession().saveOrUpdate(userModel);
	}

	@Override
	public void removeUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		UserModel userModel = (UserModel) session.load(UserModel.class, new Integer(id));
		LoginModel loginModel = (LoginModel) session.load(LoginModel.class, new Integer(id));
		if ((null != userModel) && (null != loginModel)) {
			session.delete(userModel);
			session.delete(loginModel);
		}
	}
}