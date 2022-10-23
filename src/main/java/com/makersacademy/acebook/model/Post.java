package com.makersacademy.acebook.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.tomcat.jni.Time;

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
    private String privacy;
    private boolean reported = false;
    private boolean deleted = false;
    private OffsetDateTime created = OffsetDateTime.now();

    public Post() {}

    public Post(String content, String privacy) {
        this.content = content;
        this.privacy = privacy;
    }

    // public Post(Boolean reported){
    //     this.reported = reported;
    // }

    public String getContent() { return this.content; }
    public void setContent(String content) { this.content = content; }

    public String getPrivacy() { return this.privacy; }
    public void setPrivacy(String privacy) { this.privacy = privacy; }

    // public Boolean getReported() { return this.reported; }
    // public void 

    public String getCreated() { 
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return this.created.format(dateTimeFormatter); 
    }

    public String getReported() { 
        if (this.reported){
            return "This post has been reported.";
        } else {
        return "This post has 0 reports.";
        }
    }
    public void setReported(Boolean reported) { this.reported = reported; }

    public String getDeleted(){
        if (this.deleted){
            return "This post has been deleted by the user.";
        } else {
        return "This post is online.";
        }
    } 



}
