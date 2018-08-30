import java.util.Scanner;
import java.util.Arrays;
public class RemoveVowels {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		final String vowels = "aeiou";
		System.out.print("Enter something : ");
		String withVowels = sc.nextLine(), withoutVowels = "";
		for (char i: withVowels.toCharArray())
			if (vowels.indexOf(i) == -1)
				withoutVowels += i;
		System.out.println("String without vowels :"+withoutVowels);
	}
}