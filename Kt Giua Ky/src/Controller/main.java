package Controller;

import Model.Account;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        Pattern checkPass = Pattern.compile("^[0-9A-Za-z.]{7,15}+$");
        Pattern checkID = Pattern.compile("[a-zA-z0-9]{3,}+$");
        Pattern checkEmail = Pattern.compile("^[a-zA-z0-9 .@]{3,}+$");
        // Khởi tạo 1 list chứa các Account
        ArrayList<Account> listAccount = new ArrayList<>();
        Account user = new Account("user1", "Aa123456.", "user@gmail.com");
        listAccount.add(user);
        Scanner sc = new Scanner(System.in);
        Boolean checkOne = true;
        Boolean checkTwo = true;
        Boolean checkThree = true;
        int checkNumber = 0;
        do {
            //Viết chương trình thực hiện:
            // 1. Đăng nhập , 2. Đăng Kí
            System.out.println("==========Welcome to the endless plains==========");
            System.out.printf(" \n 1.Log in \t 2.Register an account \n");
            System.out.println("\n \n Choose : ");
            int Choose = sc.nextInt();
            sc.nextLine();
            switch (Choose) {
                case 1:
                    //Sử lí giao diện Đăng Nhập
                    System.out.println("enter account");
                    String enterAcc = sc.nextLine();
                    System.out.println("import Password ");
                    String passWord = sc.nextLine();
                    for (int i = 0; i < listAccount.size(); i++) {
                        if (listAccount.get(i).getUserName().compareTo(enterAcc) == 0 && listAccount.get(i).getPassWord().compareTo(passWord) == 0) {
                            System.out.println(" Wait for a second....... ");
                            System.out.println("Logged in successfully !!!");
                            System.out.println("Welcome to " + listAccount.get(i).getUserName() + "\n");
                            System.out.println("==========Your request=========");
                            System.out.println("1.change Username ");
                            System.out.println("2.Change Email ");
                            System.out.println("3.Change PassWd");
                            System.out.println("4.Log Out ");
                            System.out.println("0. Exit Program ");
                            System.out.println("\n Your Decision  ");
                            int decision = sc.nextInt();
                            sc.nextLine();
                            endPro:
                            switch (decision) {
                                case 1:
                                    System.out.println("Import Username new");
                                    String usernameNew = sc.nextLine();
                                    if (checkID.matcher(usernameNew).find()) {
                                        for (int j = 0; j < listAccount.size(); j++) {
                                            if (usernameNew.compareToIgnoreCase(listAccount.get(i).getUserName()) != 0) {
                                                listAccount.get(i).setUserName(usernameNew);
                                                System.out.println("Set Seccuress");
                                            } else {
                                                System.out.println("username already exists , please import Username diffirent ");
                                                decision = 1;
                                                break; // Chưa xử lí được vòng cho nhập lại Username
                                            }
                                        }
                                        // Xử Lí xong chức năng 1 khi đăng nhập đã thành công và nhập user hợp lệ
                                    } else {
                                        System.out.println("Username  not valid .., Input Rs");
                                    }
                                    break;
                                // Xử Lí xong chức năng 1 khi đăng nhập đã thành công
                                case 2:
                                    System.out.println("Import Email you want change ");
                                    String email = sc.nextLine();
                                    if (checkEmail.matcher(email).find()) {
                                        for (int j = 0; j < listAccount.size(); j++) {
                                            listAccount.get(i).setEmail(email);
                                            System.out.println("Email is Change !!");
                                        }
                                    } else {
                                        System.out.println(" Email already exists , please import Email diffirent");
                                    }
                                    break; // Xử lí xong 2/3 chức năng 2 khi đăng nhập thành công , còn bước back về vòng switch tiến hành nhập lại Email nếu nhập size
                                case 3:
                                    System.out.println("Input PassWord");
                                    String passWd = sc.nextLine();
                                    if (checkPass.matcher(passWd).find()) {
                                        if (passWd.equals(listAccount.get(i).getPassWord())) {
                                            listAccount.get(i).setPassWord(passWd);
                                            System.out.println("Change PassWd Seccuress  !! ");
                                        } else {
                                            System.out.println("The Same Password, please enter another password");
                                        }
                                    } else {
                                        System.out.println("Passwd have keywork Not Vail !! ");
                                    }
                                    break; // Chức năng thứ 3 sau khi đăng nhập thành công , khi nhập không đúng MK mới chưa có bank về nhập lại MK
                                case 4:
                                    break; // bank về lúc đăng nhập , đăng kí
                                case 0:
                                    checkOne = false; // gắn giá trị để kết thúc vòng While lồng
                                    break endPro;
                                default:
                                    System.out.println("Import numbers resquet ^^");
                                    break;
                            }
                        } else {
                            System.out.println("Log in fail !!! Please Check ID and PassWord that you enter ");// Xử lí chức năng Đăng nhập lại và Quên Mật Khẩu
                            System.out.println("==>> Suggestions ");
                            System.out.println("1.login again \t 2.Forgot Password \t 3.Out Program ");
                            System.out.println("Your Decision");
                            int decisionTwo = sc.nextInt();
                            sc.nextLine();
                            switch (decisionTwo) {
                                case 1:
                                    Choose = 1;
                                    break;
                                case 2:
                                    // Xử lí phần Quên mk , Nhập Email đã đăng kí
                                    System.out.println("Import email You Registered ... ");
                                    String checkEmail1 = sc.nextLine();
                                    for (int j = 0; j < listAccount.size(); j++) {
                                        if (checkEmail1.equals(listAccount.get(i).getEmail())) { // Check xem email trùng với email của User nào trong list
                                            System.out.println("Are you " + listAccount.get(i).getUserName());
                                            System.out.println("Import PassWD new ");
                                            String passWDnew = sc.nextLine();
                                            listAccount.get(i).setPassWord(passWDnew);
                                            System.out.println("Pass Wd set Vail !!");
                                        } else {
                                            System.out.println("Email not found , please Input Once  !!!");
                                            Choose = 1; // Chưa back về được lệnh nhập lại Email
                                        }
                                        break;
                                        // Xử lí xong phần Quên Mật Khẩu
                                    }
                                    break;
                                case 3:
                                    checkOne = false;
                                    break;
                                default:
                                    System.out.println("Import 1 or 2 ");
                                    break;
                            }
                        }
                    }
                    break;
                //Case 2 này xử lí phần đăng kí tài khoản ..........
                case 2: // Xử Lí From Đăng Kí
            }
        }while(checkOne);

        System.out.println("End Program");
    }
}
// Kết thúc Chương trình



