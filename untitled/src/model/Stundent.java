package model;

import java.util.Scanner;

public class Stundent {
    private int id;
    private static int nextID =0;
    private String fullName;
    private String address;

    public Stundent(){
        nextID++;
        this.id = nextID;
    }

    public Stundent(int id, String fullName, String address){
        nextID++;
        this.id= nextID;
        this.fullName = fullName;
        this.address = address;
    }
public void setID(){
        this.id = nextID;
        nextID++;
}
    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return this.id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(Scanner sc){
        System.out.println("Import FullName");
        setFullName(sc.nextLine());
        System.out.println("Import Address");
        setAddress(sc.nextLine());
        System.out.println("Luu Thong Tin Thanh Cong ");
    }

    @Override
    public String toString() {
        return "\n"+getId()+". -FullName: "+getFullName()+"\t \t Address: "+getAddress();
    }
}
