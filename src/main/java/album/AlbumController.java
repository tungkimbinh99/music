package album;

import model.Respone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AlbumController {
    @GetMapping("/api/getAlbumByCategoryId")
    public Respone getSongByAlbum(@RequestParam(value = "categoryId",defaultValue = "-1") int categoryId){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new AlbumDAO().getAlbumByCategoryId(categoryId));
        return respone;
    }
    @GetMapping("/api/getAlbumNewRelease")
    public Respone getAlbumNewRelease(@RequestParam(value = "limit",defaultValue = "0") int limit){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new AlbumDAO().getNewRelease(limit));
        return respone;
    }
    @GetMapping("/api/getAlbumRecently")
    public Respone getAlbumRecently(){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new AlbumDAO().getAlbumRecently());
        return respone;
    }
    @GetMapping("/api/getAlbumPopular")
    public Respone getAlbumPopular(){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new AlbumDAO().getAlbumPopular());
        return respone;
    }
}
