
import java.util.*;
import java.io.*;

public class Math084 {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		long a = nextLong();
		long b = nextLong();
		long c = nextLong();

		if (c - a - b < 0) {
			System.out.println("No");
			return;
		}

		System.out.println((c - a - b) * (c - a - b));
		if (4 * a * b < (c - a - b) * (c - a - b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
