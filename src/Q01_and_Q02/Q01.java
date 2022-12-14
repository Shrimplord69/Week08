package Q01_and_Q02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q01 {
    public static void  main(String[]args){
        //User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in your name: ");
        String name = sc.nextLine();
        System.out.println("Please type in your address: ");
        String address = sc.nextLine();
        System.out.println("Please type in your age: ");
        int age = sc.nextInt();
        //create File
        PrintWriter pw = null;
        try{
            //check if the file already exist or not, then create it
            pw = new PrintWriter(new FileWriter("src/Q01_and_Q02/users.txt",true));
            //Write a string to the file
            pw.printf("%s, %s, %d",name,address,age);
            System.out.println("Successfully wrote to the file");
        }
        //will print out message if the block of code above running into error
        catch (IOException ioe){
            System.out.println("An error occurred!");
            //???
            ioe.printStackTrace();
        }
        //Close the file
        finally {
            if(pw != null)
               pw.flush();// this will help you safe your stuffs in case a crash happened
            pw.close();
        }
    }
}
