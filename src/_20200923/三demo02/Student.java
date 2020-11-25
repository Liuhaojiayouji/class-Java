package _20200923.三demo02;

public class Student {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
//        this.gender = gender;
        if (!"男".equals(gender) || !"女".equals(gender)) {
            this.gender = "男";
            return;
        } else {
            this.gender = gender;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        this.age = age;
        if (age < 0 || age > 150) {
            this.age = 18;
            return;
        } else {
            this.age = age;
        }
    }

    public void showInfo() {
        System.out.println(name + "," + gender + "," + age);
    }
}
