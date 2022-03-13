package main.java;
import java.util.Scanner;
/**
 *
 * @author larsencs
 */
public class favCity{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of your favorite city: ");
        String city = input.nextLine();
        
        System.out.println("Number of characters: " +city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.charAt(0));
    }
    
}