/*
    A program that utilizes the Scanner Class.
    (Next word, next char, next line)
*/
import java.util.Scanner;

public class TextIO {
    public static void main(String[] args){
        String input1 = "Now is the time for all good men to come to the aid of their country.";
        String input2 = "abcdefghijklmnopqrstuvwxyz0123456789";
        String input3 = "a1b2c3 d4";
        String input4 = "Line 1\nLine2\nLine3\nLine4";

        Scanner i1 = new Scanner(input1);
        while(i1.hasNext()){
            String word = i1.next();
            System.out.println(word);
        }
        
        Scanner i2 = new Scanner(input2);
        i2.useDelimiter("");
        while(i2.hasNext()){
            String car = i2.next();
            System.out.println(car);
        }
        
        Scanner i3 = new Scanner(input3);
        i3.useDelimiter("");
        while(i3.hasNext()){
            String thing = i3.next();
            System.out.println(thing);
        }
        
        Scanner i4 = new Scanner(input4);
        i4.useDelimiter("\n");
        while(i4.hasNext()){
            String line = i4.next();
            System.out.println(line);
        }
    }
}

