package Model;

import java.util.Scanner;

public class fullName {
    private String fristName;
    private String lastName;
    private String midName;

    public fullName() {
    }

    public fullName(String fristName, String lastName, String midName) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.midName = midName;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    @Override
    public String toString() {
        return "-"+getFristName()+" "+getMidName()+" "+getLastName();
    }
    public void inputFullname(Scanner sc){
        System.out.println("Import First Name :");
        String firstName = sc.nextLine();
        setFristName(firstName);
        System.out.println("Mid Name :");
        String midName = sc.nextLine();
        setMidName(midName);
        System.out.println("Last Name: ");
        String lastName = sc.nextLine();
        setLastName(lastName);
    }
}
