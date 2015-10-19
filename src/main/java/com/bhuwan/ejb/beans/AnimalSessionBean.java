/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhuwan.ejb.beans;

import com.bhuwan.jsf.entities.Animal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bhuwan
 */
@Stateless
public class AnimalSessionBean implements AnimalSessionBeanLocal {

    @PersistenceContext(name = "ejb_ds")
    private EntityManager em;

    public List<Animal> getAllAnimals() {
        return em.createNamedQuery("Animal.findAll", Animal.class).getResultList();
    }

    public void deleteAnimal(int animalId) {
        Animal a = em.find(Animal.class, animalId);
        if (a != null) {
            em.remove(a);
        }
    }

    public void updateAnimal(Animal animal) {
        System.out.println("inside AnimalSessionBean#updateAnimal method.");
        em.merge(animal);
    }
}
