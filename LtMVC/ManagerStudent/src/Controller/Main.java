package Controller;

import Model.Manager;
import Model.Student;
import Model.classStudent;
import View.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();
        classStudent class10A1  = new classStudent(); // vì chỉ có 1 lớp nên tạo trước ở ngoài và Add vào thuộc tính của người Quản Lí
        class10A1.setListStudent(listStudent);
        Manager user = new Manager();
        user.setClass10A1(class10A1);
        user.setKhoaHoc("Java Develop Web ");
        user.setKyhoc("2022- 2023");
        View view = new View(); // tạo 1 đối tượng View để gọi hàm hiện thị chức nắng
        view.display(sc, listStudent,user);


    }
}
