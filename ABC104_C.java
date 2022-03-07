import java.io.PrintWriter;
import java.util.*;

public class ABC104_C {
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
	static int G;
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int D = nextInt();
		G = nextInt();
		int[] left = new int[D];
		int[] right = new int[D];

		for (int i = 0; i < D; i++) {
			left[i] = nextInt();
			right[i] = nextInt();
		}

		solve(left, right, 0, 0, 0);
		out.println(ans);
		out.flush();
	}

	public static void solve(int[] left, int[] right, long sum, int idx, int cnt) {
		if (left.length <= idx) {
			if (G <= sum && cnt < ans) {
				ans = cnt;
			}
			return;
		}
		for (int i = 0; i <= left[idx]; i++) {
			if (i != 0) {
				cnt++;
				sum += 100 * (idx+1);
			}
			if (i == left[idx] ) {
				sum += right[idx];
			}
			solve(left, right, sum, idx + 1, cnt);
		}
	}
}
