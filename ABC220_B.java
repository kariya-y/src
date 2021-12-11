import java.util.*;

public class ABC220_B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		final int K = nextInt();
		final int A = nextInt();
		final int B = nextInt();
		String aStr = String.valueOf(A);
		String bStr = String.valueOf(B);

		long a = 0;
		for (int i = 0; i < aStr.length(); i++) {
			int tmp = Integer.valueOf(aStr.substring(i, i + 1));
			a += tmp * Math.pow(K, aStr.length() - i - 1);
		}
		long b = 0;
		for (int i = 0; i < bStr.length(); i++) {
			int tmp = Integer.valueOf(bStr.substring(i, i + 1));
			b += tmp * Math.pow(K, bStr.length() - i - 1);
		}
		System.out.println(a * b);
	}
}
