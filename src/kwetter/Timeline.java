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
public class Timeline {
    
    private User user;
    private List<Kweet> kweets;

    public Timeline(User user) {
        this.user = user;
    }
    
    public void loadTrends(){}
    
    public void loadTimeline(){}
    
    public void loadMentions(){}
    
    public void openKweet(){}
    
    public void searchKweet(){}
}
