package com.game;

import java.util.Scanner;

public class Forest implements Strategies,Obstacles {

    static int playerHp=10;
    Scanner s=new Scanner(System.in);
    int i;

    public Forest() {

    }

    public void forest()
    {
        System.out.println("Now,you are in forest.");
        System.out.println("Caution!!!Keep your eyes open anything can happen....");
        System.out.println("walking...."+"\n"+"walking...."+"\n"+"walking....");
        System.out.println("Your energy level is low due to walking for long time...");
        playerHp=5;
        obstacles1();



    }

    @Override
    public void Strategies() {
        System.out.println("Are sure about attack?");
        System.out.println("1. Yes"+"\n"+"2. No");
        i=s.nextInt();
        if(i==1){
            Player.moves++;
            System.out.println("you are attacking on lion with knife...");
            if(playerHp==10){
                playerHp=playerHp-4;
                System.out.println("You attacked the lion"+"\n"+"And give damage of 4.");
                System.out.println("Bravo!!! Lion got scared and run away");
                System.out.println("Finally you managed to get rid from lion...");
                System.out.println("That was terrific experience...");
                System.out.println("Now heading towards the treasure...");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("Great!!! You got the first treasure...");
                Player.cond[0]="false";
                Player.choice();
            }else{
                System.out.println("Your got beaten by lion because of low health...."+"\n"+"You got attacked by lion");
                System.out.println("Game Over"+"\n"+"Better luck next time...");
                Player.choice();
            }

        }else if(2==0){
            Player.moves++;
            System.out.println("Choose Other option");
            obstacles2();

        }else{
            Strategies();
        }

    }

    @Override
    public void obstacles1() {
        System.out.println("Ohh!!! Delicious fruits...."+"\n"+"Would you like to eat some fruit?");
        System.out.println("1. Yes"+"\n"+"2. No");
        i=s.nextInt();
        Player.moves++;
        if(i==1)
        {
            playerHp=10;
            System.out.println("Wow!!!"+"\n"+"Yummy!!!!");
            System.out.println("Feeling energetic. "+"\n"+"Player health is :"+playerHp);
            System.out.println("Now heading towards the treasure...");
            System.out.println("walking.....");
            System.out.println("walking.....");
            System.out.println("walking.....");
            System.out.println("Shush!!! Don't move...."+"\n"+"What is that weird sound coming from the bushes???");
            System.out.println("Oh God!!! That is king of forest the Lion...."+"\n"+"What would you like to do now?");
            obstacles2();
        }else if(i==2){
            System.out.println("Oops!!!");
            System.out.println("Your health is low."+"\n"+"Player health is :"+playerHp);
            System.out.println("Now heading towards the treasure...");
            System.out.println("walking.....");
            System.out.println("walking.....");
            System.out.println("walking.....");
            System.out.println("Shush!!! Don't move...."+"\n"+"What is that weird sound coming from the bushes???");
            System.out.println("Oh God!!! That is king of forest the Lion...."+"\n"+"What would you like to do now?");
            obstacles2();
        }else{
            obstacles1();
        }

    }

    @Override
    public void obstacles2() {

        System.out.println("1. Run"+"\n"+"2. Attack");
        i=s.nextInt();
        if(i==1){
            Player.moves++;
            System.out.println("You have chosen to Run...");
            System.out.println("Running...."+"\n"+"Running...."+"\n"+"Running...."+"\n"+"Running....");
            if(playerHp==10){
                System.out.println("Finally you managed to get rid from lion...");
                System.out.println("That was terrific experience...");
                System.out.println("Now heading towards the treasure...");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("walking.....");
                System.out.println("Great!!! You got the first treasure...");
                Player.cond[0]="false";
                Player.choice();

            }else{
                System.out.println("Your getting slow because of low health...."+"\n"+"You got attacked by lion");
                System.out.println("Game Over"+"\n"+"Better luck next time...");
                Player.choice();
            }

        }else if(i==2){
            Player.moves++;
            Strategies();

        }else{
            System.out.println("Please enter correct choice...");
            obstacles2();
        }

    }
}
