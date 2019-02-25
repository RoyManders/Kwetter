/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author RoyManders
 */
public class Rol {
    private String Naam;
    private List<Recht> Rechten;

    public Rol(String naam) {
        this.Naam = naam;
    }

    // Getters
    public String getNaam() {
        return Naam;
    }

    public List<Recht> getRechten() {
        return Rechten;
    }
    
    // Methodes
    /**
     * Voegt een nieuw recht toe aan deze rol
     * @param recht      
     */    
    public void addRecht(Recht recht)
    {
        this.Rechten.add(recht);
    }
    
    /**
     * Verwijderd een recht, als deze bestaat
     * @param recht 
     */
    public void removeRecht(Recht recht)
    {
        boolean rechtExists = false;
        for(Recht r : Rechten)
        {
            if(recht == r)
            {
                rechtExists = true;
            }
        }
        if (rechtExists){
            Rechten.remove(recht);
        }
        else
        {
            throw new IllegalArgumentException("Deze rol heeft geen recht met de naam: " + recht.getNaam() + ", en kan dan ook niet verwijderd worden");
        }
    }    
}
