package user;

public interface IUserDAO {
    User getUser(String username,String password);
    User creatUser(Register register);
    Search search(String key);
}
