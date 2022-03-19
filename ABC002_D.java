
import java.util.*;
import java.io.*;

public class ABC002_D {
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
		int N = nextInt();
		HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			HashSet<Integer> hashSet = new HashSet<Integer>();
			hashMap.put(i, hashSet);
		}

		int M = nextInt();

		for (int i = 0; i < M; i++) {
			int x = nextInt();
			int y = nextInt();
			hashMap.get(x).add(y);
			hashMap.get(y).add(x);
		}

		int ans = 0;
		for (int i = 1; i <= N; i++) {
			HashSet<Integer> hashSet = hashMap.get(i);
			ArrayList<Integer> list = new ArrayList<>();
			for (int num : hashSet) {
				if (list.size() == 0) {
					list.add(num);
					continue;
				}
				for (int ii = 0; ii < list.size(); ii++) {
					int listNum = list.get(ii);
					HashSet<Integer> listHashSet = hashMap.get(listNum);
					if (listHashSet.contains(num)) {
						if (ii == list.size() - 1) {
							list.add(num);
						}
					} else {
						break;
					}
				}
			}
			ans = Math.max(ans, list.size());
		}
		System.out.println(1 + ans);
	}
}
