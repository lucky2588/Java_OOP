package model;

import java.util.Scanner;

public class User{
    private int id;
    private static int nextId=0;
    private String fullName;
    private int numbers;
    private String address;

    public User(){
        nextId++;
        this.id=nextId;
    }

    public int getId() {
        return id;
    }

    public User(String fullName, int numbers, String address) {
        this.fullName = fullName;
        this.numbers = numbers;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // hàm nhập thông tin
    public void input(Scanner sc){
        System.out.println("import Username: ");
        setFullName(sc.nextLine());
        System.out.println("Import telephone Numbers");
        setNumbers(sc.nextInt());
        sc.nextLine();
        System.out.println("Import Address");
        setAddress(sc.nextLine());
        System.out.println("Add User successful !!!! ");
        System.out.println("ID\t\t\t Username \t\t\tAddress");
        System.out.println("."+getId()+"\t\t\t"+getFullName()+"\t\t\t"+getAddress());
    }

    @Override
    public String toString() {
        return ""+getId()+"\t\t\t "+getFullName()+"\t\t\t\t"+getAddress();
    }
}
