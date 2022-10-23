package controller;
/**Class Student: id, name, scoreMath(điểm môn toán), scorePhysic, scoreChemistrys
 Tạo ra các object student bằng cách nhập giá trị cho các trường trên từ bàn phím
 Hiển thị thông tin các học sinh vừa nhập vào: tên – avg score( điểm trung bình các môn) – xếp loại:
 Avg score >=8 : xếp loại A
 Avg score <8 và >=6.5 : xếp loại B
 Avg score <6.5 : xếp loại C
 Tính % từng loại học sinh */
import model.Student;
import view.View;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();
        View view = new View();
          view.displayFucion(sc,listStudent);
    }
}
