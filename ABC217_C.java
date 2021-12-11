import java.util.*;

public class ABC217_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = nextInt();

		int nums[] = new int[N+1];
		for (int i = 1; i <= N; i++) {
			nums[i] = nextInt();
		}

		int ans[] = new int[N+1];
		for (int i = 1; i <= N; i++) {
			int tmp = nums[i];
			ans[tmp] = i;
		}

		for(int i = 1; i <= N; i++) {
			System.out.print(ans[i]);
			if(i != N ) {
				System.out.print(" ");
			}
		}
	}
}
