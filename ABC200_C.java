import java.util.*;

public class ABC200_C {
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
		int[] mods = new int[200];
		Arrays.fill(mods, 0);
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int mod = nextInt() % 200;
			mods[mod]++;
			ans += mods[mod] - 1;
		}
		System.out.println(ans);
	}
}
