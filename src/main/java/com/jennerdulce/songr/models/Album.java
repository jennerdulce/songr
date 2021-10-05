package com.jennerdulce.songr.models;

public class Album {
    String title;
    String artist;
    int songCount;
    int lengthInS;
    String imageUrl;

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
