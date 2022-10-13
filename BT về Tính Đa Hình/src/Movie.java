//*Tạo class Movie kế thừa Film và có thêm thuộc tính:
//        thời lượng (int) (tính theo phút)
public class Movie extends Film{
    private int timeMovie;

    public Movie() {
        super();
    }

    public Movie(int timeMovie) {
        this.timeMovie = timeMovie;
    }

    public Movie(String id, String title, String typeMovie, Double ranking, int timeMovie) {
        super(id, title, typeMovie, ranking);
        this.timeMovie = timeMovie;
    }

    public int getTimeMovie() {
        return timeMovie;
    }

    public void setTimeMovie(int timeMovie) {
        this.timeMovie = timeMovie;
    }
//    public void input(){
//        System.out.printf("Name Movie : %s \t type : %s \t Ranking : %f \t Total Time : %d"+super.getTitle(),super.getTypeMovie(),super.getRanking(),timeMovie);
//    }
}
