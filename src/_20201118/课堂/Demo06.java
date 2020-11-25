package _20201118.课堂;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo06 {

    public static void main(String[] args) throws Exception {
        Class cla11=Class.forName("_20201118.课堂.Lector");
        Constructor con1 = cla11.getConstructor(String.class, int.class);
        Object obj1=con1.newInstance("光头强",99);
        Method[] ms = cla11.getMethods();
        for (Method m : ms) {
            System.out.println("方法名称"+m.getName());
        }
        Method m1 = cla11.getMethod("display");
        m1.invoke(obj1);
        Method m2 = cla11.getMethod("display",String.class,int.class);
        m2.invoke(obj1,"喜羊羊",199);
        Method m3 = cla11.getMethod("work");
        m3.invoke(obj1);
    }

}
