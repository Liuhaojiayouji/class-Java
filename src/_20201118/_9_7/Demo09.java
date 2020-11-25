package _20201118._9_7;

public class Demo09 {
    public static void main(String[] args) {
        div(4, 2);

    }

    private static void div(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        int num3 = num1 / num2;
        System.out.println("两数相除的值是:"+num3);
    }
}
