import java.util.*;
import java.util.stream.IntStream;

public class ABC232_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static ArrayList<int[]> orgList = new ArrayList<>();
	static ArrayList<int[]> targetList = new ArrayList<>();
	static boolean resultFlg;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = nextInt(); // ボール
		int M = nextInt(); // 線

		for (int i = 0; i < M; i++) {
			int[] edge = { nextInt(), nextInt() };
			orgList.add(edge);
		}
		for (int i = 0; i < M; i++) {
			int[] edge = { nextInt(), nextInt() };
			targetList.add(edge);
		}

		int[] perm = new int[N];
		int[] seed = IntStream.range(1, N + 1).toArray();
		boolean[] used = new boolean[N];
		int idx = 0;
		allPerm(perm, seed, used, idx);

		if (resultFlg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static void allPerm(int[] perm, int[] seed, boolean[] used, int idx) {
		if (idx == perm.length) {
			proc(perm);
			return;
		}

		for (int i = 0; i < perm.length; i++) {
			if (used[i]) {
				continue;
			}
			perm[idx] = seed[i];
			used[i] = true;
			allPerm(perm, seed, used, idx + 1);
			used[i] = false;
		}
	}

	static void proc(int[] perm) {

		boolean[] used = new boolean[targetList.size()];
		for (int i = 0; i < orgList.size(); i++) {
			int[] orgEdge = orgList.get(i);
			int[] permEdge = { perm[orgEdge[0] - 1], perm[orgEdge[1] - 1] };

			for (int ii = 0; ii < targetList.size(); ii++) {
				if (used[ii]) {
					continue;
				}
				int[] targetEdge = targetList.get(ii);

				if (targetEdge[0] == permEdge[0] && targetEdge[1] == permEdge[1]) {
					used[ii] = true;
					break;
				}

				if (targetEdge[0] == permEdge[1] && targetEdge[1] == permEdge[0]) {
					used[ii] = true;
					break;
				}
			}
		}

		int cnt = 0;
		for(int i = 0; i < used.length; i++) {
			if(used[i]) {
				cnt++;
			}
		}
		if(cnt == used.length) {
			for(int i : perm) {
				System.out.print(i+" ");
			}
			resultFlg = true;
		}
	}
}
