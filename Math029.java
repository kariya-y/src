
import java.io.PrintWriter;
import java.util.*;

public class Math029 {
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
		int[] dp = new int[N + 1];
		dp[1] = 1;
		if(N==1) {
			System.out.println(1);
			return;
		}
		dp[2] = 2;
		for (int i = 3; i <= N; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		System.out.println(dp[N]);
	}
}
