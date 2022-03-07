
import java.util.*;
import java.io.*;

public class Math030 {
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
		int W = nextInt();
		int[] w = new int[N + 1];
		int[] v = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			w[i] = nextInt();
			v[i] = nextInt();
		}

		long[][] dp = new long[N + 1][W + 1];
		for (int ii = 0; ii <= W; ii++) {
			dp[0][ii] = -1;
		}

		dp[0][0] = 0;

		for (int i = 1; i <= N; i++) {
			for (int ii = 1; ii <= W; ii++) {
				if (ii < w[i])
					dp[i][ii] = dp[i - 1][ii];

				if (ii >= w[i])
					dp[i][ii] = Math.max(dp[i - 1][ii], dp[i - 1][ii - w[i]] + v[i]);
			}
		}

		long ans = 0;
		for (int i = 0; i <= W; i++) {
			ans = Math.max(ans, dp[N][i]);
		}
		System.out.println(ans);
	}
}
