package experiment;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class User {
    private int id;
    private String username;
    private String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void getUserInfo() {
        System.out.println("id: " + id + ", username: " + username + ", password: " + password);
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
}

public class UserTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 1 用Java反射技术生成User类的实例
        Class userClass = Class.forName("experiment.User");
        Constructor constructor = userClass.getConstructor(int.class, String.class, String.class);
        Object admin = constructor.newInstance(1, "admin", "123456");
        System.out.println(admin.toString());

        // 获取该实例的成员变量并修改其值
        Field password = userClass.getDeclaredField("password");
        password.setAccessible(true);
        password.set(admin, "654321");
        System.out.println(admin.toString());

        // 获取该实例的成员方法并且调用
        Method getUserInfo = userClass.getMethod("getUserInfo", null);
        getUserInfo.invoke(admin, null);
    }
}
