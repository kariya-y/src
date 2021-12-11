import java.util.*;

public class ABC195_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long N = nextLong();
		long ans = 0;
		if(N > 1000) ans += N-999;
		if(N > 1000000) ans += N - 999999;
		if(N > 1000000000) ans += N - 999999999;
		if(N > 1000000000000L) ans += N - 999999999999L;
		if(N > 1000000000000000L) ans += N - 999999999999999L;
		System.out.println(ans);
	}
}
