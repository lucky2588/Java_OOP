package Model;
import java.util.ArrayList;
//Tạo lớp Tiktok: các idols, các bài hát(Songs)
//        Tạo 1 lớp Idol: name, id, email, followers(Những người theo dõi),
//        (String) group
//        Follower: name, id, email,(int) numberOfLike
//        Song: Id, name,(String) singer
//        -> Nhập thông tin cho các đối tượng tên và hiển thị lại kết quả ra ngoài màn hình
public class Tiktok {
    private ArrayList<Idol> idol;
    private ArrayList<Song> song;
    public Tiktok(ArrayList<Idol> idol, ArrayList<Song> song) {
        this.idol = idol;
        this.song = song;
    }
    public ArrayList<Idol> getIdol() {
        return idol;
    }
    public void setIdol(ArrayList<Idol> idol) {
        this.idol = idol;
    }
    public ArrayList<Song> getSong() {
        return song;
    }
    public void setSong(ArrayList<Song> song) {
        this.song = song;
    }
    @Override
    public String toString() {
        return "Nhung Idol tren Tiktok " + idol + "\nCac Bai Hat Tren Tiktok: \n " + song;
    }
}
