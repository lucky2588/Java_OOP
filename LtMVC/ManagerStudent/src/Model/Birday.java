package Model;

import java.util.Scanner;

public class Birday{
    private int day;
    private int month;
    private int year;

    public Birday() {
    }

    public Birday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        if( 0< day && day < 31){
            this.day = day;
        }else{
            System.out.println("Import Rset Day ");
            this.day = -1;
        }
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int month) {
        if(month >=0  && month <= 12){
            this.month = month;
        }else{
            this.month = -1;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year < 2023){
            this.year = year;
        }else{
            this.year = -1;
        }
    }

    @Override
    public String toString() {
        return " "+getDay()+"/"+getMonth()+"/"+getYear();
    }
    public void InputBirday(Scanner sc){
        System.out.println("Import Day ");
        int day = sc.nextInt();
        setDay(day);
        System.out.println("Import Month");
        int month = sc.nextInt();
        setMonth(month);
        System.out.println("Import Year ");
        int year = sc.nextInt();
        setYear(year);
        sc.nextLine();
    }
}
