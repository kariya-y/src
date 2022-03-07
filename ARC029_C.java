import java.io.PrintWriter;
import java.util.*;

public class ARC029_C {
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
		int[] meats = new int[N];

		for(int i = 0; i < N ; i++) {
			meats[i] = nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for(int patern = 0; patern < 1 << N ;patern++) {
			int l = 0;
			int r = 0;
			for(int i = 0; i < N; i++) {
				if((patern >> i & 1) == 1) {
					l += meats[i];
				} else {
					r += meats[i];
				}
			}
			ans = Math.min(ans,Math.max(l, r));
		}
		System.out.println(ans);

	}
}
