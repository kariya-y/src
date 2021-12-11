import java.util.*;

public class ABC229_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long N = nextInt();
		long W = nextInt();
		TreeMap<Long, Long> cheeseTree = new TreeMap<>();

		for (int i = 0; i < N; i++) {
			long a = nextInt();
			long b = nextInt();
			if (cheeseTree.containsKey(a)) {
				long thisB = cheeseTree.get(a);
				cheeseTree.put(a, thisB + b);
			} else {
				cheeseTree.put(a, b);
			}

		}

		long ans = 0;
		while (!cheeseTree.isEmpty()) {
			long thisA = cheeseTree.lastKey();
			long thisB = cheeseTree.get(cheeseTree.lastKey());
			cheeseTree.remove(cheeseTree.lastKey());

			if (W < thisB) {
				ans += W * thisA;
				break;
			}
			ans += thisB * thisA;
			W -= thisB;
		}
		System.out.println(ans);
	}
}
