import java.util.*;

public class ABC227_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		long N = nextLong();
		long ans = 0;
		for (long i = 1; i <= N; i++) {
			for (long ii = i; ii <= N; ii++) {
				long tmp = i * ii;
				if (tmp <= N &&  N/tmp >= ii) {
					ans += N / tmp - (ii -1);
				} else {
					break;
				}
			}
		}
		System.out.println(ans);

	}
}
