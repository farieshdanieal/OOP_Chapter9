/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        int y = 5;
        int x = 10;

        try {
            int z = x / y;
            System.out.println("" + z);
        } catch (ArithmeticException ae) {
            System.out.println("attempt to divide by 0");
        }
        
        System.out.println("after catch");
        
    } 
}

