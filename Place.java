package OOP;

import java.util.Objects;
import java.util.Scanner;

public class Place {

    // Define word "input" to take the input from user
    Scanner input = new Scanner(System.in);



    public static boolean[] Check = {false, false, false, false, false, false, false, false, false, false, false};

    public static String[] Places = {"Plaza_1","Plaza_2","Seminar","Hall_1","Hall_2","Lab_1","Lab_2","Lab_3","Lab_4","Lab_5","Lab_6"};

    public static String[] Dr = {"No one","No one","No one","No one","No one","No one","No one","No one","No one","No one","No one"};

    public static String[] Course = {"Nothing","Nothing","Nothing","Nothing","Nothing","Nothing","Nothing","Nothing","Nothing","Nothing","Nothing"};


    public static int User=0;

    private int Place=0;

    public int getPlace() {return Place;}

    public void setPlace(int place) {
        Place = place;
    }


    public void Get_Place() {
        System.out.println("\nPlease enter the number of the place : ");
        System.out.println("\n 1) Plaza_1 \n 2) Plaza_2 \n 3) Seminar \n 4) Hall_1 \n 5) Hall_2 \n 6) Lab_1 \n 7) Lab_2 \n 8) Lab_3 \n 9) Lab_4 \n 10) Lab_5 \n 11) Lab_6 ");
        System.out.print("\nThe number : ");
        setPlace(input.nextInt());
        Place--;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n............... Welcome to our Program (^_^) ...............");
        while (true) {
            while (true) {
                if (User == 0){}
                else if ( User == 1) {
                    new Student().Get_Operation();
                } else if (User == 2) {
                    new DR().Get_Operation();
                } else if (User == 3) {
                    System.out.println("\n.......... Goodbye, see you later (^_^) .........."); return;
                } else {
                    System.out.println("\nInvalid input. Please try again!!");
                    System.out.println("..............................................................");}
                System.out.println("\n\nPlease Choose 1 or 2 or 3 : ");
                System.out.println("  1) You are a student \n  2) You are a Dr \n  3) Exit Program");
                System.out.print("The number : ");
                User = input.nextInt();
                if (User == 1) {
                    new Student().Get_Operation();
                } else if (User == 2) {
                    new DR().Get_Operation();
                } else if (User == 3) {
                    System.out.println("\n.......... Goodbye, see you later (^_^) .........."); return;
                } else {
                    System.out.println("\nInvalid input. Please try again!!");
                    System.out.println("..............................................................");}}}}



}
