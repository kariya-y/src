
import java.util.*;
import java.io.*;

public class ARC135_A {
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
		long N = nextLong();
		int mod = 998244353;

		long[] array = { N };

		long[] resultArray;
		if (N < 5) {
			System.out.println(N);
			return;
		}
		while (true) {
			long[] longArray = new long[array.length * 2];
			int idx = 0;
			long max = 0;
			for (long num : array) {
				long a, b;
				if (num % 2 == 0) {
					a = num / 2;
					b = num / 2;
				} else {
					a = num / 2;
					b = num / 2 + 1;
				}
				longArray[idx] = a;
				longArray[++idx] = b;
				idx++;
				max = Math.max(max, Math.max(a, b));
			}
			if (max < 5) {
				resultArray = longArray;
				break;
			} else {
				array = longArray;
			}
		}

		long ans = 1;
		for (long num : resultArray) {
			ans *= num;
			ans %= mod;
		}
		System.out.println(ans);
	}
}
