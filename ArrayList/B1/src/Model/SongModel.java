package Model;

import java.util.Scanner;

public class SongModel {
    Scanner sc = new Scanner(System.in);
public Song input(){
Song song = new Song();
    System.out.println("Import Name Song ");
    String fullName=sc.nextLine();
    System.out.println("Import ID ");
    String id =sc.nextLine();
    System.out.println("Import Singler : ");
    String singer = sc.nextLine();
    song.setFullName(fullName);
    song.setId(id);
    song.setSinger(singer);
return song;
}
}
