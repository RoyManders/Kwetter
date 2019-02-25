/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RoyManders
 */
@Entity
public class Kweet {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String Content;
    private Date Time;
    private Date TimeEdited;
    
    private List<Like> Likes;
    private User User;

    public Kweet(String content, Date time, User user) {
        this.Content = content;
        this.Time = time;
        this.User = user;
    }
    
    public Kweet(String content, User user) {
        this.Content = content;
        this.Time = new Date(System.currentTimeMillis());
        this.User = user;
    }

    // Getters and setters
    public long getId(){
        return this.id;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public String getContent() {
        return Content;
    }

    public Date getTime() {
        return Time;
    }

    public Date getTimeEdited() {
        return TimeEdited;
    }

    public User getUser() {
        return User;
    }
    
    // Methodes    
    /**
     * Wijzigt de kweet, waarbij de content maximaal 150 tekens mag bevatten.
     * Na de wijziging wordt de datum van de aanpassing vastgelegd.
     * @param content      
     */
    public void editKweet(String content)
    {
        if(content.length() > 150)
        {
            throw new IllegalArgumentException("Kweet is te lang (max 150 tekens)");
        }        
        this.Content = content;
        this.TimeEdited = new Date(System.currentTimeMillis());        
    }
    
    /**
     * Controlleerd eerst of de user al een like gegeven heeft, maximaal 1 like per gebruiker.
     * @param user      
     */
    public void sendLike(User user)
    {
        for (Like like : Likes) {
            if(like.getUser() == user)
            {
                throw new IllegalArgumentException("Je hebt dit bericht al een like gegeven");
            }            
        }
        Likes.add(new Like(user, this));
    }
    
    /**
     * Geeft het aantal likes voor deze kweet terug
     * @return int     
     */
    public int getCountLikes()
    {
        return Likes.size();
    }
}
