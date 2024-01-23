/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliahpbokharisma;

/**
 *
 * @author Acer
 */
public class NullPointerExceptionKharisma {

     public static void main(String[] args) {
        try {
            String str = null;
            int length = getStringLength(str);
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Objek null: " + e.getMessage());
        }
    }

    // Metode untuk menyebabkan NullPointerException
    private static int getStringLength(String str) {
        // Menyebabkan NullPointerException karena mencoba mendapatkan panjang dari string null
        return str.length();
    }
}
