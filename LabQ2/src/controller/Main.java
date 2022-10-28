package controller;
import model.Book;
import model.ReturnBook;
import model.User;
import view.View;
//**Giúp Hương phân tích và thiết kế một chương trình quản lý sách trong Techmaster. Chương trình thực hiện các nhiệm vụ sau:
//▪ Nhiệm vụ 1 - Quản lý sách: Cho phép thêm, xóa, sửa đổi, thông tin về các sách trong Techmaster.
// Một quyển gồm: Id, name, chủ đề, tác giả, số lượng còn trong thư viện.
//▪ Nhiệm vụ 2 - Quản lý người đọc: Cho phép thêm, xóa, sửa đổi, tìm kiếm thông tin về người đọc trong thư viện.
// Người đọc gồm: Id, name, số điện thoại, địa chỉ.
//▪ Nhiệm vụ 3 - Quản lý mượn trả sách: Cho phép tạo phiếu mượn sách, và cho phép người đọc trả sách., xem các Phiếu Mượn
// Thông tin về phiếu mượn sách bao gồm: người mượn, sách được mượn, ngày mượn, ngày hạn phải trả
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> listUser= new ArrayList<>();
        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<ReturnBook> listBill = new ArrayList<>();
        View view = new View();
        view.display(sc,listBook,listUser,listBill);
        System.out.println("  End Program !!!!!");

    }
}
