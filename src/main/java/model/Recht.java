/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author RoyManders
 */
public class Recht {
    private String Naam;
    private String Beschrijving;

    public Recht(String naam, String beschrijving) {
        this.Naam = naam;
        this.Beschrijving = beschrijving;
    } 

    // Getters
    public String getNaam() {
        return Naam;
    }

    public String getBeschrijving() {
        return Beschrijving;
    }
    
    // Methodes
    /**
     * 
     * @param naam
     * @param beschrijving 
     * Wijzigd de naam en beschrijving van dit recht
     */
    public void editRecht(String naam, String beschrijving){
        this.Naam = naam;
        this.Beschrijving = beschrijving;
    }
}
