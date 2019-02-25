/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwetter;

import java.util.Date;
import java.util.List;

/**
 *
 * @author RoyManders
 */
public class Kweet {
    private String content;
    private Date time;
    private Date timeEdited;
    
    private List<Like> likes;
    private User user;

    public Kweet(String content, Date time, User user) {
        this.content = content;
        this.time = time;
        this.user = user;
    }
    
    public void editKweet()
    {
        
    }
    
    public void sendLike()
    {
        
    }    
}
