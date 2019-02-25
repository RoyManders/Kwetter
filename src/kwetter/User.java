/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwetter;

import java.util.List;

/**
 *
 * @author RoyManders
 */
public class User {
    
    private String username;
    private String bio;
    private String location;
    private String website;
    private String profilePhotoLocation;
    private eUserStatus status;
    
    private List<Kweet> kweets;    
    private List<User> followers;
    private List<User> following;

    /*
    constructor
    */
    public User(String username, String bio, String location, String website, String profilePhotoLocation, eUserStatus status) {
        this.username = username;
        this.bio = bio;
        this.location = location;
        this.website = website;
        this.profilePhotoLocation = profilePhotoLocation;
        this.status = status;
    }
    
    public void postKweet()
    {
        
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
