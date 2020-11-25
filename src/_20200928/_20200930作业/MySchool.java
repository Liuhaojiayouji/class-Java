package _20200928._20200930作业;

public class MySchool {
    private String address;
    private String school;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    MySchool() {

    }

    MySchool(String address) {
        this.address = address;
    }

//    MySchool(String school) {
//        this.school = school;
//    }

    MySchool(String address, String school) {

        this.address = address;
        this.school = school;
    }

    public void show() {
        System.out.println("地址=" +
                address +
                "\n校名=" +
                school);
    }
}
