import java.util.*;

public class ABC104_C_2 {
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
		int D = nextInt();
		int G = nextInt();
		int[] left = new int[D];
		int[] right = new int[D];

		for (int i = 0; i < D; i++) {
			left[i] = nextInt();
			right[i] = nextInt();
		}

		int end = 1 << D;
		int ans = 1000;
		for (int patern = 0; patern < end; patern++) {
			int cnt = 0;
			int sum = 0;
			for (int i = 0; i < D; i++) {
				if ((patern >> i & 1) == 1) {
					cnt += left[i];
					sum += right[i] + 100 * (i + 1) * left[i];
				}
			}
			for (int i = D - 1; 0 <= i; i--) {
				if ((patern >> i & 1) == 0) {
					for (int ii = 1; ii < left[i] && sum < G; ii++) {
						sum += 100 * (i + 1);
						cnt++;
					}
				}
			}
			if (G <= sum) {
				ans = Math.min(ans, cnt);
			}
		}
		System.out.println(ans);

	}
}
