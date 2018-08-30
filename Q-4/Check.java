import java.util.Scanner;

public class Check {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Enter larger String : ");
		final String s1 = sc.nextLine();
		System.out.print("\nEnter string to look for : ");
		final String s2 = sc.nextLine();
		System.out.println(s1.contains(s2));
	}
}