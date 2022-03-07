
import java.util.*;
import java.io.*;

public class Math051 {
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
		long x = nextLong();
		long y = nextLong();
		long mod = 1000000007;

		long n = x + y;
		System.out.println(n);
		long r = Math.min(n-x, n-y);
		System.out.println(r);


		long left = 1;
		long right = 1;
		for (int i = 0; i < r; i++) {
			left *= n - i;
			right *= r -i;
			left %= mod;
			right %= mod;
		}
		System.out.println(left);
		System.out.println(right);
		long ans = left/right;
		ans %= mod;
		System.out.println(ans);

	}
}
