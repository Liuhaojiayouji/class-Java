package _20200930.课堂;

public class MathClass {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
//
        if (a < 10) {
            System.out.printf("请输入大于10的数字");
        } else {
            this.a = a;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b > 10) {
            System.out.println("请输入小于10的数字");
        } else {
            this.b = b;
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    private int b;
    private double c, d;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double c, double d) {
        return c + d;
    }
}
