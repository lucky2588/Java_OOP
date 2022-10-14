package Controller;

import Model.*;

import java.util.ArrayList;

//Tạo lớp Tiktok: các idols, các bài hát(Songs)
//Tạo 1 lớp Idol: name, id, email, followers(Những người theo dõi),
//(String) group
//Follower: name, id, email,(int) numberOfLike
//Song: Id, name,(String) singer
//
//-> Nhập thông tin cho các đối tượng tên và hiển thị lại kết quả ra ngoài màn hình
public class Main {
    public static void main(String[] args) {
        SongModel songModel = new SongModel();
        System.out.println("Import Song One ");
        Song song = songModel.input();
        System.out.println("Import Song Two ");
        Song song1 = songModel.input();
        // hiện thị ra bài hát
        //khai báo và add Các  bài hát vào thuộc tính của Tiktok.e chỉ ADD 2 bài vào đây để nhập gắn thôi ạ
        ArrayList<Song> songList = new ArrayList<>();
        songList.add(song);
        songList.add(song1);
        System.out.println(" Danh Sach Bai Hat Ban Vua Nhap ");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i));
        }
        // Khai báo các  Followes , rồi ADD vào lớp Idol
        FollowersModel follersADD = new FollowersModel();
        System.out.println("Import Flowers One ");
        Follower user1 = follersADD.input();
        System.out.println("Import Flowers Two");
        Follower user2 = follersADD.input();
        // ADD vào list 1 cho Idol 1
        ArrayList<Follower> listFollower1 = new ArrayList<>();
        listFollower1.add(user1);
        listFollower1.add(user2);
        //// ADD vào list 2 cho Idol 2
        System.out.println("Import Flowers Three ");
        Follower user3 = follersADD.input();
        System.out.println("Import Flowers Four ");
        Follower user4 = follersADD.input();
        ArrayList<Follower> listFollower2 = new ArrayList<>();
        listFollower2.add(user3);
        listFollower2.add(user4);
        //Tạo ra 2 idol và ADD vào list Tiktok
        IdolModel idolModel = new IdolModel();
        System.out.println("Import Information of Idol 1 ");
        Idol idol1 = idolModel.input(listFollower1);
        System.out.println("Import Information of Idol 2 ");
        Idol idol2 = idolModel.input(listFollower2);
        ArrayList<Idol> listIdol = new ArrayList<>();
        listIdol.add(idol1);
        listIdol.add(idol2);
        // set 2 list bài hát và các idol vào lớp Tiktok
        Tiktok tiktok1 = new Tiktok(listIdol, songList);
        System.out.println(tiktok1.toString());
    }
}
