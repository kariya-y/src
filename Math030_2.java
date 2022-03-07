
import java.util.*;
import java.io.*;

public class Math030_2 {
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
	static int N;
	static int W;
	static int[] valueArray;
	static int[] weightArray;
	static long[][] valueSum;
	static long[][] weightSum;
	static long ans = 0;

	public static void main(String[] args) {
		N = nextInt();
		W = nextInt();

		valueArray = new int[N];
		weightArray = new int[N];

		for (int i = 0; i < N; i++) {
			weightArray[i] = nextInt();
			valueArray[i] = nextInt();
		}

		valueSum = new long[N + 1][N];
		weightSum = new long[N + 1][N];

		for (int i = 0; i < N; i++) {
			if (weightArray[i] <= W) {
				weightSum[0][i] = weightArray[i];
				valueSum[0][i] = valueArray[i];
				if (weightSum[0][i] <= W && ans < valueSum[0][i])
					ans = valueSum[0][i];
			}
		}

		solve();
		System.out.println();
		System.out.println();
		for (int i = 0; i <= N; i++) {
			for (int ii = 0; ii < N; ii++) {
				System.out.print(weightSum[i][ii] + "：");
				System.out.print(valueSum[i][ii] + " ");
			}
			System.out.println();
		}

		System.out.println(ans);
	}

	static void solve() {
		for (int i = 1; i <= N; i++) {
			int valueI = valueArray[i - 1];
			int weightI = weightArray[i - 1];
			for (int ii = 0; ii < N; ii++) {
				if (i - 1 == ii) {
					weightSum[i][ii] = -1;
					valueSum[i][ii] = -1;
					continue;
				}
				int minus = 0;
				long valueII = 0;
				long weightII = 0;
				while (i - 1 - minus >= 0) {
					if (valueSum[i - 1 - minus][ii] == -1) {
						minus++;
						continue;
					}

					long thisWeightSum = (long) weightI + weightSum[i - 1 - minus][ii];
					if (thisWeightSum <= W) {
						valueII = valueI + valueSum[i - 1 - minus][ii];
						weightII = thisWeightSum;
						break;
					}
					valueII = valueI + valueArray[i - 1 - minus];
					weightII = thisWeightSum;
					minus++;
				}
				weightSum[i][ii] = weightII;
				valueSum[i][ii] = valueII;
				if (weightSum[i][ii] <= W && ans < valueII) {
					ans = valueII;
				}
				System.out.print(weightSum[i][ii] + "：");
				System.out.print(valueSum[i][ii] + " ");
			}
		}
	}
}
