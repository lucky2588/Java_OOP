package view;

import model.Pet;
import model.Type;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public View() {
    }

    public void match(Scanner sc, ArrayList<Pet> listPet){
        System.out.println("Please give us some information about your pet");
        Pet petYour = new Pet();
        petYour.input(sc);
        System.out.println("Say Hi "+petYour.getFullName()+"\nNow,  We will find you a suitable friend");
       endPro: for (int i = 0; i < listPet.size() ; i++){
            if(petYour.getType() == listPet.get(i).getType() && (listPet.get(i).isSex() != petYour.isSex())){
                System.out.println("===========Informaton About Our Pet========");
                System.out.println(listPet.get(i).toString());
                System.out.println("Do You Know Continue Look For Pet Other !!!  \n \t \t 1.Yes \t \t 2.No");
                String choose = sc.nextLine();
                switch (choose){
                    case "1":
                        break;
                    case "2":
                        break endPro;
                }
            }
        }


    }
}
