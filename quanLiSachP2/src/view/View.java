package view;

import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public View() {
    }

    public void display(Scanner sc, ArrayList<Book> listBook) {
        boolean control = true;
        while (control) {
            System.out.println("======Menu=====");
            System.out.println("\t \t \t \t Note : Please make sure to enter information for books in the library ");
            System.out.println("1.Input Book in Library");
            System.out.println("2.Get infor All of Book in Library ");
            System.out.println("3.Look for book base on Category ");
            System.out.println("4.Sort books by page number");
            System.out.println("5.Sort books by publication year ");
            System.out.println("6.Exit ");
            System.out.println("Choose of You :");
            int choose = sc.nextInt();
            sc.nextLine();
            endPro:
            switch (choose) {
                case 1:
                    boolean controlInCase1 = true;
                    while(controlInCase1){
                        Book book = new Book();
                        book.input(sc);
                        listBook.add(book);
                        System.out.println("ADD Information to Book Successful ");
                        System.out.println("Do You Know ADD Book ? \t 1.Yes \t \t 2.No");
                        int decision = sc.nextInt();
                        sc.nextLine();
                        switch (decision){
                            case 1:
                                break;
                            case 2:
                                controlInCase1 = false;
                                break;
                        }
                    }
                    break;
                // done Fucition 1
                case 2:
                    displayBook(sc, listBook);
                    break;
                case 3:
                    if (!listBook.isEmpty()) {
                        lookforBook(sc, listBook);
                    } else {
                        System.out.println("\t\tList Book is Empty !!!!! , please Enter infor book to List");
                    }
                    break;
                case 4:
                    if (!listBook.isEmpty()) {
                        shortPageNumber(listBook);
                    } else {
                        System.out.println("\t \tList Book is Empty !!!!! , please Enter infor book to List");
                    }
                    break;
                case 5:
                    if(!listBook.isEmpty()){
                        shortYearRealsea(listBook);
                    }else{
                        System.out.println("\t \t \t List Book is Empty !!!!! , please Enter infor book to List ");
                    }
                    break;
                case 6:
                    control = false;
                    break;
                default:
                    System.out.println("Input Numbers Other !!! ");
            }
        }
    }

    // chức năng 2
    public void displayBook(Scanner sc, ArrayList<Book> listBook) {
        if (listBook.isEmpty()) {
            System.out.println("Please Input Book for library before Action Fuciton !!!!! ");
        } else {
            System.out.println("List Book now Have " + listBook.size() + " Book , It is ");
            for (int i = 0; i < listBook.size(); i++) {
                System.out.println(listBook.get(i).toString());
            }
        }
    }

    // chức năng 3 :
    public void lookforBook(Scanner sc, ArrayList<Book> listBook){
        System.out.println("Enter Category that you want look for ");
        String theLoai = sc.nextLine();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getCateroty().contains(theLoai)) {
                System.out.println("-"+ listBook.get(i).getTitle() + "\t \t Category: " + listBook.get(i).getCateroty());
            }else{
                if(i < listBook.size()-1)
                    continue;
                    System.out.println("No book for Category that you Want Look for @@ ");
                }
            }
        }


    // Chức nắng 4 : Sắp xếp theo số trang
    public void shortPageNumber(ArrayList<Book> listBook) {
        // ADD các thuộc tính vào 1 list hàm 1 chiều để xét
        int shortNumberPage[] = new int[listBook.size()];
        for (int i = 0; i < listBook.size(); i++) {
            shortNumberPage[i] = listBook.get(i).getPage_number();
        }
        // Sắp xếp theo thứ tự sử dụng hàm 1 chiều
        for (int i = 0; i < shortNumberPage.length - 1; i++) {
            for (int j = shortNumberPage.length - 1; j > i; j--) {
                if (shortNumberPage[j] < shortNumberPage[j - 1]) {
                    int x = shortNumberPage[j];
                    shortNumberPage[j] = shortNumberPage[j - 1];
                    shortNumberPage[j - 1] = x;
                }
            }
        }
        // Duyệt Phần Tử
        System.out.println("\t ==========Sort by Number Page Base from short to long=========");
        System.out.println("Location\t\t\tnameBook \t \t \tLength ");
        for (int i = 0; i < shortNumberPage.length; i++) {
            for (int j = 0; j < listBook.size(); j++) {
                if (shortNumberPage[i] == listBook.get(j).getPage_number())
                    System.out.println("\t"+(i + 1)+"\t \t \t"+listBook.get(j).getTitle() + "\t \t \t" + shortNumberPage[i] + " Page");
                continue;
            }
        }
    }
    // Chức nắng 5 :
    public void shortYearRealsea(ArrayList<Book> listBook){
        int shortYearRealease[] = new int[listBook.size()];
        //Gắn Giá trị
        for (int i = 0; i < listBook.size();i++){
            shortYearRealease[i] = listBook.get(i).getRelease_year();
        }
        // Dùng thuật toán để Sắp Xếp
        for (int i = 0; i <shortYearRealease.length-1;i++){
            for (int j = shortYearRealease.length-1; j >i; j--){
                if(shortYearRealease[j] < shortYearRealease[j-1]){
                    int x = shortYearRealease[j];
                    shortYearRealease[j] = shortYearRealease[j-1];
                    shortYearRealease[j-1] = x;
                }
            }
        }
        // Duyệt phần tử trong Mảng đã qua Sắp Xếp
        System.out.println("\t===========Sort by Year Realease  Base from short to long===========");
        System.out.println("Location\t\t\tnameBook \t \t \tYear Realease ");
        for (int i = 0; i <shortYearRealease.length;i++){
            for (int j = 0; j < listBook.size() ; j++){
                if(shortYearRealease[i] == listBook.get(j).getRelease_year())
                    System.out.println("\t"+(i+1)+"\t \t \t"+listBook.get(j).getTitle()+" \t \t \t"+listBook.get(j).getRelease_year());
                continue;
            }
        }
    }

}






