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
                song.setSong_author(rs.getString("song_author"));
                song.setSong_singer(rs.getString("song_singer"));
                songs.add(song);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return songs;
    }
}
