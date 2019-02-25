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
public class Timeline {   
    
    private List<Kweet> Kweets;

    public Timeline() {        
    }
    
    public List<Kweet> loadTrends(){ return Kweets;}
    
    public List<Kweet> loadTimeline(){ return Kweets;}
    
    public List<Kweet> loadMentions(){ return Kweets;}
    
    public Kweet openKweet(){ return null;}
    
    public List<Kweet> searchKweet(){ return Kweets;}
}
