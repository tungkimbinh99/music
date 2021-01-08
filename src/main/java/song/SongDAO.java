package song;

import Base.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SongDAO extends DAO implements ISong {
    @Override
    public ArrayList<Song> getSongByAlbum(int albumId) {
        ArrayList<Song> songs = new ArrayList<>();
        String sqlSong = "SELECT * FROM tblSong WHERE album_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlSong);
            ps.setInt(1,albumId);
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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return songs;
    }

    @Override
    public ArrayList<Song> getFeature() {
        ArrayList<Song> songs = new ArrayList<>();
        String sqlSong = "SELECT TOP 5 * FROM tblSong ORDER BY NEWID ()";
        try {
            PreparedStatement ps = con.prepareStatement(sqlSong);
//            ps.setInt(1,albumId);
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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return songs;
    }

    @Override
    public ArrayList<Song> search(String key) {
        ArrayList<Song> songs = new ArrayList<>();
        String sqlSong = "SELECT * FROM tblSong WHERE song_name LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlSong);
            ps.setString(1,"%"+key+"%");
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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return songs;
    }

    @Override
    public boolean updateSong(int song_id, boolean isFavorite) {
        String sql = "UPDATE tblSong set song_favorite = ? WHERE song_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,song_id);
            ps.setBoolean(2,isFavorite);
            ps.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
