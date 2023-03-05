
import java.util.*;
import java.io.*;


public class ABC246_C {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = nextInt(sc); // 個数
		int K = nextInt(sc); // クーポン枚数
		int X = nextInt(sc); // クーポン割引値段

		Integer[] item = new Integer[N];
		for (int i = 0; i < N; i++) {
			item[i] = nextInt(sc);
		}

		Arrays.sort(item);

		for (int i = item.length - 1; 0 <= i; i--) {
			if(K ==0 )break;
			int quotient = item[i] / X;
			if(quotient <= K) {
				item[i] = item[i] % X;
				K -= quotient;
			} else {
				item[i] -= K * X;
				K = 0;
			}
		}

		Arrays.sort(item);
		for (int i = item.length - 1; 0 <= i; i--) {
			if(K ==0 )break;
			item[i] = Math.max(item[i] - X, 0);
			K--;
		}

		long ans = 0;
		for(int i = 0; i < item.length; i++) {
			ans += item[i];
		}
		System.out.println(ans);

	}
}
