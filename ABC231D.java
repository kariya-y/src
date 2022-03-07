import java.util.*;

public class ABC231D {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		int M = nextInt();

		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < M;i++) {
			int numL = nextInt();
			int numR = nextInt();
			if(map.containsKey(numL)) {
				int cnt = map.get(numL);
				if(2 <= cnt) {
					System.out.println("No");
					return;
				}
				map.put(numL, map.get(numL)+1);
			} else {
				map.put(numL,1);
			}

			if(map.containsKey(numR)) {
				int cnt = map.get(numR);
				if(2 <= cnt) {
					System.out.println("No");
					return;
				}
				map.put(numR, map.get(numR)+1);
			} else {
				map.put(numR,1);
			}

		}
		System.out.println("Yes");
	}
}
