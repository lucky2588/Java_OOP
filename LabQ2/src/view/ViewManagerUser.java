package view;

import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewManagerUser {
    public ViewManagerUser() {
    }

    public void display(Scanner sc, ArrayList<User> listUser) {
        boolean control = true;
        while (control) {
            System.out.println("\t\t\t\t\t=== Fucition of Manager User ===== ");
            System.out.println("1.Add User \t\t\t 2.Detele User \t\t\t 3.Update User \t\t\t 4.Sreach User \t\t\t 5.Exit ");
            System.out.println("=>>Your Choose: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    boolean control1 = true;
                    while (control1) {
                        inputUser(sc, listUser);
                        System.out.println("Do You Want Continue add User ?? \t 1.Yes \t\t 2.No ");
                        int chooseCase1 = sc.nextInt();
                        sc.nextLine();
                        switch (chooseCase1) {
                            case 1:
                                break;
                            case 2:
                                control1 = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    if (!listUser.isEmpty()) {
                        deteleUser(sc, listUser);
                    } else {
                        System.out.println("Input User before use Fuction !!");
                        System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    }
                    break;
                case 3:
                    if (!listUser.isEmpty()) {
                        updateUser(sc, listUser);
                    } else {
                        System.out.println("Input User before use Fuction !!");
                        System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    }
                    break;
                case 4:
                    if (!listUser.isEmpty()) {
                        sreachUser(sc, listUser);
                    } else {
                        System.out.println("Input User before use Fuction !!");
                        System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    }
                    break;
                case 5:
                    control = false;
                    break;
                default:
                    System.out.println("input Numbers Other ");
                    System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    break;
            }
        }
    }

    // chức năng 1 :
    public void inputUser(Scanner sc, ArrayList<User> listUser) {
        User user = new User();
        user.input(sc);
        listUser.add(user);
    }

    //Chức năng 2:
    public void deteleUser(Scanner sc, ArrayList<User> listUser) {
        System.out.println("Import ID of User that You want Detele !!! ");
        int idCheck = sc.nextInt();
        sc.nextLine();
        System.out.println("List Now " + listUser.size());
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getId() == idCheck) {
                listUser.remove(i);
                System.out.println("Detele successful !!! ");
                System.out.println("List Now have: " + listUser.size());
            } else {
                if (i < listUser.size() - 1)
                    continue;
                System.out.println("Not look for Id @@ !! ");
                System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
            }
        }
    }

    //chức năng 3 :
    public void updateUser(Scanner sc, ArrayList<User> listUser) {
        System.out.println("Import ID of User that You Want Update !! ");
        int idCheck = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < listUser.size(); i++) {
            if (idCheck == listUser.get(i).getId()) {
                updateChoose(sc, listUser.get(i), listUser);
            } else {
                if (i < listUser.size() - 1)
                    continue;
                System.out.println("Not look ID that you Enter @@ !! ");
                System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
            }
        }
    }

    // Chức năng 3.1
    public void updateChoose(Scanner sc, User user, ArrayList<User> listUser) {
        System.out.println("Information Of User Before Update !!! ");
        System.out.println("ID\t\t\t Username \t\t\t\tAddress");
        System.out.println(user.toString());
        boolean control = true;
        while (control) {
            System.out.println("Do You Want Update ? \n 1.Username \t \t 2.Numbers Phone \t\t\t 3. Address\t\t\t 4.Exit");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Import UserNew ");
                    user.setFullName(sc.nextLine());
                    System.out.println("Update Username successful !!! ");
                    System.out.println("Information Of User After Update !! ");
                    System.out.println("ID\t\t\t Username \t\t\tAddress");
                    System.out.println(user.toString());
                    break;
                case 2:
                    System.out.println("Import NumbersPhone New  ");
                    user.setNumbers(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Update Numbers successful !!! ");
                    System.out.println("Information Of User After Update !! ");
                    System.out.println("ID\t\t\t Username \t\t\t\tAddress");
                    System.out.println(user.toString());
                    break;
                case 3:
                    System.out.println("Import AddressNew ");
                    user.setAddress(sc.nextLine());
                    System.out.println("Update Address successful !!! ");
                    System.out.println("Information Of User After Update !! ");
                    System.out.println("ID\t\t\t Username \t\t\t\tAddress");
                    System.out.println(user.toString());
                    break;
                case 4:
                    System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    control = false;
                    break;
            }
        }
    }

    //Chức năng 4 :
    public void sreachUser(Scanner sc, ArrayList<User> listUser) {
        System.out.println("Import Username that You Want Look for !!! ");
        String checkName = sc.nextLine();
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getFullName().contains(checkName)) {
                System.out.println("ID\t\t\t Username \t\t\t\tAddress");
                System.out.println(listUser.get(i).toString());
            } else {
                if (i < listUser.size() - 1)
                    continue;
                System.out.println("No Username that You Want Sreach !!! ");
            }
        }
    }


}
