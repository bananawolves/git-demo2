package it.heima.test04;

import java.util.Date;
import java.util.Objects;

public class User {
    private String username;
    private String password;
    private Date birthday;
    private String tel;
    private String email;

    public User() {
    }

    public User(String username, String password, Date birthday, String tel, String email) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.tel = tel;
        this.email = email;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(username, user.username)) return false;
        if (!Objects.equals(password, user.password)) return false;
        if (!Objects.equals(birthday, user.birthday)) return false;
        if (!Objects.equals(tel, user.tel)) return false;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
