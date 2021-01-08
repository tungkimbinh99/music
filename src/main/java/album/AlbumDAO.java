package album;

import Base.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlbumDAO extends DAO implements IAlbum {
    @Override
    public ArrayList<Album> getAlbumByCategoryId(int categoryId) {
        ArrayList<Album> albums = new ArrayList<>();
        String sql ="SELECT * FROM tblAlbum WHERE category_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,categoryId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Album album = new Album();
                album.setAlbum_id(rs.getInt("album_id"));
                album.setAlbum_name(rs.getString("album_name"));
                album.setAlbum_thumb(rs.getString("album_thumb"));
                album.setAlbum_like(rs.getInt("album_like"));
                album.setAlbum_timeRecently(rs.getString("album_timeRecently"));
                album.setAlbum_isNew(rs.getBoolean("album_isNew"));
                album.setCategory_id(rs.getInt("category_id"));
                album.setArtist_id(rs.getInt("artist_id"));
                albums.add(album);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return albums;
    }

    @Override
    public ArrayList<Album> getNewRelease(int limit) {
        ArrayList<Album> albums = new ArrayList<>();
        System.out.println("gioi han: "+limit);
        String sql="";
        if (limit == 0){
            sql ="SELECT * FROM tblAlbum WHERE album_isNew = 1";
        }else {
            sql ="SELECT TOP (?) * FROM tblAlbum WHERE album_isNew = 1 ORDER BY album_id DESC";
        }
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            if (limit != 0){
                ps.setInt(1,limit);
            }
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Album album = new Album();
                album.setAlbum_id(rs.getInt("album_id"));
                album.setAlbum_name(rs.getString("album_name"));
                album.setAlbum_thumb(rs.getString("album_thumb"));
                album.setAlbum_like(rs.getInt("album_like"));
                album.setAlbum_timeRecently(rs.getString("album_timeRecently"));
                album.setAlbum_isNew(rs.getBoolean("album_isNew"));
                album.setCategory_id(rs.getInt("category_id"));
                album.setArtist_id(rs.getInt("artist_id"));
                albums.add(album);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return albums;
    }

    @Override
    public ArrayList<Album> getAlbumRecently() {
        ArrayList<Album> albums = new ArrayList<>();
        String sql ="SELECT TOP 10 * FROM tblAlbum ORDER BY album_timeRecently DESC";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1,categoryId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Album album = new Album();
                album.setAlbum_id(rs.getInt("album_id"));
                album.setAlbum_name(rs.getString("album_name"));
                album.setAlbum_thumb(rs.getString("album_thumb"));
                album.setAlbum_like(rs.getInt("album_like"));
                album.setAlbum_timeRecently(rs.getString("album_timeRecently"));
                album.setAlbum_isNew(rs.getBoolean("album_isNew"));
                album.setCategory_id(rs.getInt("category_id"));
                album.setArtist_id(rs.getInt("artist_id"));
                albums.add(album);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return albums;
    }

    @Override
    public ArrayList<Album> getAlbumPopular() {
        ArrayList<Album> albums = new ArrayList<>();
        String sql="SELECT TOP 10 * FROM tblAlbum ORDER BY album_like DESC";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Album album = new Album();
                album.setAlbum_id(rs.getInt("album_id"));
                album.setAlbum_name(rs.getString("album_name"));
                album.setAlbum_thumb(rs.getString("album_thumb"));
                album.setAlbum_like(rs.getInt("album_like"));
                album.setAlbum_timeRecently(rs.getString("album_timeRecently"));
                album.setAlbum_isNew(rs.getBoolean("album_isNew"));
                album.setCategory_id(rs.getInt("category_id"));
                album.setArtist_id(rs.getInt("artist_id"));
                albums.add(album);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return albums;
    }

    @Override
    public ArrayList<Album> search(String key) {
        ArrayList<Album> albums = new ArrayList<>();
        String sql="SELECT * FROM tblAlbum WHERE album_name LIKE '%C%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Album album = new Album();
                album.setAlbum_id(rs.getInt("album_id"));
                album.setAlbum_name(rs.getString("album_name"));
                album.setAlbum_thumb(rs.getString("album_thumb"));
                album.setAlbum_like(rs.getInt("album_like"));
                album.setAlbum_timeRecently(rs.getString("album_timeRecently"));
                album.setAlbum_isNew(rs.getBoolean("album_isNew"));
                album.setCategory_id(rs.getInt("category_id"));
                album.setArtist_id(rs.getInt("artist_id"));
                albums.add(album);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return albums;
    }
}
