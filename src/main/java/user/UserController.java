package user;

import model.Respone;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("/api/login")
    public Respone login(@RequestBody Login loginParams) {
        System.out.println("post maping " + loginParams.getUsername());
        Respone respone = new Respone();
        respone.setStatus(true);

//        Login login= new Login();
//        BeanUtils.copyProperties(loginParams,login);
//        System.out.println("username "+ login.getUsername());
        User user = new UserDAO().getUser(loginParams.getUsername(), loginParams.getPassword());
        if (user != null) {
            respone.setData(user);
        } else {
            respone.setMesseges("Email hoặc password không đúng");
//            respone.setData(user);
        }
        return respone;
    }

    @PostMapping("/api/register")
    public Respone createUser(@RequestBody Register regitsterParams) {
        System.out.println("post maping " + regitsterParams.getBirthday());
        Respone respone = new Respone();
        respone.setStatus(true);
//        Login login= new Login();
//        BeanUtils.copyProperties(loginParams,login);
//        System.out.println("username "+ login.getUsername());
        User user = new UserDAO().creatUser(regitsterParams);
        if (user != null) {
            respone.setMesseges("Đăng kí thành công");
            respone.setData(user);
        } else {
            respone.setMesseges("Tài khoản đã tồn tại");
        }
        return respone;
    }
    @GetMapping("/api/search")
    public Respone getSearch(@RequestParam(value = "key",defaultValue = "") String key){
        Respone respone = new Respone();
        respone.setStatus(true);
        respone.setData(new UserDAO().search(key));
        return respone;
    }
}
