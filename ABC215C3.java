
import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class ABC215C3 {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static String N;
	static int target;
	static int cnt = 0;
	static String ans = "";
	static char[] charArray;
	static HashSet<String> set = new HashSet<>();

	public static void main(String[] args) {
		N = sc.next();
		target = nextInt();
		charArray = N.toCharArray();
		Arrays.sort(charArray);
		int[] perm = new int[N.length()];
		int[] seed = IntStream.range(0, N.length()).toArray();
		boolean[] isUsed = new boolean[N.length()];
		allPerm(0, perm,seed ,isUsed);
		System.out.println(ans);

	}

	static void allPerm(int idx, int[] perm,int[] seed, boolean[] isUsed) {
		if (idx == N.length()) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < N.length(); i++) {
				sb.append(charArray[perm[i]]);
			}
			if(set.contains(sb.toString())) {
				return;
			} else {
				set.add(sb.toString());
			}
			cnt++;
			if(cnt == target) {
				ans = sb.toString();
			}
			return;
		}

		for (int i = 0; i < N.length(); i++) {
			if(isUsed[i]) {
				continue;
			}
			perm[idx] = seed[i];
			isUsed[i] = true;
			allPerm(idx+1,perm,seed,isUsed);
			isUsed[i] = false;
		}

	}
}
