package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private int count ;

    public Playlist() {
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlayListName(String playlistName) {
        this.playlistName = playlistName;
    }

    public void print() {

        System.out.println("Jumlah Lagu = " + this.songs.size() + " / Kapasitas Playlist = 6");
        int numHelp = 0;

        for (Song lagu : this.songs){
            System.out.println("ListSong[" + numHelp + "] :" + lagu.getName() + " - " + lagu.getArtist());
            numHelp++;
        }
    }

    public String totalTime(){
        for (Song lagu : songs){
            this.count += lagu.getLength();
        } return "\nTotal waktu [" + getPlaylistName()+ "] = " + count  + " detik";
    }


    public void add(Song song) {
        if (songs.size() < 6){
            songs.add(song);
        } else {
            System.out.println("Playlist " + this.playlistName + " penuh! Tidak bisa menambahkan lagu lagi.\n");
        }
    }

    public void remove (String songName){
        for (Song lagu : songs){
            if (lagu.getName().equals(songName)){
                songs.remove(lagu);
                System.out.println(lagu.getName() + " terhapus...");
                break;
            }
        }
    }

    public int size(){
        return this.songs.size();
    }
}
