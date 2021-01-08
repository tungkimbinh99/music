package song;

import java.util.ArrayList;

public interface ISong {
    ArrayList<Song> getSongByAlbum(int albumId);
    ArrayList<Song> getFeature();
    ArrayList<Song> search(String key);
    boolean updateSong(int song_id,boolean isFavorite);
}
