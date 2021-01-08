package artist;

import album.Album;
import song.Song;

import java.util.ArrayList;

public class ArtistDetail {
    private ArrayList<Song> songs;
    private ArrayList<Album> albums;

    public ArtistDetail() {
    }

    public ArtistDetail(ArrayList<Song> songs, ArrayList<Album> albums) {
        this.songs = songs;
        this.albums = albums;
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
}
