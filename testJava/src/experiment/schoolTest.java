package experiment;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Teacher {
    public void Teach();
}


class TeacherImpl implements Teacher {
    private String name;

    public TeacherImpl(String name) {
        this.name = name;
    }

    @Override
    public void Teach() {
        System.out.println("Teacher " + name + "'s teaching.");
    }
}

interface Student {
    public void study();
}

class StudentImpl implements Student {

    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println("Student " + name + "is having class.");
    }
}

/**
 * 学校动态代理类
 */
class SchoolProxy implements InvocationHandler {
    private Object object;

    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("go to school");
        Object res = method.invoke(object, args);
        System.out.println("leave school");
        return null;
    }
}

public class schoolTest {
    public static void main(String[] args) {
        // teacher
        Teacher teacher = new TeacherImpl("teacher");
        Teacher teacherProxy = (Teacher) new SchoolProxy().bind(teacher);
        teacherProxy.Teach();

        // student
        Student student = new StudentImpl("student");
        Student studentProxy = (Student) new SchoolProxy().bind(student);
        studentProxy.study();
    }
}
