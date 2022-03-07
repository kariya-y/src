import java.util.*;

public class ABC233_D {
	static Scanner sc = new Scanner(System.in);

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
		long L = nextLong();

		int cnt = 0;
		int[] array = new int[N];
		HashMap<Long, Integer> map = new HashMap<>();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			array[i] = nextInt();
			sum += array[i];
			if (sum == L ) {
				cnt++;
			}

			if (map.containsKey(sum)) {
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum, 1);
			}

			long minus = sum - L;
			if(map.containsKey(minus)) {
				cnt += map.get(minus);
			}
		}
		System.out.println(cnt);
	}
}
