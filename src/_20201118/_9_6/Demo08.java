package _20201118._9_6;

public class Demo08 {
    public static void main(String[] args) {
        div(4, 0);
    }

    private static void div(int num1, int num2) {
        int num3 = num1 / num2;
        System.out.println("两个函数相初的值：" + num3);
    }
}
