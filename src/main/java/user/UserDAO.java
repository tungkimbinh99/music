package user;

import Base.DAO;
import album.AlbumDAO;
import artist.ArtistDAO;
import song.SongDAO;
import utils.Convert;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO extends DAO implements IUserDAO {
    @Override
    public User getUser(String usrname,String password) {
        String sql = "SELECT * FROM tblUsers WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,usrname);
            ps.setString(2,password);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setUserName(resultSet.getString("username"));
//                user.setPassword(resultSet.getString("password"));
                user.setBirthday(resultSet.getDate("birthday"));
                user.setGender(resultSet.getBoolean("gender"));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public User creatUser(Register register) {
        String sql = "INSERT INTO tblUsers(username,password,birthday,gender) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, register.getUsername());
            ps.setString(2, register.getPassword());
            ps.setDate(3, Convert.toDate(register.getBirthday()));
            ps.setBoolean(4, register.isGender());
            ps.executeUpdate();
            User user = getUser(register.getUsername(),register.getPassword());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Search search(String key) {
        Search search = new Search();
        search.setSongs(new SongDAO().search(key));
        search.setAlbums(new AlbumDAO().search(key));
        search.setArtists(new ArtistDAO().search(key));
        return search;
    }
}
