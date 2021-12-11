import java.util.Scanner;

public class Tenkei_022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long A = Long.parseLong(sc.next());
		final long B = Long.parseLong(sc.next());
		final long C = Long.parseLong(sc.next());

		long gcd = gcd(gcd(A,B),C);
		System.out.println((A/gcd-1)+(B/gcd-1)+(C/gcd-1));

	}

	static private long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
