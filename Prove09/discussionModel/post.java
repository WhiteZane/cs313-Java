/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discussionModel;

/**
 *
 * @author zane
 */
public class post {
    
    
    private String entry;
    private String username;
    private String date;

    public post() {
        
        setEntry("");
        setUsername("");
        setDate("");
    }

    public post(String entry, String username,  String date) {
        this.setEntry(entry);
        this.setUsername(username);
        this.setDate(date);
    }
    
    public String toFileString() {
        return entry + "," + username + "," + date;
    }

    public void loadFromFileString(String str) {
    // TODO: Validation should be done here
        String[] parts = str.split(",");
         entry = parts[0];
        username = parts[1];
        date = parts[2];
    }

    
    
    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override 
    public String toString() { 
        return entry + " " + username + " " + date; 
}
}
