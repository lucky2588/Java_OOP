package Model;
import java.util.Scanner;
public class FollowersModel {
    public FollowersModel(){}
    Scanner sc = new Scanner(System.in);
    public Follower input(){
    System.out.println("Import Names Followers");
    String fullName = sc.nextLine();
    System.out.println("Import ID ");
    String id = sc.nextLine();
    System.out.println("Numbers of Like");
    int soLike = sc.nextInt();
    sc.nextLine();
    System.out.println("Import Email of Followers");
     String email = sc.nextLine();
     Follower fl1= new Follower(fullName,id,email,soLike);
     return fl1;
}
}
