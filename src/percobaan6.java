/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class percobaan6 {
    public static void main(String[] args) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17}; 
        System.out.println("Array length: " + primes.length);
        primes[10] = 20; //
        
        System.out.println("The first few prime numbers are:");
        for (int i : primes) {
            System.out.println(i);
        }//end for
    }
}
