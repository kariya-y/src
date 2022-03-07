import java.io.PrintWriter;
import java.util.*;

public class ABC236_D {
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
		int N = nextInt() * 2;
		ArrayList<int[]> list = new ArrayList<>();

		for(int i = 0; i < N-1; i++) {
			int[] nums = new int[N-1-i];
			for(int ii = 0; ii < N -1 -i; ii++) {
				nums[ii] = nextInt();
			}
			list.add(nums);
		}

		int loop = (N-1)*N/(2);

		for(int i = 0; i < loop;i++) {

		}

	}
}
