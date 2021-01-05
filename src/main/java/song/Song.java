package song;

public class Song {
    private int song_id;
    private String song_name;
    private String song_description;
    private String song_url;
    private String song_thumb;
    private String song_author;
    private String song_singer;

    public Song() {
    }

    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSong_description() {
        return song_description;
    }

    public void setSong_description(String song_description) {
        this.song_description = song_description;
    }

    public String getSong_url() {
        return song_url;
    }

    public void setSong_url(String song_url) {
        this.song_url = song_url;
    }

    public String getSong_thumb() {
        return song_thumb;
    }

    public void setSong_thumb(String song_thumb) {
        this.song_thumb = song_thumb;
    }

    public String getSong_author() {
        return song_author;
    }

    public void setSong_author(String song_author) {
        this.song_author = song_author;
    }

    public String getSong_singer() {
        return song_singer;
    }

    public void setSong_singer(String song_singer) {
        this.song_singer = song_singer;
    }
}
