package view;
import model.Stundent;
import java.util.ArrayList;
import java.util.Scanner;
public class View {
    public View() {
    }
    public void inputStudent(Scanner sc,ArrayList<Stundent> listStudent){
        boolean control = true;
        while(control) {
            Stundent user = new Stundent();
            user.input(sc);
            listStudent.add(user);
            System.out.println("Do You Want Create Student New");
            System.out.println("1. Yes \t \t 2.No");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    break;
                case "2":
                    System.out.println("List that You Scan have "+listStudent.size()+" Student");
                    for (int i = 0; i < listStudent.size(); i++) {
                        System.out.println(listStudent.get(i).toString());
                    }
            control = false;
            break;
        }
            }
        }
    }

