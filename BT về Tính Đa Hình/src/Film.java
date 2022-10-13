//**Tạo class Film gồm các thuộc tính:
////        id (String)
////        tiêu đề (String)
////        thể loại (enum: HORROR (kinh dị), COMEDY (hài hước), DOCUMENTATRY (tài liệu), bạn có thể bổ sung thêm )
////        ranking (double)
public class Film {
    private String id;
    private String title;
    private String typeMovie;
    private Double ranking;


    public Film(){};
    public Film(String id, String title, String typeMovie, Double ranking){
        this.id = id;
        this.title = title;
        this.typeMovie = typeMovie;
        this.ranking = ranking;
    }

    public String getId(){
        return id;
    }

    public void setId() {
        this.id =id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeMovie() {
        return typeMovie;
    }

    public void setTypeMovie(String typeMovie){
        this.typeMovie = typeMovie;
    }

    public Double getRanking() {
        return ranking;
    }

    public void setRanking(Double ranking) {
        this.ranking = ranking;
    }
}
