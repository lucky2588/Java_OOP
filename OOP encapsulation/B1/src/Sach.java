import java.util.Locale;
import java.util.Scanner;

/**Viết chương trình quản lý sách. Biết sách gồm các thông tin sau: mã sách, tên sách, tác giả,
 *  thể loại, nhà xuất bản, năm xuất bản. Thực hiện:
 Tạo mảng để quản lý sách
 Tìm sách theo tên
 Tìm sách theo thể loại
 Liệt kê các sách xuất bản trong năm nay
 */
public class Sach{
    private String tenSach;
    private String maSach;
    private String tacGia;
    private String theLoai;
    private String nxb;
    private int namXB;
    // Khởi tạo contrucstor mặc định
    public Sach(){}
    public Sach(String tenSach,String maSach, String tacGia, String theLoai, String nxb, int namXB) {
        this.maSach = maSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.nxb = nxb;
        this.namXB = namXB;
        this.tenSach = tenSach;
    }
    // Dùng phương thức Setter và Getter để nhận và sử dụng giá trị , vì các thuộc tính đang để private

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach(){
        tenSach=tenSach.toUpperCase(Locale.ROOT);
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        tacGia=tacGia.toUpperCase(Locale.ROOT);
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        theLoai=theLoai.toUpperCase(Locale.ROOT);
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNxb(){
        nxb=nxb.toUpperCase(Locale.ROOT);
        return nxb;
    }

    public void setNxb(String nxb){
        this.nxb = nxb;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-Import Name Book:");
        setTenSach(sc.nextLine());
        System.out.println("-Import ID of Books:");
        setMaSach(sc.nextLine());
        System.out.println("-Nhap ten Tac Gia:");
        setTacGia(sc.nextLine());
        System.out.println("-The Loai:");
        setTheLoai(sc.nextLine());
        System.out.println("-Nam Xuat Ban : ");
        setNamXB(sc.nextInt());
        System.out.println("-Nha Xuat Ban :");
        setNxb(sc.nextLine());
        sc.nextLine();
    }
    @Override
    public String toString() {
        return "Sach{" +
                "tenSach='" + tenSach + '\'' +
                ", maSach='" + maSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", nxb='" + nxb + '\'' +
                ", namXB=" + namXB +
                '}';
    }
}
