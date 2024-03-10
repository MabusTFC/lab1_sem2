package com.example.demo.om.example.demo.model;
import java.util.Date;
import java.util.Scanner;
public class Post {
    private String text;
    private Integer likes;

    private Date creationDate;



    public Date getCreationDate(){return creationDate;}


    public Post(String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText(){
        return text;
    }


    public Integer getLikes(){
        return likes;
    }
}