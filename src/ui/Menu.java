package ui;

import haikuanalysis.HaikuPoem;
import data.FileReader;

import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;
    private FileReader fileReader = new FileReader();

    public Menu(){
        this.inputFromUser = new Scanner(System.in);
    }

    public void welcomeUser() {
        System.out.println("Welcome to the haiku analysis application");
    }

    public HaikuPoem poemPromt(){
        System.out.println("Write your name");
        String name = inputFromUser.nextLine();
        System.out.println("Write the first line of the haiku poem");
        String firstLineOfHaiku = inputFromUser.nextLine();
        System.out.println("Write the second line of the haiku poem");
        String secondLineOfHaiku = inputFromUser.nextLine();
        System.out.println("Write the third line of the haiku poem");
        String thirdLineOfHaiku = inputFromUser.nextLine();
        System.out.println(fileReader.getLastId());
        HaikuPoem haikuPoem = new HaikuPoem(name, fileReader.getLastId(), firstLineOfHaiku, secondLineOfHaiku,thirdLineOfHaiku);
        return haikuPoem;
    }

}
