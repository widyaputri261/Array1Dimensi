
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class StudentScore {
    public static void main(String[] args) {
        double scores[] = new double[10];
        double sum = 0.0, avg = 0.0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter scores of 10 students");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = keyboard.nextInt();
        }//end for

        System.out.println("Display the scores of 10 students");
        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }//end for
        
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            avg = sum / 10;
        }//end for
        System.out.println("The average score of the class " + avg);
    }//end method main
}
  
