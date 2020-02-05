package com.game;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Player
{
     static String name;
    static int age;
    static String bDate;
    static String gender;
     static int i;
    static String cond[]={"true","true","true"};
    static Scanner s=new Scanner(System.in);
    static int moves;
    public Player()
    {
        System.out.println("enter your name:");
        name=s.nextLine();
        System.out.println("enter your age:");
        age=s.nextInt();
        System.out.println("enter your birth date:");
        bDate=s.next();
        System.out.println("enter your gender:");
        gender=s.next();
        intro();
    }

    public void intro()
    {
        System.out.println("Welcome to the Treasure....");
        System.out.println("you are a pirate named Jack.");
        System.out.println("You have to find 3 hidden treasure to complete the game.");
        System.out.println("Treasures are at 3 different places. ");
        System.out.println("Bravo!!! you have knife with you to tackle any situation...");
        choice();

    }
    public static void choice()
    {
        System.out.println("Select path to begin the hunt....");
        System.out.println("1.Forest"+"\n"+"2.River"+"\n"+"3.Mountain");
        i=s.nextInt();
        moves++;
        if(cond[0].equals("true")&&cond[1].equals("true")&&cond[2].equals("true")){
            if (i == 1) {
                System.out.println("You are following the direction by looking at map.");
                System.out.println("You are heading towards the forest.");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                Forest f=new Forest();
                f.forest();

            } else if (i == 2) {
                System.out.println("You are following the direction by looking at map.");
                System.out.println("You are heading towards the river.");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                River r=new River();
                r.river();

            } else if (i == 3) {
                System.out.println("You are following the direction by looking at map.");
                System.out.println("You are heading towards the mountain.");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                Mountain m=new Mountain();
                m.mountain();
            }else {
                choice();
            }
        }else if(cond[0].equals("false")&&cond[1].equals("true")&&cond[2].equals("true")){
            if (i == 1) {
                System.out.println("You have all ready completed this stage.");
                 choice();

            } else if (i == 2) {
                System.out.println("You are following the direction by looking at map.");
                System.out.println("You are heading towards the river.");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                River r=new River();
                r.river();

            } else if (i == 3) {
                System.out.println("You are following the direction by looking at map.");
                System.out.println("You are heading towards the mountain.");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                Mountain m=new Mountain();
                m.mountain();
            }else {
                choice();
            }

        }else if(cond[0].equals("false")&&cond[1].equals("false")&&cond[2].equals("true")){
            if (i == 1) {
                System.out.println("You have all ready completed this stage.");
                choice();

            } else if (i == 2) {
                System.out.println("You have all ready completed this stage.");
                choice();

            } else if (i == 3) {
                System.out.println("You are following the direction by looking at map.");
                System.out.println("You are heading towards the mountain.");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                Mountain m=new Mountain();
                m.mountain();
            }else {
                choice();
            }
        }else if(cond[0].equals("false")&&cond[1].equals("false")&&cond[2].equals("false")){
            win();

        }
    }

        public static void win(){
            System.out.println("Bravo!!! You have collected all the treasure...");
            System.out.println("Thank you!!!");
            System.out.println("Moves :"+moves);
            System.out.println("Name :"+name);
        }


}
