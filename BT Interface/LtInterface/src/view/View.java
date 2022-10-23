package view;
import model.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class View {
    public View() {
    }
    public void displayFucion(Scanner sc, ArrayList<Student> listStudent) {
        boolean control = true;
        while (control) {
            System.out.println("======Function=====");
            System.out.println("\t 1. Input Information Student \t \t 2. Display Information Student < FullName + Avg Srouce + Rank > \t \t 3.Exit ");
            System.out.println("==> Choose:");
            String choose = sc.nextLine();
            endPro:
            switch (choose) {
                case "1":
                    boolean controlInCase1 = true;
                    while (controlInCase1) {
                        Student user = new Student();
                        user.input(sc);
                        listStudent.add(user);
                        System.out.println("Add Information Successful");
                        System.out.println("Do you want to create more Student ?");
                        System.out.println("\t 1.Yes \t\t 2.No");
                        int chooseCase1 = sc.nextInt();
                        sc.nextLine();
                        switch (chooseCase1) {
                            case 1:
                                break;
                            case 2:
                                break endPro;
                        }
                    }
                    break;
                case "2":
                    if (listStudent.size() == 0) {
                        System.out.println("List Student is empty !! Please Input Student !! ");
                        break endPro;
                    } else {
                        double rankA = 0.0;
                        double rankB = 0.0;
                        double rankC = 0.0;
                        System.out.println("List Now have " + listStudent.size() + " Student ");
                        for (int i = 0; i < listStudent.size(); i++) {
                            listStudent.get(i).displayInfor(listStudent.get(i));
                            listStudent.get(i).displayRank(listStudent.get(i));
                            if (listStudent.get(i).rank(listStudent.get(i)).equals("A"))
                                rankA += 1.0;
                            if (listStudent.get(i).rank(listStudent.get(i)).equals("B"))
                                rankB += 1;
                            if (listStudent.get(i).rank(listStudent.get(i)).equals("C"))
                                rankC += 1;
                        }
                        double rateA = (rankA/(double) (listStudent.size()))*100.000;
                        double rateB = (rankB/(double) (listStudent.size()))*100.000;
                        double rateC = (rankC/(double) (listStudent.size()))*100.000;
                        System.out.println("Rate all Rank \nA :"+rateA+"%\nB :"+rateB+"%\nC "+rateC+"%");
                    }
                    break;
                case "3":
                    control = false;
                    System.out.println("  \t \t End Program !!!! ");
                    break;
            }
        }

    }
}

