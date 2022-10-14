package Model;
import java.util.ArrayList;
import java.util.Scanner;
public class IdolModel{
    Scanner sc = new Scanner(System.in);
    public IdolModel(){}
    //Tạo phương thức để nhập thông tin cho đối tượng ở Lớp Idol
public Idol input(ArrayList<Follower> listFlowers){
    System.out.println("Import Name Idol ");
    String fullName = sc.nextLine();
    System.out.println("Import email ");
    String email = sc.nextLine();
    Idol user1= new Idol(fullName,email,listFlowers);
    return user1;
}
}
