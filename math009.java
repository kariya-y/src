import java.util.*;
import java.util.stream.IntStream;

public class math009 {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static int target;
	static int[] nums;

	public static void main(String[] args) {
		int N = nextInt();
		target = nextInt();
		boolean[][] dp = new boolean[N+1][target+1];
		int[] numbers = new int[N+1];

		dp[0][0] = true;

		for(int i = 1; i <= N;i++) {
			numbers[i] = nextInt();
		}

		for(int i = 1; i <= N;i++) {
			for(int ii = 1; ii <= target;ii++) {
				System.out.println("ii" + ii + "：" +numbers[i]);
				if(ii < numbers[i]) {
					dp[i][ii] = dp[i-1][ii];
				}
				if(ii >= numbers[i]) {
					if(dp[i-1][ii] == true || dp[i-1][ii-numbers[i]] == true) {
						dp[i][ii] = true;
					} else {
						dp[i][ii] = false;
					}
				}
			}
		}

		if(dp[N][target]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
