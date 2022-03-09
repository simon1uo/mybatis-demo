package example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My Name is " + name + ", and I am " + age + " years old.";
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

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Student stu = new Student();
        Class stuClass1 = stu.getClass();
//        System.out.println(stuClass1);

        Class stuClass2 = Student.class;
//        System.out.println(stuClass2);

        try {
            Class stuClass3 = Class.forName("example.Student");
            System.out.println(stuClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*Constructor[] constructors = stuClass1.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }*/

        /*Constructor con1 = stuClass1.getConstructor();
        Object obj1 = con1.newInstance();
        System.out.println(obj1.toString());

        Constructor con2 = stuClass1.getConstructor(String.class, int.class);
        Object obj2 = con2.newInstance("Simon", 22);
        System.out.println(obj2.toString());*/

/*        Field[] declaredFields = stuClass1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }*/

        /*Field name = stuClass1.getDeclaredField("name");
        System.out.println(name);


        Object obj = stuClass1.getConstructor().newInstance();
        name.setAccessible(true);
        name.set(obj, "Simon");
        System.out.println(((example.Student) obj).getName());*/

        /*Method[] methods = stuClass1.getMethods();
//        Method[] methods = stuClass1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        Method setAge = stuClass1.getMethod("setAge", int.class);
        System.out.println(setAge);

        Object obj = stuClass1.getConstructor().newInstance();
        setAge.invoke(obj, 18); // 调用方法
        System.out.println(((Student) obj).toString());
    }
}