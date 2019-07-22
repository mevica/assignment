package question1;

import java.util.Scanner;

public class Validate {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         String user,pass;
        System.out.println("Enter your name");
        user=input.nextLine();

        System.out.println("enter your password");
        pass=input.nextLine();

        if(user.equals("ndanu")&&(pass.equals("0123"))){
            System.out.println("welcome ndanu");
        }else{
            System.out.println("you entered wrong details");
        }
    }
}
