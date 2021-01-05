package user;

import java.sql.Date;

public class User {
    private String userName;
    private Date birthday;
    private boolean gender;

    public User() {
    }

    public User(String userName, Date birthday, boolean gender) {
        this.userName = userName;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}