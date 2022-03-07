
import java.util.*;
import java.io.*;

public class ABC239_B {
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
		if (x < 0) {
			if (-9 <= x) {
				System.out.println(-1);
			} else {
				long ans = x / 10;
				long mod = x % 10;
				if (mod == 0) {
					System.out.println(ans);
				} else {
					System.out.println(--ans);
				}
			}
		} else {
			if (x <= 9) {
				System.out.println(0);
			} else {
				long ans = x / 10;
				System.out.println(ans);
			}
		}
	}
}
