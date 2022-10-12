import java.util.Locale;
import java.util.Scanner;
/**
 * Viết chương trình quản lý sách. Biết sách gồm các thông tin sau: mã sách, tên sách, tác giả, thể loại, nhà xuất bản, năm xuất bản. Thực hiện:
 * <p>
 * Tạo mảng để quản lý sách
 * Tìm sách theo tên
 * Tìm sách theo thể loại
 * Liệt kê các sách xuất bản trong năm nay
 **/
public class B1_about_encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach book_1 = new Sach();
        Sach book_2 = new Sach();
        Sach book_3 = new Sach();
        Sach[] ArraySach = new Sach[]{book_1, book_2, book_3};
        // Duyệt và gắn giá trị trong mảng
        for (int i = 0; i < ArraySach.length; i++) {
            System.out.println("Import About Information Book " + (i + 1));
            ArraySach[i].input();
        }
        // Đọc dữ liệu nhập vào
        for (int i = 0; i < ArraySach.length; i++) {
            System.out.println(ArraySach[i].toString());
        }
        // Tìm tên sách theo tên
        System.out.println("Import name book I Want : ");
        String nameBook = sc.nextLine();
        nameBook=nameBook.toUpperCase(Locale.ROOT); // Xet Cùng 1 kiểu viết hao để ít trường hợp cần xét
        for (int i = 0; i < ArraySach.length; i++){
            if((ArraySach[i].getTenSach()).contains(nameBook)){
                System.out.println("Book You Want that available in library ");
                System.out.println(ArraySach[i].getTenSach());
            }else{
                System.out.println("book that you want is not available in library");
            }
        }
        System.out.println();

        // tìm Sách Theo Thể Loại
        System.out.println("Chon The Loai Ban Mun");
        String theLoai=sc.nextLine();
        theLoai = theLoai.toUpperCase(Locale.ROOT); // Đồng bộ 1 kiểu chữ in hoa
        for (int i = 0; i < ArraySach.length ; i++){
            if((ArraySach[i].getTheLoai()).contains(theLoai)){
                System.out.println(ArraySach[i].getTenSach());
            }else{
                System.out.println("Khong co sach nao cung the loai nay ");
            }
        }
        // Liệt kệ các sách xuất bản trong năm nay
        System.out.println("Ban muon Liet Ke cac Sach Trong Nam : ");
        int namXB = sc.nextInt();
        for (int i = 0; i < ArraySach.length; i++){
            if (ArraySach[i].getNamXB() == namXB){
                System.out.println("Co cuon Sach : "+ArraySach[i].getTenSach());
            }else{
                System.out.println("Khong Co Cuon Nao ");
            }
            }
        }
    }



