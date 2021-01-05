package user;

public class Register {
    private String username;
    private String password;
    private String birthday;
    private boolean gender;

    public Register() {
    }

    public Register(String username, String password, String birthday, boolean gender) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
