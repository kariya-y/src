import java.util.*;

public class ABC231_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = nextInt();
		int Q = nextInt();

		int[] nums = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			nums[i] = nextInt();
		}
		Arrays.sort(nums);

		for (int i = 0; i < Q; i++) {
			int target = nextInt();
			int idx = solve(target, nums);
			System.out.println(nums.length-1 - idx);
		}
	}

	public static int solve(int target, int[] nums) {
		int index = 0;
		int l = 1;
		int r = nums.length;
		while (l <= r) {
			int middle = (l + r) / 2;
			int length = nums[middle];
			if (target == length) {
				return middle-1;
			}
			if (length < target) {
				l = middle + 1;
				index = middle;
				try {
					if (target < nums[middle + 1]) {
						return middle;
					}
				} catch (Exception e) {
					return nums.length-1;
				}
			} else {
				r = middle - 1;
				index = middle;
				try {
					if (nums[middle - 1] < target) {
						return middle - 1;
					}
				} catch (Exception e) {
					return 0;
				}
			}
		}
		return index;
	}
}
