package controller;
import model.Stundent;
import view.View;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        View view = new View();
        ArrayList<Stundent> listStudent = new ArrayList<>();
        view.inputStudent(sc,listStudent);
        System.out.println("End Program !!! ");
    }
}
