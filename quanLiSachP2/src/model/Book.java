package model;

import java.util.Scanner;

//id, title, category, author, page_number, release_year, với category là một mảng String
public class Book {
    private int id;
    private static int nextID=0;
    private String title;
    private String cateroty;
    private int page_number;
    private int release_year;

    public Book() {
        nextID++;
        this.id = nextID;
    }

    public Book(String title, String cateroty, int page_number, int release_year) {
        this.title = title;
        this.cateroty = cateroty;
        this.page_number = page_number;
        this.release_year = release_year;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCateroty() {
        return cateroty;
    }

    public void setCateroty(String cateroty) {
        this.cateroty = cateroty;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }
    public void input(Scanner sc){
        System.out.println("Import FullName for Book");
        setTitle(sc.nextLine());
        System.out.println("Import cateroty");
        setCateroty(sc.nextLine());
        System.out.println("Import Page Number");
        setPage_number(sc.nextInt());
        sc.nextLine();
        System.out.println("Import realease year");
        setRelease_year(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public String toString(){
        return "\n \t "+getId()+". -Title: "+getTitle()+"\t -Cateroty: "+getCateroty()+"\t-Year: "+getPage_number()+"\t -Number of pages: "+getPage_number();
    }
}
