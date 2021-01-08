package artist;

public class Artist {
    private int artist_id;
    private String artist_name;
    private String artist_thumb;
    private int artist_like;

    public Artist() {
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getArtist_thumb() {
        return artist_thumb;
    }

    public void setArtist_thumb(String artist_thumb) {
        this.artist_thumb = artist_thumb;
    }

    public int getArtist_like() {
        return artist_like;
    }

    public void setArtist_like(int artist_like) {
        this.artist_like = artist_like;
    }
}
