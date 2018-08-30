import java.util.Scanner;

public class Reverse {
	private static final Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		
		System.out.println("Using string builder....");
		System.out.print("Enter something : ");
		String rev1;
		final StringBuilder sb = new StringBuilder(rev1=sc.nextLine());
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println("Using nothing but strings....");
		
		
		char []rev = rev1.toCharArray();
		for (int i=0; i<(rev.length)/2;i++) {
			char temp = rev[i];
			rev[i] = rev[rev.length-1-i];
			rev[rev.length-1-i] = temp;
		}
		rev1 = new String(rev);
		System.out.println(rev1);	
	}
}