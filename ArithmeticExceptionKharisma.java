/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliahpbokharisma;

/**
 *
 * @author Acer
 */
public class ArithmeticExceptionKharisma {

    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmatika: " + e.getMessage());
        }
    }

    // Metode untuk menyebabkan ArithmeticExceptionKharisma
    private static int divideByZero() {
        // Menyebabkan ArithmeticExceptionKharisma karena pembagian oleh nol
        return 7/ 0;
    }
}

    
    

