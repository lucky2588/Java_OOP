package view;
import model.Book;
import model.ReturnBook;
import model.User;
import java.util.ArrayList;
import java.util.Scanner;
public class View {
    public View() {
    }
    public void display(Scanner sc, ArrayList<Book> listBook, ArrayList<User> listUser, ArrayList<ReturnBook> listBill) {
        boolean control = true;
        while (control) {
            System.out.println("\t\t\t\t\t\t\t\t\t=====Fucion=====");
            System.out.println("\t\t\t1.Manager Book \t\t\t 2.Manager User \t\t\t 3.Manager Return Book \t\t\t4.Eixt ");
            System.out.println("=>>Your Choose: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("\t\t\t\t===Fucition of Manager Bookss===");
                    managerBook(sc, listBook);
                    break;
                case 2:
                    ViewManagerUser view = new ViewManagerUser();
                    view.display(sc, listUser);
                    break;
                case 3:
                    if (!listBook.isEmpty() && !listUser.isEmpty()) {
                        ViewReturnBoọk viewCase3 = new ViewReturnBoọk();
                        viewCase3.display(sc, listUser, listBook, listBill);
                    }else{
                        System.out.println("Please Input to Two List User (in Manager User) and Book (in Manager Book) before Use This Function !!! ");
                        System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    }
                    break;
                case 4:
                    control = false;
                    break;
            }
        } //break end
    }

    // Chức năng 1 :
    public void managerBook(Scanner sc, ArrayList<Book> listBook) {
        boolean control = true;
        while (control) {
            System.out.println("1.Input Book \t\t\t\t 2.Detele Book \t \t\t\t3.Update \t\t\t\t 4.output ListBook  \t\t\t\t 5.Exit");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    inputBook(sc, listBook);
                    break;
                case 2:
                    if (!listBook.isEmpty()) {
                        deleteBook(sc, listBook);
                    } else {
                        System.out.println("Input book before use Fucition !!! ");
                    }
                    break;
                case 3:
                    if (!listBook.isEmpty()) {
                        updateBook(sc, listBook);
                    } else {
                        System.out.println("Input book before use Fucition !!! ");
                    }
                    break;
                case 4:
                    if (!listBook.isEmpty()) {
                        showBook(listBook);
                    } else {
                        System.out.println("Input book before use Fucition !!! ");
                    }
                    break;
                case 5:
                    System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    control = false;
                    break;
            }
        }
    }

    // Chức năng 1 của manager Book
    public void inputBook(Scanner sc, ArrayList<Book> listBook) {
        boolean control = true;
        while (control) {
            Book book = new Book();
            book.input(sc);
            listBook.add(book);
            System.out.println("Input Sercess !!! ");
            System.out.println("Do You Want Continue Re-Enter Book ? \n1.Yes \t \t 2.No");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    break;
                case 2:
                    System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                    control = false;
                    break;
            }
        }
    }

    // chức năng 2 của Manager Book
    public void deleteBook(Scanner sc, ArrayList<Book> listBook) {
        System.out.println("Import Id of Book that you want Detele !! ");
        int idOfBook = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < listBook.size(); i++) {
            if (idOfBook == listBook.get(i).getId()) {
                listBook.remove(i);
                System.out.println("Delete Seccress !!! ");
            } else {
                if (i < listBook.size())
                    continue;
                System.out.println("No Have Book !!! ");
                System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
            }
        }
    }

    // Chức năng 3 của Manager Book
    public void updateBook(Scanner sc, ArrayList<Book> listBook) {
        System.out.println("Import Id of Book that you want Update ");
        int idOfBook = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < listBook.size(); i++) {
            if (idOfBook == listBook.get(i).getId()) {
                fucionUpdate(sc, listBook.get(i));
                System.out.println("Update Seccress !!! ");
            } else {
                if (i < listBook.size())
                    continue;
                System.out.println("\t\t\t\t\t BACK TO Home Screen.........");
                System.out.println("No Have Book !!! ");
            }
        }
    }

    //fucion Update
    public void fucionUpdate(Scanner sc, Book book) {
        System.out.println("Do You Want Update for .. \n 1.Name of Book \n 2. So Luong");
        System.out.println("=>> Choose:");
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                System.out.println("Import Name new for Book ");
                book.setTitle(sc.nextLine());
                System.out.println("Change Name Book !!! ");
                System.out.println("New Information of Book that You Change");
                System.out.println("ID \t\t\t Title \t\t\t\t\tAuthor \t\t\t\tNumbers");
                System.out.println(book.toString());
                break;
            case 2:
                System.out.println("Number old of Book " + book.getSoLuong());
                System.out.println("Enter Numbers new for Book: ");
                book.setSoLuong(sc.nextDouble());
                System.out.println("Change numbers of Book !!! ");
                System.out.println("After Update");
                System.out.println("ID \t\t\t Title \t\t\t\t\tAuthor \t\t\t\tNumbers");
                System.out.println(book.toString());
                break;
        }
    }

    // Chức năng 4 Case 1
    public void showBook(ArrayList<Book> listBook) {
        System.out.println("List Now have " + listBook.size());
        System.out.println("ID \t\t\t Title \t\t\tAuthor \t\tNumbers");
        for (int i = 0; i < listBook.size(); i++) {
            System.out.println(listBook.get(i).toString());
        }
    }

}
