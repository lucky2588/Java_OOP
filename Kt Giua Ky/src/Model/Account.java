package Model;

import java.util.regex.Pattern;

public class Account {
    private String userName;
    private String passWord;
    private String email;
    public Account(){};
    public Account(String userName,String passWord){};
    public Account(String userName, String passWord,String email) {
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
