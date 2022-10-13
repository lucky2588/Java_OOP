import java.util.Scanner;
//        Tạo 2 mảng để quản lý Movie và Series
//        In thông tin phim ra màn hình
//        Nhập vào từ khoá tiêu đề film và tìm phim theo tiêu đề ( tìm cả movie và series, tìm theo từ khoá)
//        In ra thông tin film có ranking thấp nhất (kiểm tra cả movie và series)
//        In ra tên đạo diễn của thể loại COMEDY có ranking thấp nhất
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       Film ab = new Film();
       Film abc = new Film();
//  Khởi tạo ra các đối tượng của 2 lớp Movie và Serries
        Movie m1 = new Movie("m1","Avatar","Khoa Hoc",3.3,180);
        Movie m2 = new Movie("m2","Fast and Furios","Hanh Dong",1.6,350);
        Movie m3 = new Movie("m3","The Lion King","Hoat Hinh",3.5,200);
        Movie m4 = new Movie("m4","The Caption","Khoa Hoc",3.1,250);
        Movie m5 = new Movie("m5","The End Game","Hai",3.0,280);
        Series s1 = new Series("s1","The Mouse","Tam Ly",2.0,18,135.5);
        Series s2 = new Series("s2","Ton Ngo Khong","Hai",4.6,36,45.5);
        Series s3 = new Series("s3","Ky Sinh Trung","Hai",2.5,30,25.5);
       // Tạo 2 mảng 1 chiều để lưu và quản lí 2 lớp
        Movie[] ArrayOne = new Movie[]{m1,m2,m3,m4,m5};
        Series[] ArrayTwo = new Series[]{s1,s2,s3};
        // in thông tin ra màn hình
        System.out.println("the odd movies on the list you can watch are : ");

        for (int i = 0; i < ArrayOne.length ; i++){
            System.out.println(ArrayOne[i]);
        }
    }
}
