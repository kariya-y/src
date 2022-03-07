import java.awt.Point;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class ABC237_D {
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
		int N = nextInt();
		String line = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(0);
		int idx = 0;
		for (int i = 0; i < N; i++) {
			char lr = line.charAt(i);
			if (lr == 'L') {
				sb.insert(idx, i + 1 + " ");
			} else {
				sb.insert(idx + 1, " " + (i + 1));
				if (idx < sb.length()) {
					idx += 2;
				}
			}
		}
		System.out.println(sb.toString());
	}
}
