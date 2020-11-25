package _20201117._9_5;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 7, 30};
        int end = 0;
        try {
            end = arr[5];
            end += 10;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println(end);
    }
}
