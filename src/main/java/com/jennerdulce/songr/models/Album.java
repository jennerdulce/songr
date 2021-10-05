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
}
