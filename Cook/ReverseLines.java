/*
    A program that reads each line in a file (input.txt), reverses its lines and returns the output. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseLines {
	public static void main(String[] args) throws FileNotFoundException {

	    File file = new File("input.txt");
	    Scanner sc = new Scanner(file);

	    ArrayList<String> lines = new ArrayList<String>();

	    while (sc.hasNext()) {
	        lines.add(sc.nextLine());
	    }

	    sc.close();
	    for (int i = lines.size() - 1; i >= 0; i--) {
	        System.out.println(lines.get(i));
	    }

	}
}
