import java.util.*;

public class ABC176_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		long steps = 0;
		int max = 0;
		for(int i = 0; i < N ; i++) {
			int num = nextInt();
			if(num < max) {
				steps += max -num;
			} else {
				max = num;
			}
		}
		System.out.println(steps);
	}
}
