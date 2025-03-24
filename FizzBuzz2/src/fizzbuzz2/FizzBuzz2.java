/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz2;

/**
 *
 * @author Lecturer
 */

import java.util.Scanner;

public class FizzBuzz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        FizzBuzz
        Print the numbers between 1 and 150
        If a number is divisible by 3, print Fizz
        If a number is divisible by 5, print Buzz
        If a number is divisible by both, print FizzBuzz
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
            int number = scanner.nextInt();
        scanner.close();
        
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (number % 3 == 0){
            System.out.println("Fizz");
        }else if (number % 5 == 0){
            System.out.println("Buzz");
        }else {
            System.out.println("Sorry, try again");
        }
        
    }
    
}
