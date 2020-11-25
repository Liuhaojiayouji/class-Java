package _20201111._8_5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("_20201111._8_5.Lector");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Constructor<?> con1 = clazz.getConstructor(String.class, int.class);
        Object obj = con1.newInstance("张三", 12);
        Method displayInfo = clazz.getMethod("displayInfo", String.class, int.class);
        displayInfo.invoke(obj, "张三", 23);
        Method displayInfo1 = clazz.getMethod("displayInfo");
        displayInfo1.invoke(obj);
    }
}
