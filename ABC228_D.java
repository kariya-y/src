import java.util.*;

public class ABC228_D {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = 1048576;
		int Q = nextInt();
		int[] A = new int[N];
		Arrays.fill(A,-1);

		for(int i = 0; i < Q; i++) {
			int t = nextInt();
			int x = nextInt();
			if(t == 1) {
				int h = x;
				int mod = x % N;
				while(A[mod] != -1) {
					mod++;
				}
				A[mod] = h;
			}
			if(t == 2) {
				System.out.println(A[x%N]);
			}
		}
	}
}
