package _20201117._9_2;
/**
 *getMessage() 返回的是此throwable对象详细信息字符串
 *toString（）方法是此throwable对象的简短描述
 * printStackTrace()  将此throwable对象及其追踪输出到指定的printWriter   及打印出错误行号
 */
public class Demo01 {
    public static void main(String[] args) {
        Throwable throwable = new Throwable("模拟问题");
        System.out.println(throwable.getMessage());
        System.out.println(throwable.toString());
        throwable.printStackTrace();
    }
}
