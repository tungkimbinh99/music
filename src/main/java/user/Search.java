package user;

import album.Album;
import artist.Artist;
import song.Song;

import java.util.ArrayList;

public class Search {
    private ArrayList<Song> songs;
    private ArrayList<Album> albums;
    private ArrayList<Artist> artists;

    public Search() {
    }

    public Search(ArrayList<Song> songs, ArrayList<Album> albums, ArrayList<Artist> artists) {
        this.songs = songs;
        this.albums = albums;
        this.artists = artists;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }
}
