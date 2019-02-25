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
public class User {
    
    private String Username;
    private String Bio;
    private String Location;
    private String Website;
    private String ProfilePhotoLocation;
    private Rol Functie;
    
    private List<Kweet> Kweets;    
    private List<User> Followers;
    private List<User> Following;

    /*
    constructor
    */
    public User(String username, String bio, String location, String website, String profilePhotoLocation, Rol functie) {
        this.Username = username;
        this.Bio = bio;
        this.Location = location;
        this.Website = website;
        this.ProfilePhotoLocation = profilePhotoLocation;
        this.Functie = functie;
    }
    
    // Getters
    public String getUsername() {
        return Username;
    }

    public String getBio() {
        return Bio;
    }

    public String getLocation() {
        return Location;
    }

    public String getWebsite() {
        return Website;
    }

    public String getProfilePhotoLocation() {
        return ProfilePhotoLocation;
    }

    public List<Kweet> getKweets() {
        return Kweets;
    }

    public List<User> getFollowers() {
        return Followers;
    }

    public List<User> getFollowing() {
        return Following;
    }    
    
    // methodes
    public void postKweet(String content)
    {
        if(content.length() > 150)
        {
            throw new IllegalArgumentException("Kweet is te lang (max 150 tekens)");
        }
        Kweets.add(new Kweet(content, this));
    }
    
    public void editProfilePhoto()
    {
        
    }
    
    public void editProfileDetails()
    {
        
    }
    
    public void deleteKweet()
    {
        
    }
    
    public void followUser()
    {
        
    }
    
    public void unFollowUser()
    {
        
    }
}
