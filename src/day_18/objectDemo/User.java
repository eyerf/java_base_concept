package day_18.objectDemo;

import java.util.Arrays;
import java.util.StringJoiner;

public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "角色编号为" + id + ", 用户名" + username + ", 密码" + password + ", 游戏图片:" + path + ", 进度:" + arrToString();
    }

    private String arrToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] newData = new int[this.data.length];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = data[i];
        }
        User newUser = (User) super.clone();
        newUser.data = newData;
        return newUser;
    }
}
