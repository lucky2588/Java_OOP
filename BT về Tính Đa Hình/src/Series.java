//** Tạo class Series kế thừa Film và có thêm thuộc tính:
//        số tập (int)
//        thời lượng trung bình (int) (tính theo phút)
public class Series extends Film{
    private int number_Episode;
    private double avt_TimeMovie;
    public Series(){
        super();
    };

    public Series(int number_Episode) {
        this.number_Episode = number_Episode;
    }

    public Series(String id, String title, String typeMovie, Double ranking, int number_Episode,double avt_TimeMovie) {
        super(id, title, typeMovie, ranking);
        this.number_Episode = number_Episode;
        this.avt_TimeMovie = avt_TimeMovie;
    }

    public int getNumber_Episode() {
        return number_Episode;
    }

    public void setNumber_Episode(int number_Episode) {
        this.number_Episode = number_Episode;
    }

    public double getAvt_TimeMovie() {
        return avt_TimeMovie;
    }

    public void setAvt_TimeMovie(double avt_TimeMovie) {
        this.avt_TimeMovie = avt_TimeMovie;
    }
}
