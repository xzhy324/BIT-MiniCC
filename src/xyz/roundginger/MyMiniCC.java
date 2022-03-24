package xyz.roundginger;

import xyz.roundginger.scanner.*;

import java.lang.reflect.Method;

public class MyMiniCC {
    public static void main(String[] args) throws Exception {
        String filename = "";

        Class<?> c = Class.forName("xyz.roundginger.scanner.MyScanner");
        Method method = c.getMethod("run", String.class);
        filename = (String)method.invoke(c.newInstance(), filename);

        MyScanner sc = new MyScanner();
        sc.run("123");
    }
}
