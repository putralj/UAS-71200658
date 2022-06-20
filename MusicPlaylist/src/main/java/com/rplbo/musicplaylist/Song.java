package com.rplbo.musicplaylist;

public class Song {
    private String artist, album, name;
    private int length;

    public Song (String songName, String artistName, String albumName, int songLength){
        this.name = songName;
        this.artist = artistName;
        this.album = albumName;
        this.length = songLength;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
