package _20201104._6_2;

public class Demo04 {
    public static void main(String[] args) {
        Worker[] workers = {
                new Manager("经理1", 20),
                new Boss("老板1", 40),
                new Manager("经理2", 20),
                new Boss("老板2", 50),
                new Manager("经理3", 20),
                new Boss("老板3", 30)
        };
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] instanceof Manager) {
                Manager manager = (Manager) workers[i];
                System.out.println(manager.name + "," + manager.age);
            } else if (workers[i] instanceof Boss) {
                Boss boss = (Boss) workers[i];
                System.out.println(boss.name + "," + boss.age);
            } else {
                System.out.println("程序错误");
            }
        }
    }
}
