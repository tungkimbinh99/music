package album;

public class Album {
    private int album_id;
    private String album_name;
    private String album_thumb;
    private int album_like;
    private String album_timeRecently;
    private boolean album_isNew;
    private int category_id;
    private int artist_id;

    public Album() {
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

    public int getAlbum_like() {
        return album_like;
    }

    public void setAlbum_like(int album_like) {
        this.album_like = album_like;
    }

    public String getAlbum_timeRecently() {
        return album_timeRecently;
    }

    public void setAlbum_timeRecently(String album_timeRecently) {
        this.album_timeRecently = album_timeRecently;
    }

    public boolean isAlbum_isNew() {
        return album_isNew;
    }

    public void setAlbum_isNew(boolean album_isNew) {
        this.album_isNew = album_isNew;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }
}
