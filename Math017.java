import java.util.*;

public class Math017 {
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
/*
		long[] array = new long[N];
		for(int i = 0; i < N ;i++) {
			array[i] = nextLong();
		}

		long ans = LCR(array[0],array[1]);
		for(int i = 2; i < N ;i++) {
			ans = LCR(ans, array[i]);
		}

		System.out.println(ans);
*/
		long gcd = nextLong();
		long lcm =  gcd;
		for(long i = 1; i < N ; i++) {
			long tmp = nextLong();
			gcd = GCD(lcm, tmp);
			lcm *= tmp;
			lcm /= gcd;
		}
		System.out.println(lcm);
	}

	public static long GCD(long l, long r) {
		long mod = l % r;
		if(mod != 0) {
			return GCD(r, mod);
		}
		return r;
	}

	public static long LCR(long l, long r) {
		return l/GCD(l,r)*r;
	}

}
