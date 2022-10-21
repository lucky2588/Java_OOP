package Model;

import java.util.Scanner;

public class Student{
    private fullName fullName;
    private Birday dayBirth;
    private String address;

    public Student(Model.fullName fullName) {
        this.fullName = fullName;
    }

    public Student() {
    }

    public Student(Birday dayBirth) {
        this.dayBirth = dayBirth;
    }

    public Student(Model.fullName fullName, Birday dayBirth, String address) {
        this.fullName = fullName;
        this.dayBirth = dayBirth;
        this.address = address;
    }

    public Model.fullName getFullName() {
        return fullName;
    }

    public void setFullName(Model.fullName fullName) {
        this.fullName = fullName;
    }

    public Birday getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(Birday dayBirth) {
        this.dayBirth = dayBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n.FullName: "+getFullName()+"\n Birday:"+getDayBirth()+"\nAddress:"+getAddress();
    }
    // Xử lí Hàm Nhập Thông Tin
    public void inputInforAboutStudent(Scanner sc){
        System.out.println("Please Give Us Your Name");
        fullName name = new fullName();
        name.inputFullname(sc);
        setFullName(name);
        System.out.println("Please Give Us Your Birdayth");
        Birday birday = new Birday();
        birday.InputBirday(sc);
        setDayBirth(birday);
        System.out.println("Address Of You ");
        String address = sc.nextLine();
        setAddress(address);
    }
}
