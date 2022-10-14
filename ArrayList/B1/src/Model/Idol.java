package Model;

import java.util.ArrayList;

public class Idol {
    private String fullName;
    private String email;
    private ArrayList<Follower> followers;

    public Idol(String fullName, String email, ArrayList<Follower> followers) {
        this.fullName = fullName;
        this.email = email;
        this.followers = followers;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return " -Idol Name: "+fullName+" -Email "+email+"\n -Followers:\n"+followers+"\n";
    }
}
