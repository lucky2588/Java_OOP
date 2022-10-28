package view;

import model.Book;
import model.ReturnBook;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewReturnBoọk {
    public ViewReturnBoọk() {
    }

    public void display(Scanner sc, ArrayList<User> listUser, ArrayList<Book> listBook, ArrayList<ReturnBook> listBill) {
        boolean control = true;
        while (control) {
            System.out.println("\t\t\t=======Function=====");
            System.out.println("1.Create receipt Get Book \t\t\t 2.Remove Receipt Book !! \t\t\t3.View List \t\t 4.Exit ");
            System.out.println("=> Choose of You ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    boolean controlCase1 = true;
                    while (controlCase1){
                        ReturnBook returnBook = new ReturnBook();
                        returnBook.input(sc, listUser, listBook, listBill, returnBook);
                        System.out.println("Do You Want Continue Create Bill borrows Book =)) \n 1.Yes \t\t 2.No");
                        int chooseCase1 = sc.nextInt();
                        switch (chooseCase1){
                            case 1:
                                break;
                            case 2:
                                controlCase1 = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    if (!listBill.isEmpty()) {
                        System.out.println("This is List of All Bill in Store , Do You Want Return bill ? please Enter Barcode of Bill ");
                        showListBill(listBill);
                        System.out.println("Import Barcode of Bill that you want Return ..... ");
                        int checkID = sc.nextInt();
                        sc.nextLine();
                        returnBill(checkID, listBook, listUser, listBill);
                    } else {
                        System.out.println("List Bill is Empty !!! Please Re-Enter resources in List Bill before Use this Function");
                        System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    }
                    break;
                case 3:
                    if (!listBill.isEmpty()) {
                        showListBill(listBill);
                    } else {
                        System.out.println("List Bill is Empty !!! Please Re-Enter resources in List Bill before Use this Function");
                        System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    }
                    break;
                case 4:
                    control = false;
                    break;
                default:
                    System.out.println("Import numbers Olther !!! ");
                    System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    break;
            }
        }
    }

    //Chức năng 3 :
    public void showListBill(ArrayList<ReturnBook> listBill) {
        System.out.println("List Now have : " + listBill.size());
        System.out.println("ID\t\t\t UserBorrows\t\t\t Book\t\t\t Date Borrows");
        for (int i = 0; i < listBill.size(); i++) {
            System.out.println(listBill.get(i).toString());
        }
    }

    // Chức năng 2 :
    // Chức năng 2 :
    public void returnBill(int checkID, ArrayList<Book> listBook, ArrayList<User> listUser, ArrayList<ReturnBook> listBill) {
        for (int i = 0; i < listBill.size(); i++) {
            if (checkID == listBill.get(i).getId()) {
                listBill.get(i).getBook().setSoLuong(listBill.get(i).getBook().getSoLuong() + 1.0);
                listBill.remove(listBill.get(i));
                System.out.println("Detele Bill Successful !!! ");
            } else {
                if (i < listBill.size() - 1)
                    continue;
                System.out.println("Not Bill have ID that you Enter !! Back to Screen Main to Input Once !!! ");
            }
        }
    }

}
