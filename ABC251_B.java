
import java.util.*;
import java.io.*;

public class ABC251_B {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = nextInt(sc);
		int W = nextInt(sc);

		int[] numArray = new int[N];
		for (int i = 0; i < N; i++) {
			numArray[i] = nextInt(sc);
		}

		HashSet<Integer> set = new HashSet();
		for (int i = 0; i < N; i++) {
			int sum = numArray[i];
			if (sum <= W) {
				set.add(sum);
			}
			for (int ii = i + 1; ii < N; ii++) {
				int sum2 = sum + numArray[ii];
				if (sum2 <= W) {
					set.add(sum2);
				}
				for (int iii = ii + 1; iii < N; iii++) {
					int sum3 = sum2 + numArray[iii];
					if (sum3 <= W) {
						set.add(sum3);
					}
				}
			}
		}
		System.out.println(set.size());
	}
}
