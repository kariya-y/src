import java.util.*;

public class ABC217_D {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		int L = nextInt();
		int N = nextInt();
		TreeSet<Integer> cutSet = new TreeSet<>();
		cutSet.add(0);
		cutSet.add(L);
		for (int i = 0; i < N; i++) {
			int c = nextInt();
			int x = nextInt();

			if (c == 1) {
				cutSet.add(x);
				continue;
			}

			if (c == 2) {
				int ans = cutSet.higher(x) - cutSet.lower(x);
				System.out.println(ans);
			}
		}
	}
}
