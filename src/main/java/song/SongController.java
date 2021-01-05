package song;

import model.Respone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
    @GetMapping("/api/getSongByAlbum")
    public Respone getSongByAlbum(@RequestParam(value = "albumId",defaultValue = "-1") int albumId){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new SongDAO().getSongByAlbum(albumId));
        return respone;
    }
}
