package _20200930._4_3;

public class Son extends Father {
    int num = 6;

    void show() {
        System.out.println("Father num="+super.num);
        System.out.println("Son num2="+this.num);
    }
}
