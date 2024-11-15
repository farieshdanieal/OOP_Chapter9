/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package age;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Age {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
        System.out.print("Enter Current Year: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Your Birth Year: ");
        int num2 = scanner.nextInt();
        
        
        
        int age = num1 - num2;
        System.out.println("Your Age is: "+age);
        } 
        
        catch (Exception ae) {
          System.out.println("Please Insert Number");
        }
        
        
    }
    
}


