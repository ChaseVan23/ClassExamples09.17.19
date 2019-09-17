
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0774775
 */
public class Examples {
    public static void main(String[] args) throws FileNotFoundException {
         System.out.println("Please enter file name");
         
         Scanner keyboard = new Scanner(System.in);
         String fileName = keyboard.nextLine();
         
         File myFile = new File("C:\\users\\chasec\\desktop\\" + fileName);
         Scanner fileScanner = new Scanner(myFile);
         
         int counter = 0;
         while(fileScanner.hasNext() && counter < 5) {
             System.out.println(fileScanner.nextLine());
             counter++;
         }
         
    }
}
