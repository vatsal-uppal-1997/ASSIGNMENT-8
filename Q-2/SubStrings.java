import java.util.Scanner;

public class SubStrings {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Enter something : ");
		final String str = sc.nextLine();
		for (int i=0; i < str.length(); i++) {
			for (int j=1; j <= str.length() - i; j++) 
				System.out.println(str.substring(i,j+i));
		}
	}
}