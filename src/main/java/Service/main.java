package Service;

import album.AlbumMain;
import artist.ArtistMain;
import category.CategoryMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import song.SongMain;
import user.MainUser;

@SpringBootApplication
public class main {
    public static void main(String[] args) {
//        DBInstance.Init();
//        new DAO();
        SpringApplication.run(
                new Class[]{
                        MainUser.class,
                        CategoryMain.class,
                        SongMain.class,
                        AlbumMain.class,
                        ArtistMain.class
                },
                args);
    }
}
