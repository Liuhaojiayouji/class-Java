package _20200930._5_2;

public class Computer implements USB{
    @Override
    public void Func(){
        System.out.println("通过usb接口，进行数据转移");
    }
}
