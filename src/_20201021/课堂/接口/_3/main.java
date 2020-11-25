package _20201021.课堂.接口._3;


public class main {
    public static void main(String[] args) {
        new SonFather().show1();
        new SonFather().show2();
        new SonFather().show3();
    }
}

interface Father1 {
    void show1();
}

interface Father2 {
    void show2();
}

interface Father3 extends Father1, Father2 {
    void show3();
}

class SonFather implements Father3 {
    @Override
    public void show1() {
        System.out.println("1");
    }

    @Override
    public void show2() {
        System.out.println("1");
    }

    @Override
    public void show3() {
        System.out.println("1");
    }
}


