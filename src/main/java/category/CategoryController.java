package category;

import model.Respone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @GetMapping("/api/category")
    public Respone getCategory(){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new CategoryDAO().getCategory());
        return respone;
    }
}
