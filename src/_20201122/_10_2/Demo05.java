package _20201122._10_2;

public class Demo05 {
    public static void main(String[] args) {
        String str1 =new String();
        byte [] buf={97,98,99,103,110};
        String str2=new String(buf);
        String str3=new String(buf,1,3);
        char [] arr ={'明','天','是','新','年'};
        String str4=new String(arr);
        String str5=new String(arr,2,3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
