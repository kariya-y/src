
import java.util.*;
import java.io.*;

public class ABC212_C {
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
		int M = nextInt();
		TreeSet<Integer> tree = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			tree.add(nextInt());
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			int num = nextInt();
			int floor = Integer.MAX_VALUE;
			int ceiling = Integer.MAX_VALUE;
			if (tree.floor(num) != null) {
				floor = Math.abs(tree.floor(num) - num);
			}
			if (tree.ceiling(num) != null) {
				ceiling = Math.abs(tree.ceiling(num) - num);
			}
			ans = Math.min(ans, Math.min(floor, ceiling));
		}
		System.out.println(ans);
	}
}
