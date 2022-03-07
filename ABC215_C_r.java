import java.util.*;
import java.util.stream.IntStream;

public class ABC215_C_r {
	static Scanner sc = new Scanner(System.in);
	static char[] cArray;
	static ArrayList<String> strList;

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] charArray;
	static HashSet<String> permSet;
	static int cnt;
	static int target;
	static String S;
	static String ans;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		permSet = new HashSet<>();

		S = sc.next();
		charArray = S.toCharArray();
		Arrays.sort(charArray);

		target = nextInt();

		int[] seed = IntStream.range(0,S.length()).toArray();
		int[] perm = new int[S.length()];
		boolean[] used = new boolean[S.length()];
		allPerm(perm,seed,used,0);
		System.out.println(ans);
	}

	public static void allPerm(int[] perm,int[] seed, boolean[] used,int idx) {
		if(idx == perm.length) {
			// パターン作成終わり、問題用の処理
			solve(perm,seed);
			return;
		}
		for(int i = 0; i < perm.length; i++) {
			if(used[i]) {
				continue;
			}
			perm[idx] = seed[i];
			used[i] = true;
			allPerm(perm,seed,used,idx+1);
			used[i] = false;
		}
	}

	public static void solve(int[] perm,int[] seed) {
		StringBuilder sb = new StringBuilder();
		for(int num: perm) {
			sb.append(charArray[seed[num]]);
		}
		String sbStr = sb.toString();

		if(!permSet.contains(sbStr)) {
			permSet.add(sbStr);
		}
		if(permSet.size() == target) {
			ans = sb.toString();
		}
	}
}
