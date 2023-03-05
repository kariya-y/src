
import java.util.*;
import java.io.*;


public class Math030_3 {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = nextInt(sc);
		int W = nextInt(sc);
		int[] wArray = new int[N+1];
		int[] vArray = new int[N+1];

		for(int i = 1; i <= N ;i++) {
			wArray[i] = nextInt(sc);
			vArray[i] = nextInt(sc);
		}
		long[][] dp = new long[N+1][W+1];



		for(int i = 1; i <= N;i++) {
			for(int ii = 1; ii <= W; ii++) {
				if(ii == wArray[i]) {
					dp[i][ii] = Math.max(dp[i-1][ii], vArray[i]);
				}
				if(0 < dp[i-1][ii]) {
					dp[i][ii] = Math.max(dp[i][ii],dp[i-1][ii]);
					if(ii+wArray[i] <= W) {
						dp[i][ii+wArray[i]] = Math.max(dp[i-1][ii+wArray[i]], dp[i-1][ii]+vArray[i]);
					}
				}
			}
		}

		long ans = 0;
		for(int i = 0; i <= W; i++) {
			ans = Math.max(dp[N][i], ans);
		}
		System.out.println(ans);
	}
}
