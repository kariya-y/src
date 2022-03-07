
import java.io.PrintWriter;
import java.util.*;

public class Math028 {
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
		int N = sc.nextInt();
		int[] array = new int[N];
		int[] dp = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = nextInt();
		}


		dp[0] = 0;
		dp[1] = Math.abs(array[0]-array[1]);
		for(int i = 2; i < N; i++) {
			int v1 = dp[i-1] + Math.abs(array[i-1]-array[i]);
			int v2 = dp[i-2] + Math.abs(array[i-2]-array[i]);
			dp[i] = Math.min(v1, v2);
		}
		System.out.println(dp[N-1]);

	}
}
