/**
 *
 */
package com.bhuwan.jsf.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author bhuwan
 *
 */
@ManagedBean
@RequestScoped
public class AnimalBean {

	private String type;
	private String totalNo;
	private String password;
	private Boolean mailMe;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the totalNo
	 */
	public String getTotalNo() {
		return totalNo;
	}

	/**
	 * @param totalNo
	 *            the totalNo to set
	 */
	public void setTotalNo(String totalNo) {
		this.totalNo = totalNo;
	}

	public String saveAnimal() {
		System.out.println("Saving Animal..........");
		return null;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the mailMe
	 */
	public Boolean getMailMe() {
		return mailMe;
	}

	/**
	 * @param mailMe
	 *            the mailMe to set
	 */
	public void setMailMe(Boolean mailMe) {
		this.mailMe = mailMe;
	}

}
