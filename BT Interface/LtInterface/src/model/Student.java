package model;

import java.util.Scanner;

public class Student implements IavgPoint {
    private int id;
    private static int NextId;
    private String fullName;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistrys;

    public Student() {
        NextId++;
        this.id = NextId;
    }

    public Student(int id, String fullName, double scoreMath, double scorePhysic, double scoreChemistrys) {
        this.id = id;
        this.fullName = fullName;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistrys = scoreChemistrys;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistrys() {
        return scoreChemistrys;
    }

    public void setScoreChemistrys(double scoreChemistrys) {
        this.scoreChemistrys = scoreChemistrys;
    }

    @Override
    public double avgPoint() {
        double pointAvg = (this.scoreMath + this.scoreChemistrys + this.scorePhysic)/3.0;
        return pointAvg;
    }
    public String rank(Student user){
        String rank ="";
        if(user.avgPoint() > 8.0) {
            rank = "A";
        }else if(user.avgPoint() > 6.5 && user.avgPoint() < 8.0){
            rank ="B";
        }else{
            rank ="C";
        }
        return rank;
        }
        /// Tạo các Phương Thức Thực hiện chức năng
    public void input(Scanner sc){
        System.out.println("Import FullName: ");
        setFullName(sc.nextLine());
        System.out.println("Import scoreMath ");
        setScoreMath(sc.nextDouble());
        System.out.println("Import scorePhysic ");
        setScorePhysic(sc.nextDouble());
        System.out.println(" Import scoreChemistrys ");
        setScoreChemistrys(sc.nextDouble());
    }
public void displayInfor(Student user){
    System.out.println("\n"+getId()+".FullName: "+getFullName()+"\t AvgPoint: "+user.avgPoint());
}
public void displayRank(Student user){
    System.out.println("Rank of You =>>> ");
    System.out.println(user.rank(user));
}

    }



