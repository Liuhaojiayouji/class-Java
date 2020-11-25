package _20201117._9_5;
public class Demo05_改 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;
        int num3 = 0;
        try {
            num3 = num1 / num2;
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(num3);
        System.out.println(num1+10);
    }
}
