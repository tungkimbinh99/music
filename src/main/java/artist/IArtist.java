package artist;

import java.util.ArrayList;

public interface IArtist {
    ArrayList<Artist> getArtists();
    ArtistDetail getArtistDetail(int artistId);
    ArrayList<Artist> search(String key);
}
