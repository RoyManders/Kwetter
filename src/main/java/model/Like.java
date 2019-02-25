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
public class Like {
    
    private User User;
    private Kweet Kweet;

    public Like(User user, Kweet kweet) {
        this.User = user;
        this.Kweet = kweet;
    }

    // Getters
    public User getUser() {
        return this.User;
    }

    public Kweet getKweet() {
        return Kweet;
    }    
}
