package cn.com.gzkit.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/4.
 */
public class LoginUser implements Serializable {
    private String name;
    private String password;
    private String token;
    private String time;
    private int schoolId;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
