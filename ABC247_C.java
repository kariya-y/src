
import java.util.*;
import java.io.*;


public class ABC247_C {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static int[] numArray;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = nextInt(sc);

		numArray = new int[(int) Math.pow(2, N)];

		for (int i = 1; i < numArray.length; i++) {
			numArray[i] = 1;
		}

		int idx = numArray.length / 2;
		solve(N, idx, 0);

		for (int i = 1; i < numArray.length; i++) {
			if (i == numArray.length - 1) {
				System.out.print(numArray[i]);
			} else {
				System.out.print(numArray[i] + " ");
			}
		}

	}

	static void solve(int N, int idx, int sa) {
		if (N == 1 || numArray.length <= idx) {
			return;
		}
		numArray[idx] = N;
		int minus = idx - (idx - sa) / 2;
		int plus = idx + (idx - sa) / 2;
		solve(N - 1, minus, sa);
		solve(N - 1, plus, idx);
	}
}
