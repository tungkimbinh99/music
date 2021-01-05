package user;

import model.Respone;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        User user = new UserDB().getUser(loginParams.getUsername(), loginParams.getPassword());
        if (user != null) {
            respone.setData(user);
        } else {
            respone.setMesseges("Tài khoản không tồn tại");
            respone.setData(user);
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
        User user = new UserDB().creatUser(regitsterParams);
        if (user != null) {
            respone.setMesseges("Đăng kí thành công");
            respone.setData(user);
        } else {
            respone.setMesseges("Tài khoản đã tồn tại");
        }
        return respone;
    }
}
