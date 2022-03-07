
import java.util.*;
import java.io.*;


public class ABC238_B {
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
		int[] a360 = new int[360];
		Arrays.fill(a360, 0);

		int start = 0;
		for (int i = 1; i <= N; i++) {
			int angle = nextInt();
			int end = start + angle;
			if (359 < end) {
				end -= 360;
			}
			a360[end - 1] = i;
			start += angle;
			if (360 < start) {
				start -= 360;
			}
		}

		int cnt = 0;
		int[] array = new int[N + 1];
		int idx = 0;
		for (int i = 0; i < 360; i++) {
			int num = a360[i];
			cnt++;
			if (num != 0) {
				array[idx] = cnt;
				idx++;
				cnt = 0;
			}
			if (i == 359) {
				array[N] = cnt;
			}
		}

		int ans = 0;
		for (int i = 0; i <= N; i++) {
			int num = array[i];
			if (ans < num) {
				ans = num;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
