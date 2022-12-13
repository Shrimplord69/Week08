package Q01_and_Q02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q02 {
    public static void main(String[]args) {
        String line, name, address;
        int age;
        try {
            Scanner fsc = new Scanner(new File("src/Q01_and_Q02/users.txt"));
            while (fsc.hasNext()) {
                line = fsc.nextLine();
                System.out.println(line);
                StringTokenizer inReader = new StringTokenizer(line,",");
                System.out.println(inReader.countTokens());
                if (inReader.countTokens() != 3)
                    throw new IOException("Invalid Input Format");
                else {
                    name = inReader.nextToken();
                    address = inReader.nextToken();
                    age = Integer.parseInt(inReader.nextToken());
                }
                System.out.println(name + ", " + address + ", " + age);
            }
            fsc.close();
        }catch (IOException e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}

//NOTE: YOU CANNOT READ THE SAME FILE THAT YOU WRITE, YOU HAVE TO SAVE THE FILE THAT YOU WRITE INTO THE DATA STRUCTURE