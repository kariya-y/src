
import java.util.*;
import java.io.*;

public class ABC211_C_2 {
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
		int M = nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = nextInt();
		}
		Arrays.sort(numbers);

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			int num = nextInt();
			int l = 0;
			int r = N;
			int idx = (r + l) / 2;
			while (r - l > 1) {
				int thisNum = numbers[idx];
				if (thisNum == num) {
					break;
				}

				if (thisNum < num) {
					l = idx;
				} else {
					r = idx;
				}
				idx = (l + r) / 2;
			}
			int thisAns = Math.abs(numbers[idx] - num);
			if (0 < idx - 1) {
				thisAns = Math.min(thisAns, Math.abs(numbers[idx - 1] - num));
			}
			if (idx + 1 < N) {
				thisAns = Math.min(thisAns, Math.abs(numbers[idx + 1] - num));
			}
			ans = Math.min(ans, thisAns);
		}
		System.out.println(ans);
	}
}
