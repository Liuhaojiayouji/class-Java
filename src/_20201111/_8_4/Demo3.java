package _20201111._8_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("_20201111._8_4.Teacher");
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Constructor cons = clazz.getConstructor();
        Object obj = cons.newInstance();
        Field name = clazz.getField("name");
        name.set(obj, "张三");
        Field id = clazz.getField("id");
        id.set(obj, 11);
        System.out.println("教师的姓名为：" + name.get(obj) +
                "，教师的id为：" + id.get(obj));
    }
}
