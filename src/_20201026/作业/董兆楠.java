package _20201026.作业;

import org.w3c.dom.ls.LSException;

public class 董兆楠 {
    public static void main(String[] args) {
        Worker[] workers = {
                new Manager("经理1", 20),
                new Boss("老板1", 40),
                new Manager("经理2", 20),
                new Boss("老板2", 50),
                new Manager("经理3", 20),
                new Boss("老板3", 30),
                new Worker("工人1", 21)
        };
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] instanceof Manager) {
                Manager manager = (Manager) workers[i];
                System.out.println(manager.name + "," + manager.age);
                System.out.println("这个是manager\n");
            } else if (workers[i] instanceof Boss) {
                Boss boss = (Boss) workers[i];
                System.out.println(boss.name + "," + boss.age);
                System.out.println("这个是boss\n");
            } else {
                System.out.println("程序错误\n");
            }
        }
    }
}