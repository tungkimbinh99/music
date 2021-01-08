package artist;

import model.Respone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
    @GetMapping("/api/getArtist")
    public Respone getArtists(){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new ArtistDAO().getArtists());
        return respone;
    }
    @GetMapping("/api/getArtistDetail")
    public Respone getArtistDetail(@RequestParam(value = "artistId",defaultValue = "-1") int artistId){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new ArtistDAO().getArtistDetail(artistId));
        return respone;
    }
}
