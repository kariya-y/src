
import java.util.*;
import java.io.*;

public class Math040 {
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
		long[] stations = new long[N + 1];
		long[] sum = new long[N + 1];
		stations[1] = 0;
		sum[1] = 0;
		for (int i = 2; i <= N; i++) {
			stations[i] = nextInt();
			sum[i] = sum[i - 1] + stations[i];
		}

		int M = nextInt();
		int now = nextInt();
		long ans = 0;
		for (int i = 1; i < M; i++) {
			int next = nextInt();
			ans += Math.abs(sum[now] - sum[next]);
			now = next;
		}
		System.out.println(ans);
		sc.close();
	}
}
