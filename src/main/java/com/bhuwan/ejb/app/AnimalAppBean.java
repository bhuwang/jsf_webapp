/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhuwan.ejb.app;

import com.bhuwan.ejb.beans.AnimalSessionBeanLocal;
import com.bhuwan.jsf.entities.Animal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author bhuwan
 */
@ViewScoped
@ManagedBean
public class AnimalAppBean {

    private List<Animal> animalList;

    private Animal selectedAnimal;

    public Animal getSelectedAnimal() {
        return selectedAnimal;
    }

    public void setSelectedAnimal(Animal selectedAnimal) {
        this.selectedAnimal = selectedAnimal;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public AnimalSessionBeanLocal getAnimalSessionBeanLocal() {
        return animalSessionBeanLocal;
    }

    public void setAnimalSessionBeanLocal(AnimalSessionBeanLocal animalSessionBeanLocal) {
        this.animalSessionBeanLocal = animalSessionBeanLocal;
    }

    @EJB
    private AnimalSessionBeanLocal animalSessionBeanLocal;

    @PostConstruct
    public void init() {
        animalList = animalSessionBeanLocal.getAllAnimals();
    }

    public String removeAnimal(int animalId) {
        animalSessionBeanLocal.deleteAnimal(animalId);
        animalList = animalSessionBeanLocal.getAllAnimals();
        return null;
    }

    public String updateAnimal() {
        System.out.println("inside AnimalAppBean#updateAnimal method.");
        animalSessionBeanLocal.updateAnimal(selectedAnimal);
        animalList = animalSessionBeanLocal.getAllAnimals();
        selectedAnimal = null;
        return null;
    }

    public String selectForModification(Animal a) {
        System.out.println("inside AnimalAppBean#selectForModification method.");
        selectedAnimal = a;
        return null;
    }

}
