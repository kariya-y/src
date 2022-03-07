package algorithm;
import java.util.*;
import java.util.stream.IntStream;

public class allPerm {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static String str;
	public static void main(String[] args) {

		str = "abcd";
		int[] perm = new int[str.length()];
		int[] seed = IntStream.range(0,str.length()).toArray();
		boolean[] used = new boolean[str.length()];

		allPerm(perm,seed,used,0);


	}

	public static void allPerm(int[] perm,int[] seed, boolean[] used, int idx) {
		if(idx == perm.length) {
			// ここにパターン作成時の処理を書く
			for(int i : perm) {
				System.out.print(i);
			}
			System.out.println();
			// ここまで
			return;
		}

		for(int i = 0; i < perm.length; i++) {
			// このif文を外すと重複ありの全パターン
			if(used[i]) {
				continue;
			}
			perm[idx] = seed[i];
			used[i] = true;
			allPerm(perm,seed,used,idx+1);
			used[i] = false;
		}
	}
}
