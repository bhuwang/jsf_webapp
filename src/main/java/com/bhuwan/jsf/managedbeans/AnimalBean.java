/**
 *
 */
package com.bhuwan.jsf.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.bhuwan.jsf.custompojos.Person;

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
	private int[] selectedPeople;

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
		for (int i : selectedPeople) {
			System.out.println("Selected people: " + i);
		}
		return null;
	}

	public List<Person> getAllperson() {
		List<Person> persons = new ArrayList<Person>();
		Person p = new Person();
		p.setId(1);
		p.setName("Bhuwan");
		persons.add(p);
		persons.add(new Person(2, "Suman"));
		persons.add(new Person(3, "Krishna"));
		persons.add(new Person(4, "Bimal"));
		return persons;
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

	/**
	 * @return the selectedPeople
	 */
	public int[] getSelectedPeople() {
		return selectedPeople;
	}

	/**
	 * @param selectedPeople
	 *            the selectedPeople to set
	 */
	public void setSelectedPeople(int[] selectedPeople) {
		this.selectedPeople = selectedPeople;
	}

}
