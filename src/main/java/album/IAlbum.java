package album;

import java.util.ArrayList;

public interface IAlbum {
    ArrayList<Album> getAlbumByCategoryId(int categoryId);
    ArrayList<Album> getNewRelease(int limit);
    ArrayList<Album> getAlbumRecently();
    ArrayList<Album> getAlbumPopular();
    ArrayList<Album> search(String key);
}
