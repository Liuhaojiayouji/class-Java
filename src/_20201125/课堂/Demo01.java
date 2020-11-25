package _20201125.课堂;

public class Demo01 {
    public static void main(String[] args) {
        new Son().name();
    }
}
class Father{
    public void name(){
        throw new NullPointerException();
    }
}
class Son extends Father{
    public void name() throws NullPointerException{
        System.out.println("子类重写父类异常");
    }
}
