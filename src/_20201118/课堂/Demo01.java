package _20201118.课堂;
/**
 *getMessage() 返回的是此throwable对象详细信息字符串
 *toString（）方法是此throwable对象的简短描述
 * printStackTrace()  将此throwable对象及其追踪输出到指定的printWriter   及打印出错误行号
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

            System.out.println(arr[0]);
            System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            if (i>2){
                throw new ArrayIndexOutOfBoundsException();
            }else {
                System.out.println("arr["+i+"]"+arr[i]);
            }
        }
    }
}
