import java.util.*;
import java.util.Map.Entry;

public class ABC206_C {
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
		long max = 0;
		long minus = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < N ;i++) {
			int num = nextInt();
			if(!map.containsKey(num)) {
				map.put(num, 0);
			} else {
				minus+=map.get(num)+1;
				map.put(num, map.get(num)+1);
			}
			max+=i;
		}

		System.out.println(max-minus);
	}
}


