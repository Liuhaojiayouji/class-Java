package _20200923.课堂.陆佳友;

public class Math {
    int A;
    int B;
    int C;

    public int jia(int A, int B) {
        return A + B;
    }

    public int jian(int A, int B) {
        return A - B;
    }

    public int cheng(int A, int B) {
        return A * B;
    }

    public String chu(int A, int B) {
        if (B == 0) {
            return "错了";
        } else if (A == 0) {
            return "错了";
        } else {
            String i;
            C = A / B;
            i = String.valueOf(C);
            return (i);
        }
    }
}
