package controller;

import model.Book;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

//*Viết chương trình quản lý sách gồm các thông tin id, title, category, author, page_number, release_year, với category là một mảng String. Thực hiện các công việc sau:
//
//Lấy thông tin toàn bộ sách
//Tim sách theo tên
//Tìm sách theo thể loại
//Sắp xếp sách theo số trang
//Sắp xếp sách theo năm xuất bản */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> listBook = new ArrayList<>();
        View view = new View();
        view.display(sc, listBook);
        System.out.println("End Program !!!!!!!!! ");
    }
}
