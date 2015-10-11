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

}
