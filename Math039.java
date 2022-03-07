
import java.util.*;
import java.io.*;

public class Math039 {
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
		// N区画 Q日数
		int N = nextInt(), Q = nextInt();
		long[] snows = new long[N];
		Arrays.fill(snows, 0);
		for (int i = 0; i < Q; i++) {
			int start = nextInt();
			int end = nextInt();
			int height = nextInt();
			for (int ii = start; ii <= end; ii++) {
				snows[ii-1] += height;
			}
		}

		for(int i = 0; i < N-1;i++) {
			long left = snows[i];
			long right = snows[i+1];
			if(left== right) {
				out.print("=");
				continue;
			}
			if(left < right) {
				out.print("<");
				continue;
			} else {
				out.print(">");
				continue;
			}
		}
		out.println();
		out.flush();
		sc.close();

	}
}
