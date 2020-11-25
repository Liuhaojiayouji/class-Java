package _20201122._10_2;

public class Demo06 {
    public static void main(String[] args) {
        String str="ADFGsdfsdfCD1234FGHddd";
        computerNUmber(str);
    }

    private static void computerNUmber(String str) {
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='A'&&ch<='Z'){
                bigCount++;
            }else if (ch>='a'&&ch<='z'){
                smallCount++;
            }else if (ch>='0'&&ch<='9'){
                numberCount++;
            }
        }
        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(numberCount);
    }
}
