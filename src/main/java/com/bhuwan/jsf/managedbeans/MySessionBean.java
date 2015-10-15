/**
 * 
 */
package com.bhuwan.jsf.managedbeans;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author bhuwan
 *
 */
@ManagedBean
@SessionScoped
public class MySessionBean {
	private int number = new Random().nextInt();

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}
