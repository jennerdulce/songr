package com.jennerdulce.songr.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;

// Store in the db
@Entity
public class Album {
    // Add Id and GeneratedValue annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    String title;
    String artist;
    int songCount;
    int lengthInS;
    String imageUrl;

    // JPA and Hibernate NEED Default constructor
    protected Album(){

    }

    public Album(String title, String artist, int songCount, int lengthInS, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInS = lengthInS;
        this.imageUrl = imageUrl;
    }

    public String getArtist(){
        return this.artist;
    }
    public String getTitle(){
        return this.title;
    }
    public int getSongCount(){
        return this.songCount;
    }
    public int getLengthInS(){
        return this.lengthInS;
    }
    public String imageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String path)
    {
        this.imageUrl = path;
    }
}
