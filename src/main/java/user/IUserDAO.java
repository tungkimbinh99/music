package user;

public interface IUserDAO {
    public User getUser(String username,String password);
    public User creatUser(Register register);
}
