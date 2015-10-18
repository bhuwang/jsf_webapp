/**
 *
 */
package com.bhuwan.jsf.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.bhuwan.jsf.custompojos.Person;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

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
    // example of bean injection using manageproperty annotation
    @ManagedProperty(value = "#{mySessionBean}")
    private MySessionBean mySessionBean;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
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
     * @param totalNo the totalNo to set
     */
    public void setTotalNo(String totalNo) {
        this.totalNo = totalNo;
    }

    public String saveAnimal() {
        System.out.println("Saving Animal..........");
        try {
            for (int i : selectedPeople) {
                System.out.println("Selected people: " + i);
            }
        } catch (Exception e) {
            return "failure";
        }
        return "success";
    }

    // ActionListener for command action can be assigned.
    public void saveAnimal(ActionEvent event) {
        System.out.println("Action event executed........");
    }

    // Registering value cahnged event for animal type field
    public void animalTypeValueChangedEvent(ValueChangeEvent event) {
        System.out.println("Call when the animal type changed - Old value: " + event.getOldValue() + " New Value: " + event.getNewValue());
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
     * @param password the password to set
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
     * @param mailMe the mailMe to set
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
     * @param selectedPeople the selectedPeople to set
     */
    public void setSelectedPeople(int[] selectedPeople) {
        this.selectedPeople = selectedPeople;
    }

    /**
     * @return the mySessionBean
     */
    public MySessionBean getMySessionBean() {
        return mySessionBean;
    }

    /**
     * @param mySessionBean the mySessionBean to set
     */
    public void setMySessionBean(MySessionBean mySessionBean) {
        this.mySessionBean = mySessionBean;
    }

}
