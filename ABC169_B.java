import java.util.*;

public class ABC169_B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		long[] nums = new long[N];
		for(int i = 0; i < N; i++) {
			nums[i] = nextLong();
			if(nums[i] == 0) {
				System.out.println(0);
				return;
			}
		}

		long sum = nums[0];
		for(int i = 1; i<N ;i++) {
			// オーバーフローが発生したら例外を投げる
			try {
				sum = Math.multiplyExact(sum,nums[i]);
			} catch (Exception e) {
				System.out.println(-1);
				return;
			}
			if(sum > 1000000000000000000L ) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(sum);
	}
}
