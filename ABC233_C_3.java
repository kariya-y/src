
import java.util.*;
import java.io.*;


public class ABC233_C_3 {
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

		numArray = new long[N][];

		// 不要な改行を読み込んでおく
		for(int i = 0; i < N;i++) {
			int len = nextInt();
			long[] tmp = new long[len];
			for(int ii = 0; ii < len;ii++) {
				tmp[ii] = nextLong();
			}
			numArray[i] = tmp;
		}

		solve(0, 1);
		System.out.println(ans);
	}

	public static void solve(int idx, long thisMulti) {
		if(idx == N) {
			if(thisMulti == X) {
				ans++;
			}
			return;
		}

		for(int i = 0; i < numArray[idx].length;i++) {
			long nextMulti = 0;
			try {
				nextMulti = Math.multiplyExact(thisMulti,numArray[idx][i]);
			} catch (Exception e) {
				continue;
			}
			solve(idx+1,nextMulti);
		}
	}
}
