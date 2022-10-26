package controller;
import model.Pet;
import model.Type;
import view.View;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> listPet = new ArrayList<>();
        Pet D1 = new Pet("Lucky","Domestic Dog",5,true,"fat", Type.DOG,"Red");
        Pet D2  = new Pet("Micky","Domestic dog",8,false,"normal", Type.DOG,"Black");
        Pet D3  = new Pet("Daddy","domestic dog",6,true,"thin", Type.DOG,"Yellow");
        Pet D4  = new Pet("Zero","domestic dog",3,false,"fat", Type.DOG,"Oliver");
        Pet C1  = new Pet("Tom","Home Cat",3,true,"thin", Type.CAT,"Yellow");
        Pet C2  = new Pet("Jenny","home Cat",3,false,"fat", Type.CAT,"Oliver ");
        Pet C3  = new Pet("Ovantin","Home Cat",3,false,"fat", Type.CAT,"Smoker");
        Pet C4  = new Pet("Monkey","Home Cat",3,true,"thin", Type.CAT,"Yellow");
        listPet.add(D1);listPet.add(D2);listPet.add(D3);listPet.add(D4);
        listPet.add(C1);listPet.add(C2);listPet.add(C3);listPet.add(C4);
        View view = new View();
        view.match(sc,listPet);
        System.out.println("End Program !!!!!!! ");
    }
    
}
