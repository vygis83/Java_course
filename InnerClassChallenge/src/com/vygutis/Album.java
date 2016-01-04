package com.vygutis;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vygis on 31/12/2015.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songlist = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songlist.add(title, duration);
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if((index >=0) && (index <= this.songlist.songs.size())){
            playlist.add(this.songlist.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song checkedSong = songlist.find(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(String title, double duration) {
            if(find(title) == null){
                Song song = new Song(title, duration);
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song find(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }
    }
}
