import java.util.*;

public class ABC234_D {
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
		int K = nextInt();
		Queue<Integer> q = new PriorityQueue<Integer>();

		for(int i = 0; i < K-1;i++) {
			q.add(nextInt());
		}

		for(int i = 0; i <= N-K;i++) {
			q.add(nextInt());
			Object[] numbers = q.toArray();
			System.out.println(numbers[numbers.length-K]);
		}

	}

}
