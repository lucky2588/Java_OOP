package Model;

import java.util.Scanner;

public class AccountModel {
    Scanner sc = new Scanner(System.in);
    public AccountModel(){};
    public Account input(){
        System.out.println("Import Your Name ");
        String fullname= sc.nextLine();
        System.out.println("Import PassWord");
        String passWord = sc.nextLine();
        Account user = new Account(fullname,passWord);
        return user;
    }
}
