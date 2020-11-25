package _20201118.课堂;

public class ____1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 3, 3, 1};

        printMessage(arr[0], arr[1], arr);
        System.out.println();
        System.out.println("over");
    }

    private static void printMessage(int x, int y, int[] arr) {
        try {
            System.out.println(arr[1]);
            System.out.println(x / y);
        } catch (Throwable e){
            System.out.println("异常");
            e.printStackTrace();
        }
        System.out.println("函数执行完毕");
    }
}
