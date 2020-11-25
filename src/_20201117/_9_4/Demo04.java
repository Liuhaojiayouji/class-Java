package _20201117._9_4;
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {34, 12, 67};
        int num = getElement(arr, 4);
        System.out.println("num=" + num);
        System.out.println("over");
    }

    private static int getElement(int[] arr, int index) {
        int element = arr[index];
        return element;
    }
}
