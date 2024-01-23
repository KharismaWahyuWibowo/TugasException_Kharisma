/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliahpbokharisma;

/**
 *
 * @author Acer
 */
public class IndexOutOfBoundKharisma {

   public static void main(String[] args) {
        try {
            String str = "Halo";
            char character = getCharacterAtIndex(str, 15);
            System.out.println("Karakter: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Indeks string di luar batas: " + e.getMessage());
        }
    }

    // Metode untuk menyebabkan StringIndexOutOfBoundsException
    private static char getCharacterAtIndex(String str, int index) {
        // Menyebabkan StringIndexOutOfBoundsException karena mencoba mengakses indeks yang tidak valid
        return str.charAt(index);
    }
}
