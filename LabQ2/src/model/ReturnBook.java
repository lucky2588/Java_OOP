package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBook {
    private static int nextId = 0;
    private int id;
    private User user;
    private Book book;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public ReturnBook() {
        nextId++;
        this.id = nextId;
    }

    public ReturnBook(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    public void input(Scanner sc, ArrayList<User> listUser, ArrayList<Book> listBook, ArrayList<ReturnBook> listBill,ReturnBook returnBook) {
        boolean control = true;
        endPro:
        while (control){
            // Tạo 2 biến để save đối tượng
            User userInReturnBook = new User();
            Book bookInReturnBook = new Book();
            System.out.println("List User now " + listUser.size());
            System.out.println("ID\t\t\t Username \t\t\tAddress");
            // Duyệt và đọc các phần tử trong List User
            for (int i = 0; i < listUser.size(); i++){
                System.out.println(listUser.get(i).toString());
            }
            System.out.println("Enter the id of the person who borrows the book");
            int checkID = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < listUser.size(); i++) {
                if (checkID == listUser.get(i).getId()) {
                    userInReturnBook = listUser.get(i);
                    returnBook.setUser(userInReturnBook);
                    break;
                } else {
                    if (i < listUser.size() - 1)
                        continue;
                    System.out.println("Do not look for ID of People !! ");
                    control = false;
                    break;
                }
            }
            System.out.println("To Continue .... Please Import ID of Book that people want Borrows, " +
                    " Beacasue Book in Store is expensive and rare so " +
                    "One People Only Borrows One Book!!");
            System.out.println("List Book Now"+listBook.size());
            System.out.println("ID \t\t\t Title \t\t\t\t\tAuthor\t\t\t\t\tNumber in Store ");
            for (int i = 0; i < listBook.size(); i++) {
                System.out.println(listBook.get(i).toString());
            }
            System.out.println("Import ID of Book that People Want Borrows :) ");
            int checkId = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < listBook.size(); i++){
                if(checkId == listBook.get(i).getId()){
                    if(listBook.get(i).getSoLuong() > 0){
                        bookInReturnBook = listBook.get(i);
                        returnBook.setBook(bookInReturnBook);
                        listBook.get(i).setSoLuong(listBook.get(i).getSoLuong()-1.0);
                    }else{
                        System.out.println("The book in the library has been borrowed @@ ");
                        System.out.println("BACK to Sreceen Main and Create New Bill with New Book Other  =)))) ");
                        break endPro;
                    }
                    break;
                }else{
                    if(i < listBook.size()-1)
                        continue;
                    System.out.println("Not ID Book , @@ ");
                    System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    control = false;
                    break;
                }
            }
            System.out.println("Import Day Borrows Book ? ");
            int dayBorrows = sc.nextInt();
            System.out.println("Import Month Borrows Book ? ");
            int monthBorrows = sc.nextInt();
            LocalDate localDate = LocalDate.of(2022,monthBorrows,dayBorrows);
            returnBook.setNgayMuon(localDate);
            returnBook.setNgayTra(localDate.plusDays(10));
            listBill.add(returnBook);
            control = false;
            break;
            }
        }

    @Override
    public String toString() {
        return "\n-"+getId()+"\t\t\t"+getUser().getFullName()+"\t\t\t "+getBook().getTitle()+"\t\t\t "+getNgayMuon();
    }
}
