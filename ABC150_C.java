import java.util.*;
import java.util.stream.IntStream;

public class ABC150_C {
	static Scanner sc = new Scanner(System.in);
	static int[] pArray;
	static int[] qArray;
	static int pOrder;
	static int qOrder;
	static int cnt;

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		pArray = new int[N];
		qArray = new int[N];

		for(int i = 0; i < N; i++) {
			pArray[i] = nextInt();
		}

		for(int i = 0; i < N; i++) {
			qArray[i] = nextInt();
		}

		int[] perm = new int[N];
		int[] seed = IntStream.range(1,N+1).toArray();
		boolean[] used = new boolean[N];
		cnt = 0;
		allPerm(perm,seed,used,0);
		System.out.println(Math.abs(pOrder-qOrder));

	}

	static void allPerm(int[] perm, int[] seed, boolean[] used, int idx) {
		if(idx == perm.length) {
			cnt++;
			solve(perm);
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

	static void solve(int[] perm) {
		boolean isP = true;
		boolean isQ = true;
		for(int i = 0; i < perm.length; i++) {
			if(perm[i] != pArray[i]) {
				isP = false;
			}
		}
		for(int i = 0; i < perm.length; i++) {
			if(perm[i] != qArray[i]) {
				isQ = false;
			}
		}

		if(isP) {
			pOrder = cnt;
		}

		if(isQ) {
			qOrder = cnt;
		}

	}
}

