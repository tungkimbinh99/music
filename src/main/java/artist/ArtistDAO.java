package artist;

import Base.DAO;
import album.Album;
import song.Song;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArtistDAO extends DAO implements IArtist {
    @Override
    public ArrayList<Artist> getArtists() {
        ArrayList<Artist> artists = new ArrayList<>();
        String sql = "SELECT * FROM tblArtist";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Artist artist = new Artist();
                artist.setArtist_id(rs.getInt("artist_id"));
                artist.setArtist_name(rs.getNString("artist_name"));
                artist.setArtist_thumb(rs.getString("artist_thumb"));
                artist.setArtist_like(rs.getInt("artist_like"));
                artists.add(artist);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return artists;
    }

    @Override
    public ArtistDetail getArtistDetail(int artistId) {
        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Album> albums = new ArrayList<>();
        String sqlSong = "SELECT * FROM tblSong WHERE artist_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlSong);
            ps.setInt(1,artistId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Song song = new Song();
                song.setSong_id(rs.getInt("song_id"));
                song.setSong_name(rs.getNString("song_name"));
                song.setSong_description(rs.getNString("song_description"));
                song.setSong_url(rs.getString("song_url"));
                song.setSong_thumb(rs.getString("song_thumb"));
                song.setSong_singer(rs.getString("song_singer"));
                song.setAlbum_id(rs.getInt("album_id"));
                song.setArtist_id(rs.getInt("artist_id"));
                songs.add(song);
            }
            String sqlAlbum ="SELECT * FROM tblAlbum WHERE artist_id = ?";
            PreparedStatement psAlbum = con.prepareStatement(sqlAlbum);
            psAlbum.setInt(1,artistId);
            ResultSet rsAlbum = psAlbum.executeQuery();
            while(rsAlbum.next()){
                Album album = new Album();
                album.setAlbum_id(rsAlbum.getInt("album_id"));
                album.setAlbum_name(rsAlbum.getString("album_name"));
                album.setAlbum_thumb(rsAlbum.getString("album_thumb"));
                album.setAlbum_like(rsAlbum.getInt("album_like"));
                album.setAlbum_timeRecently(rsAlbum.getString("album_timeRecently"));
                album.setAlbum_isNew(rsAlbum.getBoolean("album_isNew"));
                album.setCategory_id(rsAlbum.getInt("category_id"));
                album.setArtist_id(rsAlbum.getInt("artist_id"));
                albums.add(album);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return new ArtistDetail(songs,albums);
    }

    @Override
    public ArrayList<Artist> search(String key) {
        ArrayList<Artist> artists = new ArrayList<>();
        String sql = "SELECT * FROM tblArtist WHERE artist_name LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,"%"+key+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Artist artist = new Artist();
                artist.setArtist_id(rs.getInt("artist_id"));
                artist.setArtist_name(rs.getNString("artist_name"));
                artist.setArtist_thumb(rs.getString("artist_thumb"));
                artist.setArtist_like(rs.getInt("artist_like"));
                artists.add(artist);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return artists;
    }
}
