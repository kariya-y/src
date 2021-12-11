import java.io.PrintWriter;
import java.util.Scanner;

public class A203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		final int A = sc.nextInt();
		final int B = sc.nextInt();
		int c = B ^ A;
		System.out.println(c);
	}

}
