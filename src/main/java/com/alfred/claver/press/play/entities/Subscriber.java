package com.alfred.claver.press.play.entities;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subscriber implements Serializable {
    @Id
    String username;
    String email;
    List<String> subscribed_to;

    public Subscriber(String username, String email, List<String> sub_to) {
        this.username = username;
        this.email = email;
        this.subscribed_to = sub_to;
    } 

    public String getUsername(){return username;}
    public String getEmail(){return email;}
    public List<String> getSubscribedTo(){return subscribed_to;}
    public void setUsername(String name){username = name;}
    public void setEmail(String email){this.email = email;}
    public void setSubscribedTo(List<String> sub){subscribed_to = sub;}
}
