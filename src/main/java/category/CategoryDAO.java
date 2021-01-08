package category;

import Base.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryDAO extends DAO implements ICategory {
    @Override
    public ArrayList<Category> getCategory() {
        ArrayList<Category> categories = new ArrayList<>();

        String sqlCategory ="SELECT * FROM tblCategory";
        String sqlAlbum = "SELECT * FROM tblAlbum WHERE category_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlCategory);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Category category = new Category();
                category.setCategory_id(rs.getInt("category_id"));
                category.setCategory_name(rs.getNString("category_name"));
//                ArrayList<Album> albums = new ArrayList<>();
//                PreparedStatement preparedStatement = con.prepareStatement(sqlAlbum);
//                preparedStatement.setInt(1,rs.getInt("category_id"));
//                ResultSet resultSet = preparedStatement.executeQuery();
//                while (resultSet.next()){
//                    Album album = new Album();
//                    album.setAlbum_id(resultSet.getInt("album_id"));
//                    album.setAlbum_name(resultSet.getString("album_name"));
//                    album.setAlbum_thumb(resultSet.getString("album_thumb"));
//                    albums.add(album);
//                }
//                category.setAlbums(albums);
                categories.add(category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categories;
    }
}
