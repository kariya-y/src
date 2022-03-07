
import java.util.*;
import java.io.*;

public class TypicalDP_A {
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
		boolean[][] dp = new boolean[N + 1][10000+1];

		dp[0][0] = true;

		int[] numbers = new int[N+1];
		for(int i = 1; i <= N;i++) {
			numbers[i] = nextInt();
		}

		for (int i = 1; i <= N; i++) {
			for (int ii = 0; ii <= 10000; ii++) {
				if(ii < numbers[i]) {
					dp[i][ii] = dp[i-1][ii];
				} else {
					if(dp[i-1][ii] || dp[i-1][ii-numbers[i]]) {
						dp[i][ii] = true;
					}
				}
			}
		}

		int ans = 0;
		for(int i = 0; i <= 10000; i++) {
			if(dp[N][i])ans++;
		}
		System.out.println(ans);
	}
}
