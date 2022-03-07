
import java.util.*;
import java.io.*;

public class ABC241_D {
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

	public static void main(String[] args) {
		TreeMap<Long, Integer> treeMap = new TreeMap<>();

		long N = nextInt();
		for (int i = 0; i < N; i++) {
			int q = nextInt();
			long x = nextLong();
			if (q == 1) {
				if (treeMap.containsKey(x)) {
					treeMap.put(x, treeMap.get(x) + 1);
				} else {
					treeMap.put(x, 1);
				}
				continue;
			}

			Long key = null;
			int k = nextInt();

			if (q == 2) {
				key = treeMap.floorKey(x);
				while (0 < k && key != null) {
					int cnt = treeMap.get(key);
					if (k <= cnt) {
						break;
					} else {
						k -= treeMap.get(key);
						key = treeMap.lowerKey(key);
					}
				}
			}

			if (q == 3) {
				key = treeMap.ceilingKey(x);
				if (key == null) {
					System.out.println(-1);
					continue;
				}
				while (0 < k && key != null) {
					int cnt = treeMap.get(key);
					if (k <= cnt) {
						break;
					} else {
						k -= treeMap.get(key);
						key = treeMap.higherKey(key);
					}
				}
			}

			if (key == null) {
				System.out.println(-1);
			} else {
				System.out.println(key);
			}

		}

	}
}
