package model;
import java.util.Scanner;
public class Book {
    private int id;
    private static int nextID=0;
    private String title;
    private String tacGia;
    private double soLuong;

    public Book(){
        nextID++;
        this.id = nextID;
    }

    public Book(String title, String tacGia, double soLuong) {
        this.title = title;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    public void input(Scanner sc){
        System.out.println("Import Title ");
        setTitle(sc.nextLine());
        System.out.println("Import fullName Tac Gia ");
        setTacGia(sc.nextLine());
        System.out.println("Import number Book in Libary !!! ");
        setSoLuong(sc.nextDouble());
        sc.nextLine();

    }

    @Override
    public String toString(){
        return "-"+getId()+"\t\t\t"+getTitle()+"\t\t "+getTacGia()+"\t\t\t"+getSoLuong();
    }
}
