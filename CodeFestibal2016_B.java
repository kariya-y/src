
import java.util.*;
import java.io.*;

public class CodeFestibal2016_B {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = nextInt(sc);
		int A = nextInt(sc);
		int B = nextInt(sc);

		int sum = A + B;
		String line = sc.next();
		int aCnt = 0;
		int bCnt = 0;
		for (int i = 1; i <= N; i++) {
			char c = line.charAt(i - 1);
			if (c == 'a') {
				if (aCnt+bCnt < sum) {
					out.println("Yes");
					aCnt++;
				} else {
					out.println("No");
				}
			} else if (c == 'b') {
				if (aCnt+bCnt < sum && bCnt < B) {
					out.println("Yes");
					bCnt++;
				} else {
					out.println("No");
				}
			} else {
				out.println("No");
			}
		}
		out.flush();
	}
}
