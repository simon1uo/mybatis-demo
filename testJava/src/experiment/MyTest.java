package experiment;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Student1 {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My Name is " + name + ", and I'm " + age + " years old.";
    }

    public void answer() {
        System.out.println("My Name is " + name + ", and I'm " + age + " years old.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class stuClass = Class.forName("experiment.Student1");
        Constructor cons = stuClass.getConstructor(String.class, int.class);
        Object zhangsan = cons.newInstance("zhangsan", 18);
        System.out.println(zhangsan.toString());

        Field age = stuClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(zhangsan, 20);
        Method answer = stuClass.getMethod("answer", null);
        answer.invoke(zhangsan, null);
    }
}
