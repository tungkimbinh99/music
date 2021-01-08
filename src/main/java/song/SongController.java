package song;

import model.Respone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/api/getFeature")
    public Respone getFeature(){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new SongDAO().getFeature());
        return respone;
    }

    @PutMapping("/api/song/favorite")
    public Respone isLike(@RequestParam(value = "songId",defaultValue = "null") int songId,
                          @RequestParam(value = "isFavorite",defaultValue = "null") boolean isFavorite){
        Respone respone = new Respone();
        respone.setStatus(true);
        if (new SongDAO().updateSong(songId,isFavorite)){
            respone.setMesseges("Thành công");
        }else {
            respone.setMesseges("Đã có lỗi sảy ra");
        }
//        respone.setData(new SongDAO().getFeature());
        return respone;
    }



}
