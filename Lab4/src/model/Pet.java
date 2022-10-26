package model;

import java.util.Scanner;

//Pet: id, name, species(giống loài), age, sex, description, TYPE, images (String)
//enum TYPE {DOG, CAT}
public class Pet {
    private int id;
    private int nextId=1;
    private String fullName;
    private String species;
    private int age;
    private boolean Sex;
    private String description;
    private Type type;
    private String images;

    public Pet(String fullName ,String species, int age, boolean sex, String description, Type type, String images) {
        nextId++;
        this.id=nextId;
        this.fullName = fullName;
        this.species = species;
        this.age = age;
        Sex = sex;
        this.description = description;
        this.type = type;
        this.images = images;
    }

    public Pet(){
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Pet(boolean sex, Type type) {
        Sex = sex;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n-Name Pet: "+getFullName()+"\n-Species: "+getSpecies()+"\n-Physical:"+getDescription()+"\n-Color:"+getImages()+"\nwith Sex: "+checkSex();
    }
    public String checkSex(){
     if(this.Sex){
         return "Man";
     }
     return "Famale";
    }
    public void input(Scanner sc){
        System.out.println("Name of Pet: ");
        setFullName(sc.nextLine());
        System.out.println("Sex of Pet: \n 1.Man \t \t 2. Famale");
        String sex = sc.nextLine();
        switch (sex){
            case "1":
                setSex(true);
                break;
            case "2":
                setSex(false);
                break;
        }
        System.out.println("TYPE ? \n 1.DOG \t \t \t 2.CAT ");
        String Type = sc.nextLine();
        switch(Type){
            case "1":
                setType(model.Type.DOG);
                break;
            case "2":
                setType(model.Type.CAT);
                break;
        }
    }

}
