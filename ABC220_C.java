import java.util.*;

public class ABC220_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		int[] nums = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			nums[i] = nextInt();
			sum += nums[i];
		}
		long X = nextLong();

		long quo = (X / sum)*nums.length;
		long mod = X % sum;

		for(int i = 0; i < nums.length; i++) {
			quo++;
			mod -= nums[i];
			if(mod < 0) {
				break;
			}
		}
		System.out.println(quo);

	}
}
