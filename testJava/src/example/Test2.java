package example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Developer {
    public void writeCode();
}

class DeveloperImpl implements Developer {
    private String name;

    public DeveloperImpl(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println("example.Developer " + name + " writes code");
    }
}


interface Tester {
    public void doTesting();
}

class TesterImpl implements Tester {
    private String name;

    public TesterImpl(String name) {
        this.name = name;
    }

    @Override
    public void doTesting() {
        System.out.println("example.Tester " + name + "is testing code");
    }
}

class EngineerProxy implements InvocationHandler {
    private Object object;

    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin");
        Object res = method.invoke(object, args);
        System.out.println("end");
        return null;
    }
}


public class Test2 {
    public static void main(String[] args) {
        /*example.Developer developer = new example.DeveloperImpl("Simon");
        // developer.writeCode();

        DeveloperProxy developerProxy = new DeveloperProxy(developer);
        developerProxy.writeCode();

        example.Tester tester = new example.TesterImpl("tester");
        TesterProxy testerProxy = new TesterProxy(tester);
        testerProxy.doTesting();*/


        Developer zhangsan = new DeveloperImpl("zhangsan");
        Developer zhangsanProxy = (Developer) new EngineerProxy().bind(zhangsan);
        zhangsanProxy.writeCode();

        Tester lisi = new TesterImpl("lisi");
        Tester lisiProxy = (Tester) new EngineerProxy().bind(lisi);
        lisiProxy.doTesting();
    }
}
