import java.util.*;

public class Tenkei_016_Ans {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		long N = nextLong();
		long A = nextLong();
		long B = nextLong();
		long C = nextLong();
		int L = 9999;

		long min = L;
		for (int x = 0; x < L; x++) {
			for (int y = 0; y < L; y++) {
				long a = N - (x * A) - (y * B);
				if (a >= 0) {
					if (a % C == 0) {
						min = chmin(x + y + (a / C), min);
					}
				}
			}
		}
		System.out.println(min);
	}

	public static long chmin(long x, long y) {
		if (x > y) 	return y;
		else return x;
	}
}
