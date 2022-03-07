import java.util.*;
import java.util.stream.IntStream;

public class ABC054_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static ArrayList<int[]> edgeList;
	static int ans;

	public static void main(String[] args) {
		int N = nextInt();
		int M = nextInt();

		edgeList = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			int[] edge = { nextInt(), nextInt() };
			edgeList.add(edge);
		}
		int[] perm = new int[N];
		perm[0] = 1;
		int[] seed = IntStream.range(1, N + 1).toArray();
		boolean[] used = new boolean[N];
		allPerm(perm, seed, used, 1);
		System.out.println(ans);
	}

	static void allPerm(int[] perm, int[] seed, boolean[] used, int idx) {
		if (perm.length == idx) {
			solve(perm);
			return;
		}

		for (int i = 1; i < perm.length; i++) {
			if (used[i]) {
				continue;
			}
			perm[idx] = seed[i];
			used[i] = true;
			allPerm(perm, seed, used, idx + 1);
			used[i] = false;
		}
	}

	static void solve(int[] perm) {
		int start = perm[0];
		int cnt = 0;
		for (int i = 1; i < perm.length; i++) {
			int next = perm[i];
			for (int[] edge : edgeList) {
				int edgeStart = edge[0];
				int edgeNext = edge[1];

				if (start == edgeStart || start == edgeNext) {
					if (next == edgeStart || next == edgeNext) {
						cnt++;
						break;
					}
				}
			}
			start = next;
		}
		if (cnt == perm.length - 1) {
			ans++;
		}
	}
}
