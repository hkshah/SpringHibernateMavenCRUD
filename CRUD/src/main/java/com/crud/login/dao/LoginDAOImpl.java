package com.crud.login.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.crud.login.model.LoginModel;

/**
 * @author Hardik Shah
 *
 */
@Repository
public class LoginDAOImpl implements LoginDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean validateLogin(LoginModel loginModel) {
		try {
			Session session = sessionFactory.getCurrentSession();

			Query query = session.createQuery(" from LoginModel where username=? and password=?");
			query.setParameter(0, loginModel.getUsername());
			query.setParameter(1, loginModel.getPassword());
			LoginModel model = (LoginModel) query.uniqueResult();
			if (model != null) {
				return true;
			}
		} catch (Exception exception) {
			LOGGER.warn("Error : " + exception);
		}
		return false;
	}
}