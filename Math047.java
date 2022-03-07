
import java.util.*;
import java.io.*;

public class Math047 {
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
	static boolean ansFlg;

	public static void main(String[] args) {
		int N = nextInt();
		int M = nextInt();
		ansFlg = true;

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		for (int i = 0; i < M; i++) {
			if (ansFlg == false) {
				break;
			}
			int a = nextInt();
			int b = nextInt();
			boolean[] isSerch = new boolean[N + 1];
			if (map.containsKey(a)) {
				ArrayList<Integer> list = map.get(a);
				list.add(b);
				map.put(a, list);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(b);
				map.put(a, list);
			}

			if (map.containsKey(b)) {
				ArrayList<Integer> list = map.get(b);
				list.add(a);
				map.put(b, list);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(a);
				map.put(b, list);
			}

			solve(map, a, a, b, isSerch);
		}
		if (ansFlg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static void solve(HashMap<Integer, ArrayList<Integer>> map, int key, int targetA, int targetB,
			boolean[] isSerch) {
		isSerch[key] = true;
		ArrayList<Integer> list = map.get(key);
		if (list.contains(targetA) && list.contains(targetB)) {
			ansFlg = false;
		}

		for (int num : list) {
			if (isSerch[num]) {
				return;
			}
			solve(map, num, targetA, targetB, isSerch);
		}
	}
}
