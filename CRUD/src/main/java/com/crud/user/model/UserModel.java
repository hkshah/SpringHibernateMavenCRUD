package com.crud.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Hardik Shah
 *
 */
@Entity
@Table(name = "User")
public class UserModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String username;
	@Transient
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @author Hardik Shah
	 *
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	@Transient
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