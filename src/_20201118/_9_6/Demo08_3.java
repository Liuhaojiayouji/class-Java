package _20201118._9_6;

public class Demo08_3 {
    public static void main(String[] args) {
        try {
            div(4, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void div(int num1, int num2) throws Exception {
        int num3 = 0;
        if (num2 == 0) {
            throw new Exception();
        }
        try {
            num3 = num1 / num2;
        } catch (Exception e) {
            throw e;
        }

        System.out.println("两个函数相初的值：" + num3);
    }
}
