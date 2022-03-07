import java.io.PrintWriter;
import java.util.*;

public class Math011 {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = nextInt();

		System.out.print(2);

		for (int i = 3; i <= N; i++) {
			solve(i);
		}
	}

	public static void solve(int num) {
		for(int i = 2 ; i <= num /2 ; i++) {
			int mod = num % i;
			if(mod == 0 ) {
				return;
			}
		}
		System.out.print(" "+num);
	}
}
