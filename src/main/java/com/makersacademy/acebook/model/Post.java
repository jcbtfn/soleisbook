package com.makersacademy.acebook.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    // private Timestamp createdat;
    // private Timestamp modifiedat;
    // private String state;

    public Post() {}

    public Post(String content) {
        this.content = content;
    }
    public String getContent() { return this.content; }
    public void setContent(String content) { this.content = content; }

    // public Boolean postfilter(){ // from coaches room
    //     return true;
    // }

    // public Boolean is_approved(){ // from coaches room
    //     //we have the post
    //     //send this to a list of post for admins 
    //     return false;
    // }

// create > pending approval
// showing > normal user only the apporved ones
// admin then filter and can see all the posts
// pending, apporved, rejected, revision...

}
