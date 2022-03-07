
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class ABC242_C {
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
		int mod = 998244353;
		int[][] dp = new int[1000001][10];

		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}

		for (int d = 2; d <= N; d++) {
			for(int i = 1; i <= 9;i++) {
				for(int ii = Math.max(1,i-1); ii <= Math.min(9,i+1); ii++) {
					dp[d][ii] += dp[d-1][i];
					dp[d][ii] %= mod;
				}
			}
		}

		int ans = 0;
		for(int i = 1; i <= 9;i++) {
			ans += dp[N][i];
			ans %= mod;
		}

		System.out.println(ans);

	}

}
