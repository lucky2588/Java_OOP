package Model;

public class Follower{
private String fullName;
private String id;
private String email;
private int numberOfLike;

    public Follower(String fullName, String id, String email, int numberOfLike) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "\n -fullName: "+fullName+"\n Like: "+numberOfLike;
    }
}
