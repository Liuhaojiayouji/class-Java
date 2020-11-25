package _20201111.课堂;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Class class1 = new Teacher().getClass();
        Field[] fi = class1.getFields();
        for (Field field : fi) {
            System.out.println("字段" + field.getName());
        }
        Constructor con1 = class1.getConstructor();
        Object obj1 = con1.newInstance();
        Field name = class1.getField("name");
        Field id = class1.getField("id");
        name.set(obj1,"喜羊羊");
        id.set(obj1,28);
        System.out.println(name.get(obj1)+"    "+id.get(obj1));
    }
}
