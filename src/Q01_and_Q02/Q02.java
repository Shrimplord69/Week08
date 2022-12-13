package Q01_and_Q02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q02 {
    public static void main(String[]args) {
        try {
            Scanner fsc = new Scanner(new File("src/users.txt"));
            while (fsc.hasNextLine()) {
                String name = fsc.next();
                String address = fsc.next();
                int age = fsc.nextInt();
                System.out.println(name + "\n" + address + "\n" + age);
            }
            fsc.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}

//NOTE: YOU CANNOT READ THE SAME FILE THAT YOU WRITE, YOU HAVE TO SAVE THE FILE THAT YOU WRITE INTO THE DATA STRUCTURE