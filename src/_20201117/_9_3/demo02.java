package _20201117._9_3;
public class demo02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        //运行该语句时发生了数组索引越界异常 ArrayIndexOutOfBoundsException  由于没有异常处理  导致程序无法继续执行，程序结束
        System.out.println("over");//由于上局代码出现错误，词句代码不会执行
    }
}
