/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwetter;

/**
 *
 * @author RoyManders
 */
public class Like {
    
    private User user;
    private Kweet kweet;

    public Like(User user, Kweet kweet) {
        this.user = user;
        this.kweet = kweet;
    }

    public User getUser() {
        return user;
    }   
}
