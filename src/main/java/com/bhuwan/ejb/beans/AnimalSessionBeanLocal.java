/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhuwan.ejb.beans;

import com.bhuwan.jsf.entities.Animal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bhuwan
 */
@Local
public interface AnimalSessionBeanLocal {
    List<Animal> getAllAnimals();
    
    void deleteAnimal(int animalId);
    
    void updateAnimal(Animal animal);
}
