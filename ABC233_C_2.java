
import java.util.*;
import java.io.*;

public class ABC233_C_2 {
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
	static long ans = 0;
	static int N;
	static long X;
	static long[][] numArray;

	public static void main(String[] args) {
		N = nextInt();
		X = nextLong();

		String[][] numsStr = new String[N][];
		numArray = new long[N][];

		// 不要な改行を読み込んでおく
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine();
			String[] tmp = line.split(" ");
			numsStr[i] = tmp;
			numArray[i] = Arrays.stream(numsStr[i]).mapToLong(Long::parseLong).toArray();
			Arrays.sort(numArray[i]);
		}
		long[] perm = new long[N];
		boolean[][] isUsed = new boolean[N][10000000];
		solve(0, perm, isUsed);
		System.out.println(ans);
	}

	public static void solve(int idx, long[] perm, boolean[][] isUsed) {
		if (idx == N) {
			long thisMulti = 1;
			for (int i = 0; i < N; i++) {
				try {
					thisMulti *= perm[i];
				} catch (Exception e) {
					return;
				}
			}
			if (thisMulti == X) {
				ans++;
			}
			return;
		}
		for (int i = 0; i < numArray[idx].length; i++) {
			if (isUsed[idx][i]) {
				continue;
			}
			perm[idx] = numArray[idx][i];
			isUsed[idx][i] = true;
			solve(idx + 1, perm, isUsed);
			isUsed[idx][i] = false;
		}
	}
}
