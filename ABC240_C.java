
import java.util.*;
import java.io.*;


public class ABC240_C {
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
		int X = nextInt();
		int max = 10001;
		int[] left = new int[N];
		int[] right = new int[N];
		boolean[][] result = new boolean[N+1][max];

		for(int i = 0; i < N;i++) {
			left[i] = nextInt();
			right[i] = nextInt();
		}

		boolean ans = false;
		result[1][left[0]] = true;
		result[1][right[0]] = true;

		for(int i = 2; i <= N;i++) {
			int leftNum = left[i-1];
			int rightNum = right[i-1];
			for(int ii = 1; ii < max;ii++) {
				boolean isTrue = result[i-1][ii];
				if(isTrue) {
					result[i][ii+leftNum] = true;
					result[i][ii+rightNum] = true;
				}
			}
		}

		if(result[N][X]) {
			ans = true;
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
