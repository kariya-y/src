package algorithm;

import java.util.*;

public class Euclidean {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		int a = 36;
		int b = 18;

		long result = GCD(a, b);
		System.out.println(result);
	}

	public static long GCD(long l, long r) {
		if (r == 0)
			return l;
		return GCD(r, l % r);
	}

	public static long LCR(long l, long r) {
		return l / GCD(l, r) * r;
	}
}
