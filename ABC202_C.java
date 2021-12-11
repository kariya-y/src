import java.util.*;

public class ABC202_C {
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
		int[] aArray = new int[N + 1];
		int[] bArray = new int[N + 1];
		int[] cArray = new int[N + 1];
		int[] dArray = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			aArray[i] = nextInt();
		}
		for (int i = 1; i <= N; i++) {
			bArray[i] = nextInt();
		}
		for (int i = 1; i <= N; i++) {
			cArray[i] = nextInt();
		}

		for (int i = 1; i <= N; i++) {
			dArray[i] = bArray[cArray[i]];
		}

		int cnt[] = new int[N];
		Arrays.fill(cnt, 0);
		for (int i = 1; i <= N; i++) {
			cnt[dArray[i]]++;
		}

		int ans = 0;
		for (int i = 1; i <= N; i++) {
			try {
				ans += cnt[aArray[i]];
			} catch (Exception e) {

			}
		}
		System.out.println(ans);
	}
}
