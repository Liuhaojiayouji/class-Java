package _20201118._9_6;

public class Demo08_2 {
    public static void main(String[] args) {
        try {
            div(4, 0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void div(int num1, int num2) throws Exception{
        if (num2==0){
            throw  new Exception();
        }
        int num3 = num1 / num2;
        System.out.println("两个函数相初的值：" + num3);
    }
}
