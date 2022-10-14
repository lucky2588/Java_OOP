package Model;

public class Song{
    private String id;
   private String fullName;
    private String singer;
    public Song(){};

    public Song(String id, String fullName, String singer) {
        this.id = id;
        this.fullName = fullName;
        this.singer = singer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "-"+id+". Name Song:"+fullName+" -Singer:"+singer+"\n";
    }
}
