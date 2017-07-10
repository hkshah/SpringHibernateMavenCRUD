package com.crud.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hardik Shah
 *
 */
@Entity
@Table(name = "Login")
public class LoginModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;

	/**
	 * @author Hardik Shah
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}