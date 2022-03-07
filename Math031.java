
import java.util.*;
import java.io.*;


public class Math031 {
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
		long[] dp = new long[N+1];
		dp[0] = 0;
		dp[1] = nextInt();
		dp[2] = nextInt();
		for(int i = 4; i < N;i++) {
			long tmp = nextInt();
			long v2 = tmp + dp[i-2];
			long v3 = tmp + dp[i-3];
			dp[i] = Math.max(v2, v3);
		}

		System.out.println(Math.max(dp[N], dp[N-1]));

	}
}
