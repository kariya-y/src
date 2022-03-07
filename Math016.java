import java.util.*;

public class Math016 {
	static Scanner sc = new Scanner(System.in);

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
		long ans = nextLong();
		for(long i = 1; i < N ; i++) {
			long tmp = nextLong();
			ans = GCD(ans, tmp);
		}
		System.out.println(ans);
	}

	public static long GCD(long l, long r) {
		long mod = l % r;
		if(mod != 0) {
			return GCD(r, mod);
		}
		return r;
	}

}
