package category;

import album.Album;

import java.util.ArrayList;

public class Category {
    private int category_id;
    private String category_name;
    private ArrayList<Album> albums;

    public Category() {
    }

    public Category(int category_id, String category_name, ArrayList<Album> albums) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.albums = albums;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
