
import java.util.*;
import java.io.*;

/**
 *
 */

public class ABC250_A {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int R = sc.nextInt();
		int C = sc.nextInt();

		int ans = 0;
		if (H != 1) {
			if (H - R > 0) {
				ans++;
			}
			if (R > 1) {
				ans++;
			}
		}

		if (W != 1) {
			if (W - C > 0) {
				ans++;
			}
			if (C > 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
