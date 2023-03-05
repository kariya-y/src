
import java.util.*;
import java.io.*;

public class ABC_104C {
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
	static long ans = Long.MAX_VALUE;
	static long G;
	static int D;
	static int[][] array2D;

	public static void main(String[] args) {
		D = nextInt();
		G = nextLong() / 100;

		array2D = new int[D + 1][2];

		for (int i = 1; i <= D; i++) {
			int a = nextInt();
			int b = nextInt() / 100;
			array2D[i][0] = a;
			array2D[i][1] = b;
		}

		for (int i = 1; i <= D; i++) {
			int arrayL = array2D[i][0];
			for (int ii = 1; ii <= arrayL; ii++) {
				int cnt = ii;
				long sum = ii * i;
				if (ii == arrayL) {
					sum += array2D[i][1];
				}
				if (sum < G && i < D) {
					solve(i + 1, cnt, sum);
				} else {
					if (sum >= G) {
						ans = Math.min(ans, cnt);
					}
				}
			}
		}
		System.out.println(ans);
	}

	static void solve(int idx, int cnt, long sum) {
		int arrayL = array2D[idx][0];
		for (int ii = 0; ii <= arrayL; ii++) {
			sum += 1 * idx;
			if (ii != 0) {
				cnt++;
			}
			if (ii == arrayL) {
				sum += array2D[idx][1];
			}
			if (sum < G && idx < D) {
				solve(idx + 1, cnt, sum);
			} else {
				if (sum >= G) {
					ans = Math.min(ans, cnt);
					return;
				}
			}
		}

	}
}
