import java.io.*;
import java.util.Scanner;
/**
* @author	Richard Dang
*
*/

public class Permutation
{
	public static void main( String[] args )
	{
		Sorter sortStrings = new Sorter();
		Counter count = new Counter();
		Scanner input = new Scanner(System.in);

		String string1;
		String string2;

		System.out.printf("Please input string 1: ");
		string1 = input.nextLine();
		System.out.printf("Please input string 2: ");
		string2 = input.nextLine();

		System.out.println(sortStrings.permutation(string1, string2));
		System.out.println(count.permutation(string1, string2));

	}
}
