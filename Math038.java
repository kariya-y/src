
import java.util.*;
import java.io.*;


public class Math038 {
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
		int N = nextInt(), Q =nextInt();
		long[] costomers = new long[N+1];
		long[] sum = new long[N+1];

		costomers[0] = 0;
		sum[0] = 0;
		for(int i = 1; i <= N ;i++) {
			costomers[i] = nextLong();
			sum[i] = costomers[i] + sum[i-1];
		}

		for(int i = 0; i < Q;i++) {
			int start = nextInt();
			int end = nextInt();
			long ans = sum[end] - sum[start-1];
			out.println(ans);
		}
		out.flush();

	}
}
