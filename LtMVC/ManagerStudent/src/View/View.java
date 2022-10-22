package View;
import Model.Manager;
import Model.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class View {
    public View(){}
    public void display(Scanner sc, ArrayList<Student> listStudent, Manager manager) {
        boolean control = true;
        while (control) {
            System.out.println("\t \t =============Menu================");
            System.out.println("1.Import infor to List Student \n2.display Student from your Request (year of birth and hometown) \n3.Display Infor ListStudent of Class 10A1 \n4.Exit");
            System.out.println("Choose of You !! ");
            int Choose = sc.nextInt();
            switch (Choose) {
                case 1:
                    System.out.println("Import Numbers Student that You Want ADD infor in Class 10A1 ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i<=n-1;i++){
                        Student user = new Student();
                        System.out.println("Import Student "+(i+1));
                        user.inputInforAboutStudent(sc);
                        listStudent.add(user);
                        System.out.println("Add Success");
                    }
                    break;
                case 2:
                    if(!listStudent.isEmpty()) {
                        boolean controlCase2 = true;
                        while (controlCase2) {
                            System.out.println("Import A Littel Infor that people You want Look For and Display");
                            System.out.println("import Year");
                            int Year = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Import Address");
                            String address = sc.nextLine();

                            // Tạo 1 Phương thức  check đúng sai , khi năm sinh or quê quán ko ai trùng hoặc nhập bừa
                            if (manager.getClass10A1().checkCondition(listStudent, Year, address)) {
                                System.out.println(" display screen !!!!");
                                controlCase2 = false;
                                break;
                            } else {
                                System.out.println("No Student ,did you make a mistake? please re-enter !!!  ");
                            }
                        }
                    }else{
                        System.out.println("List Stundet not Menbers , please Input Information for Class 10A1  ");
                    }
                    break;
                case 3:
                    System.out.println("List Now of Class 10A1 that You Scan Infor ");
                    if (listStudent.size() == 0) {
                        System.out.println("List Student is Empty !!! ");
                    } else {
                        System.out.println("\t \t \t ============List Student of Class 10A1============");
                        for (int i = 0; i < listStudent.size(); i++) {
                            System.out.println(listStudent.get(i).toString());
                        }
                    }
                    break;
                case 4:
                    control = false;
                    break;
            }
        }

    }
}
