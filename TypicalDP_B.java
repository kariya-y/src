
import java.util.*;
import java.io.*;

public class TypicalDP_B {
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
		int A = nextInt();
		int B = nextInt();
		int[] arrayA = new int[A+1];
		int[] arrayB = new int[B+1];
		int sum = 0;
		for(int i = 1; i <= A;i++) {
			arrayA[i] = nextInt();
			sum += arrayA[i];
		}
		for(int i = 1; i <= B;i++) {
			arrayB[i] = nextInt();
			sum += arrayB[i];
		}

		long[][] dp = new long[A+1][B+1];
		for(int i = 0; i <= A;i++) {
			Arrays.fill(dp[i], -1000000000);
		}
		dp[0][0] = 0;
		for(int i = 0; i <=A;++i) {
			for(int ii = 0; ii <= B;++ii) {
				if(i+1<=A) {

					dp[i+1][ii] = Math.max(dp[i+1][ii], arrayA[A-i] - dp[i][ii]);
				}
				if(ii+1<=B) {
					dp[i][ii+1] = Math.max(dp[i][ii+1], arrayB[B-ii] - dp[i][ii]);
				}
			}
		}
		System.out.println(dp[A][B]);
		System.out.println(sum);
		System.out.println((dp[A][B] + sum) / 2);
		sc.close();

	}
}
