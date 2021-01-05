package category;

public class Album {
    private int album_id;
    private String album_name;
    private String album_thumb;

    public Album() {
    }

    public Album(int album_id, String album_name, String album_thumb) {
        this.album_id = album_id;
        this.album_name = album_name;
        this.album_thumb = album_thumb;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_thumb() {
        return album_thumb;
    }

    public void setAlbum_thumb(String album_thumb) {
        this.album_thumb = album_thumb;
    }
}
