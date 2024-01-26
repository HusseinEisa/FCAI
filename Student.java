package OOP;

import java.util.Scanner;

public class Student extends Place {



    private int Operation;

    public int getOperation() {
        return Operation;
    }

    public void setOperation(int operation) {
        Operation = operation;
    }

    public void Get_Operation() {
        System.out.println("\nPlease, Enter the number of the operation which you need from the following : ");
        System.out.println("\n  1) Show empty places \n  2) check a place \n  3) Exit Program");
        System.out.print("\nThe number : ");
        Operation = input.nextInt();
        if(Operation == 1){
            Show_Empty();
        }
        else if(Operation == 2){
            Check_Empty();
        }
        else if (Operation == 3) {
            User = 3;
            return;
        }
        else {
            System.out.println("\nInvalid number");
            System.out.println("..............................................................");
        }
    }

    public void Check_Empty () {
        Get_Place();
        if (Check[getPlace()]){
            System.out.println("\nDr."+Dr[getPlace()]+" in "+Places[getPlace()]+" now for course "+Course[getPlace()]);
            System.out.println("..............................................................");
            System.out.println("\nPlease, Enter the number of the operation which you need from the following : ");
            System.out.println("\n 1) Check another place \n 2) Show empty places \n 3) Make another operation with Dr mode \n 4) Exit program");
            System.out.println("\nThe number : ");
            Operation = input.nextInt();
            if(Operation == 1){
                Check_Empty();
            } else if(Operation == 2){
                Show_Empty();
            } else if (Operation == 3) {
                User = 2;
                return;
            } else if (Operation == 4) {
                User = 3;
                return;
            } else {
                System.out.println("\nInvalid number");
                System.out.println("..............................................................");
            }
        }

        else {
            System.out.println("\n"+Places[getPlace()]+" is empty for now");
            System.out.println("..............................................................");
            System.out.println("\nPlease, Enter the number of the operation which you need from the following : ");
            System.out.println("\n 1) Login in this place as a Dr \n 2) Make another operation with student mode \n 3) Make another operation with Dr mode \n 4) Exit program");
            System.out.println("\nThe number : ");
            Operation = input.nextInt();
            if(Operation == 1){
                new DR().Login(getPlace());
            } else if(Operation == 2){
                User = 1;
                return;
            } else if (Operation == 3) {
                User = 2;
                return;
            } else if (Operation == 4) {
                User = 3;
                return;
            } else {
                System.out.println("\nInvalid number");
                System.out.println("..............................................................");
            }
        }
    }


    public void Show_Empty () {
        int Counter = 0;
        for (int i = 0; i < 11; i++) {
            if(!Check[i]){
                Counter++;}}
        System.out.println("\nThe number of empty places is: "+Counter);
        System.out.print("{");
        for (int i = 0; i < 11; i++) {
            if(!Check[i]){
                System.out.print(Places[i]+", ");}}
        System.out.println("}");
        System.out.println("..............................................................");
        System.out.println("\nPlease, Enter the number of the operation which you need from the following : ");
        System.out.println("\n 1) Make another operation with student mode \n 2) Make another operation with Dr mode \n 3) Exit program");
        System.out.println("\nThe number : ");
        Operation = input.nextInt();
        if(Operation == 1){
            User = 1;
            return;
        } else if (Operation == 2) {
            User = 2;
            return;
        } else if (Operation == 3) {
            User = 3;
            return;
        } else {
            System.out.println("\nInvalid number");
            System.out.println("..............................................................");}}


}
