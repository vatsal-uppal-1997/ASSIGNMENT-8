import java.util.Scanner;

public class CountWords {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Enter String : ");
		final String s1 = sc.nextLine();
		final String s2[] = s1.split(" ");
		System.out.println("No. of words in string : "+s2.length);
	}
}