/*
    A program that processes command line arguments and determines if each argument is an int or double and returns the result.
    *Note* Only works correctly when all inut in numerical. 
*/
import java.util.Scanner;

public class TextInt {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
    
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                int number;
                String decimal;
                if (scan.hasNextInt()) {
                    number = scan.nextInt();
                    System.out.println( number + " is an int");
                    continue;
                } else {
                    decimal = scan.next();
                    System.out.println( decimal + " is a double");
                    continue;
                }
            }
        }
    }
}
