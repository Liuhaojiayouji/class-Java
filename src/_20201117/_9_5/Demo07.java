package _20201117._9_5;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        arr = null;
        printMessage(1, 2, arr);
        System.out.println("over");
    }

    private static void printMessage(int x, int y, int[] arr) {
        try {
            System.out.println(arr[1]);
            System.out.println(x/y);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("算数异常");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("数组角标越界");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("空指针异常");
        }
        System.out.println("函数执行完毕");
    }
}
