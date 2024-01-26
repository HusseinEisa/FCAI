package OOP;

import java.util.Objects;

public class DR extends Student {


    private String Dr_Name;
    private String Course_Name;

    public DR () {
        System.out.println("\nEnter your name please: ");
        Dr_Name = input.nextLine();
        System.out.println("\nEnter the course name pleas: ");
        Course_Name = input.nextLine();
    }


    public void Get_Operation() {
        System.out.println("\nPlease, Enter the number of the operation which you need from the following : ");
        System.out.println("\n  1) Show empty places \n  2) check a place \n  3) Login to a place \n  4) Logout from a place \n  5) Exit Program");
        System.out.print("\nThe number : ");
        setOperation(input.nextInt());
        if(getOperation() == 1){
            Show_Empty();
        }
        else if(getOperation() == 2){
            Check_Empty();
        }
        else if(getOperation() == 3){
            Login();
        }
        else if(getOperation() == 4){
            Logout();
        }
        else if (getOperation() == 5) {
            User = 3;
            return;
        }
        else {
            System.out.println("\nInvalid number");
            System.out.println("..............................................................");
        }
    }

    public void Get_Operation (int Operation){
        if(Operation == 1){
            //new DR();
            Login(getPlace());
        }
        else if(Operation == 2){
            Logout();
        }
    }

    public void Login() {
        Get_Place();
        if (Check[getPlace()]){
            System.out.println("\nSorry, but Dr."+Dr[getPlace()]+" in "+Places[getPlace()]+" now for course "+Course[getPlace()]);
            System.out.println("..............................................................");
        }
        else {
            Check[getPlace()] = true ;
            Dr[getPlace()] = Dr_Name;
            Course[getPlace()] = Course_Name;
            System.out.println("\nLogin to "+Places[getPlace()]+" is done, Sir");
            System.out.println("..............................................................");
        }
    }
    public void Login(int place) {
        //new DR() ;
        Check[place] = true;
        Dr[place] = Dr_Name;
        Course[place] = Course_Name;
        System.out.println("\nLogin to " + Places[place] + " is done, Sir");
        System.out.println("..............................................................");
    }

    public void Logout () {
        Get_Place();
        if (!Objects.equals(Dr[getPlace()], Dr_Name)){
            System.out.println("\nSorry, But you are not allowed to logout from "+Places[getPlace()]);
            System.out.println("..............................................................");
            return;
        }

        if (Check[getPlace()]){
            Check[getPlace()] = false ;
            Dr[getPlace()] = "No one";
            Course[getPlace()] = "Nothing";
            System.out.println("\nLogout from "+Places[getPlace()]+" is done, Sir");
            System.out.println("..............................................................");
        }
        else {
            System.out.println("\nSorry, But "+Places[getPlace()]+" is already empty!!");
            System.out.println("..............................................................");
        }
    }

}
